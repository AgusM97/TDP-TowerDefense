package Game;

import java.util.LinkedList;
import java.util.Random;

import Characters.*;
import Proyectile.Proyectile;
import gui.GUI;
import gui.MapPanel;


public class Game {
	protected static Game instance = null;
	protected Map map;
	protected int points;
	protected LinkedList<Unit> unitList;
	protected LinkedList<Unit> auxUnitList;
	protected LinkedList<Proyectile> proyectileList;
	protected LinkedList<Proyectile> auxProyectileList;
	protected Level level;
	protected GUI gui;

	
	//SINGLETON
	private Game(GUI g) {
		unitList = new LinkedList<>();
		proyectileList = new LinkedList<>();
		auxUnitList = new LinkedList<>();
		auxProyectileList = new LinkedList<>();
		points=0;
		map = new Map();
		gui = g;
		gui.add(map.getGrafico(), new Integer(0));
		
		Thread updater = new UpdaterThread();
		updater.start();
		Thread hiloEnemigo = new EnemyThread();
		hiloEnemigo.start();
		
	}
	
	public static void startNewGame(GUI g) {
		instance = new Game(g);
	}
	
	public static Game getInstance() {
		return instance;
	}
	
	public void addPoints(int p) {
		points += p;
	}
	
	public void addEnemy(Enemy e) {
		auxUnitList.add(e);
		gui.add(e.getGraphic(), new Integer(1));
	}

	public void addTower(Tower t) {
		boolean posAvailable=true;
		for(Unit u:unitList) {
			if(u.intersects(t)) {
				posAvailable = false;
				break;
			}
		}
		if(posAvailable) {
			auxUnitList.add(t);
			gui.add(t.getGraphic(), new Integer(1));
		}
	}

	public void addProyectile(Proyectile p) {
		auxProyectileList.add(p);
		gui.add(p.getGraphic(), new Integer(2));
	}
	
	public GUI gui() {
		
		return this.gui;
	}
	
	public void generarEnemigo() {
		
		Random tipoEnemigo = new Random();
		Random posicion = new Random();
		 
		switch (tipoEnemigo.nextInt(6)) {
		
		case 0:
			Game.getInstance().addEnemy(new DragonKing(posicion.nextInt(7)+1));
			break;
		case 1:
			//Game.getInstance().addEnemy(new FloraBeast(posicion.nextInt(7)+1));
			break;
		case 2:
			Game.getInstance().addEnemy(new Orc(posicion.nextInt(7)+1));
			break;
		case 3:
			Game.getInstance().addEnemy(new Prinny(posicion.nextInt(7)+1));
			break;
		case 4:
			Game.getInstance().addEnemy(new Succubus(posicion.nextInt(7)+1));
			break;
		case 5:
			Game.getInstance().addEnemy(new TwinDragon(posicion.nextInt(7)+1));
			break;
		case 6:
			Game.getInstance().addEnemy(new WingedWarrior(posicion.nextInt(7)+1));
			break;
		}
		
	}
		
	

	
	
	public void update() {
		
		unitList.addAll(auxUnitList);
		auxUnitList.clear();
		
		LinkedList<Unit> toRemove = new LinkedList<>();
		
		for(Unit u1:unitList) {
			if(u1.getLife() <= 0) { //unidad esta muerta y se debe remover
				u1.die();
				MapPanel.getInstance().remove(u1.getGraphic());
				toRemove.add(u1);
			}
			
			else {
				for(Unit u2:unitList) {
					if(u1.isInRange(u2)) {
						u2.accept(u1.getVisitor());
						if(u1.hasOpponentInRange())
							break;
					}
				}
				
				if(!u1.hasOpponentInRange() && u1.isAttacking())
					u1.stopAttacking();
				
				if(!u1.isAttacking())
					u1.move();

				u1.setOpponentInRange(false); //resetea el valor para el prox recorrido
			}
		}
		
		unitList.removeAll(toRemove);
		toRemove.clear();
		gui.update(points);
	}

	
	
	public void proyectileUpdate() {
		
		proyectileList.addAll(auxProyectileList);
		auxProyectileList.clear();
		
		LinkedList<Proyectile> toRemove = new LinkedList<>();
		
		for(Proyectile p:proyectileList) {
			if(p == null)
				continue;
			
			p.move();
			
			for(Unit u:unitList) {
				if(p.intersects(u))
					u.accept(p.getVisitor());
			}
			
			if(p.isSpent() || p.maxRange()) {
				gui.remove(p.getGraphic());
				toRemove.add(p);
			}
		}
		
		proyectileList.removeAll(toRemove);
		toRemove.clear();
	}

}
