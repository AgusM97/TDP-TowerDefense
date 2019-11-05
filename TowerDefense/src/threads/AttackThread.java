package threads;

import Game.Game;
import Game.Unit;

public class AttackThread extends Thread {
	protected Unit u;
	protected int speed;

	public AttackThread(Unit unit, int speed) {
		u = unit;
		this.speed = speed;
	}
	
	public void run() {
		while(u.isAttacking() && !Game.getInstance().isGameOver()) {
			Game.getInstance().addProyectile(u.attack());
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {e.printStackTrace();	}
		}
	}
	
	public void changeSpeed(int newSpeed) {
		speed = newSpeed;
	}

}
