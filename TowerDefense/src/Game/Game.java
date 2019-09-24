package Game;

import java.util.LinkedList;

import javax.swing.JLayeredPane;

import Characters.DarkKnight;
import Characters.Enemy;
import Characters.Orc;
import Characters.Tower;


public class Game {
	protected Map map;
	protected int points;
	protected LinkedList<Enemy> enemyList;
	protected LinkedList<Tower> towerList;
	protected Level level;
	protected JLayeredPane gui;
	
	public Game(JLayeredPane pane) {
		enemyList = new LinkedList<>();
		towerList = new LinkedList<>();
		points=0;
		map = new Map();
		gui = pane;
		gui.add(map.getGrafico(), new Integer(0));
		
		//test
		addEnemy(new Orc(1, 0));
		addEnemy(new Orc(2, 5));
		addTower(new DarkKnight(6, 4));
		
		Thread thread = new ThreadOne(this);
		thread.start();
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
		//System.out.println(points);
		LinkedList<Enemy> toRemove = new LinkedList<>();
		for(Enemy e: enemyList)
			if(e.isDead()) {
				points += e.getPoints();
				gui.remove(e.getGrafico());
				toRemove.add(e);
			}
		enemyList.removeAll(toRemove);
		gui.repaint();
	}
}
