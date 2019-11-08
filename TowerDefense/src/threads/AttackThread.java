package threads;

import Game.Game;
import Game.Unit;

/**
 * Hilo de ataque correpondiente a un unidad
 *
 */
public class AttackThread extends Thread {
	protected Unit u;
	protected int speed;

	/**
	 * 
	 * @param unit Unidad atacante
	 * @param speed Velocdidad de ataque (ms)
	 */
	public AttackThread(Unit unit, int speed) {
		u = unit;
		this.speed = speed;
	}
	
	public void run() {
		while(u.isAttacking() && !Game.getInstance().isGameOver()) {
			u.attack();
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {e.printStackTrace();	}
		}
	}
	
	/**
	 * Cambia la velocidad de atque
	 * @param newSpeed
	 */
	public void changeSpeed(int newSpeed) {
		speed = newSpeed;
	}

}
