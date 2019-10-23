package Game;

import Characters.Unit;

public class TimerThread extends Thread {
	protected Unit u;
	protected int speed;

	public TimerThread(Unit unit, int speed) {
		u = unit;
		this.speed = speed;
	}
	
	public void run() {
		while(u.isAttacking()) {
			Game.getInstance().addProyectile(u.attack());
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {e.printStackTrace();	}
		}
	}
	
	public void changeSpeed(int newsSpeed) {
		speed = newsSpeed;
	}

}
