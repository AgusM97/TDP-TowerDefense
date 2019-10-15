package Game;

import java.util.LinkedList;
import Characters.*;
import Proyectile.Proyectile;
import gui.GUI;


public class Game {
	protected static Game instance = null;
	protected Map map;
	protected int points;
	protected LinkedList<Enemy> enemyList;
	protected LinkedList<Tower> towerList;
	protected LinkedList<Proyectile> proyectileList;
	protected Level level;
	protected GUI gui;

	
	//SINGLETON
	private Game(GUI g) {
		enemyList = new LinkedList<>();
		towerList = new LinkedList<>();
		proyectileList = new LinkedList<>();
		points=0;
		map = new Map();
		gui = g;
		gui.add(map.getGrafico(), new Integer(0));
		
		Thread updater = new UpdaterThread();
		updater.start();
	}
	
	public static void startNewGame(GUI g) {
		instance = new Game(g);
	}
	
	public static Game getInstance() {
		return instance;
	}
	
	public void addEnemy(Enemy e) {
		enemyList.add(e);
		gui.add(e.getGraphic(), new Integer(1));
	}

	public void addTower(Tower t) {
		towerList.add(t);
		gui.add(t.getGraphic(), new Integer(1));
	}

	public void addProyectile(Proyectile p) {
		proyectileList.add(p);
		gui.add(p.getGraphic(), new Integer(2));
	}

	public void update() {
		
		LinkedList<Enemy> toRemove = new LinkedList<>();
		boolean towerInRange;
		for(Enemy e: enemyList) { //recorro todos los enemigos
			
			if(e.isDead() || e.getX() >= 960) { //si el enemigo no tiene mas vida o llego al final lo elimina
				if(e.isDead()) points += e.getPoints();
				gui.remove(e.getGraphic());
				toRemove.add(e);
			}
			
			else { //sino recorro la lista de torres
				towerInRange = false;
				for(Tower t: towerList) {
					
					 // si la torre esta dentro del rango
					 // del enemigo, este pasa a "modo ataque"
					 
					if(e.isInRange(t)) {
						e.startAttacking();
						towerInRange = true;
						break;
					}
				}
				if(!e.isAttacking())//si no esta atacando se mueve
					e.move();
				else if(!towerInRange) {
					e.stopAttacking();
					e.move();
				}
			}
		}
		enemyList.removeAll(toRemove);

		
		
		boolean enemyInRange;
		for(Tower t:towerList) {
			enemyInRange = false;
			for(Enemy e: enemyList)
				if(t.isInRange(e)) {
					if(!t.isAttacking())
						t.startAttacking();
					enemyInRange = true;
					break;
				}
			if(!enemyInRange && t.isAttacking()) {
				t.stopAttacking();
			}
		}
		
		gui.update(points);
	}

	
	
	public void proyectileUpdate() {
		
		LinkedList<Proyectile> toRemove = new LinkedList<>();
		
		for(Proyectile p:proyectileList) {
			p.move();
			
			for(Enemy e:enemyList) {
				if(p.intersects(e))
					e.accept(p.getVisitor());
			}
			
			if(p.isSpent() || p.maxRange()) {
				gui.remove(p.getGraphic());
				toRemove.add(p);
			}
		}
		
		proyectileList.removeAll(toRemove);
	}

}
