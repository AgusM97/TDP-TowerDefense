package threads;

import Game.Game;
import enemies.TwinDragon;

public class DragonAttackThread extends AttackThread{

	protected TwinDragon u;

	public DragonAttackThread(TwinDragon unit, int speed) {
		super(unit, speed);
		u=unit;
	}
	
	public void run() {
		while(u.isAttacking() && !Game.getInstance().isGameOver()) {
			Game.getInstance().addProyectile(u.attack());
			Game.getInstance().addProyectile(u.attack2());
			try {
				Thread.sleep(speed);
			} catch (InterruptedException e) {e.printStackTrace();	}
		}
	}

}
