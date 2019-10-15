package Characters;

import Game.Game;

public class TimerThread extends Thread {
	protected Unit u;

	public TimerThread(Unit unit) {
		u = unit;
	}
	
	public void run() {
		while(u.isAttacking()) {
			Game.getInstance().addProyectile(u.attack());
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {e.printStackTrace();	}
		}
	}

}
