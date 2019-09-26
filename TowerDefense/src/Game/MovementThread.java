package Game;

import java.util.LinkedList;
import java.util.Random;

import Characters.Enemy;

public class MovementThread extends Thread {
	protected LinkedList<Enemy> enemyList;

	public MovementThread(LinkedList<Enemy> enemyList) {
		super();
		this.enemyList = enemyList;
	}
	
	public void run() {
		Random r = new Random();
		while(true) {
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {e.printStackTrace();}
			
			for(Enemy e:enemyList)
				e.move(r.nextInt(3));
		}
	}

}
