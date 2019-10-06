package Game;

import java.util.LinkedList;

import javax.swing.JLayeredPane;

import Characters.DarkKnight;
import Characters.Enemy;
import Characters.Orc;
import Characters.Tower;
import gui.GUI;


public class Game {
	protected Map map;
	protected int points;
	protected LinkedList<Enemy> enemyList;
	protected LinkedList<Tower> towerList;
	protected Level level;
	protected GUI gui;
	
	public Game(GUI g) {
		enemyList = new LinkedList<>();
		towerList = new LinkedList<>();
		points=0;
		map = new Map();
		gui = g;
		gui.add(map.getGrafico(), new Integer(0));
		
			//test
			addEnemy(new Orc(1));
			addEnemy(new Orc(2));
			addEnemy(new Orc(6));
			addTower(new DarkKnight(6, 4));
			addTower(new DarkKnight(8, 6));
			addTower(new DarkKnight(9, 1));
		
		Thread updater = new UpdaterThread(this);
		updater.start();
	}
	
	public void addEnemy(Enemy e) {
		enemyList.add(e);
		gui.add(e.getGrafico(), new Integer(1));
	}
	
	public void addTower(Tower t) {
		towerList.add(t);
		gui.add(t.getGrafico(), new Integer(1));
	}

	public void update() {
		LinkedList<Enemy> toRemove = new LinkedList<>();
		
		for(Enemy e: enemyList) { //recorro todos los enemigos
			
			if(e.isDead()) { //si el enemigo no tiene mas vida lo elimina
				points += e.getPoints();
				gui.remove(e.getGrafico());
				toRemove.add(e);
			}
			
			else { //sino recorro la lista de torres
				for(Tower t: towerList) {
					/*
					 * si la torre esta dentro del rango
					 * del enemigo, este pasa a "modo ataque"
					 */
					if(e.isInRange(t)) {
						e.startAttacking();
						break;
					}
				}
				if(!e.isAttacking()) //si no esta atacando se mueve
					e.move();
							
						
			}
		}
		enemyList.removeAll(toRemove);
		gui.update(points);
	}
}
