package Game;

import java.util.Random;

public class EnemyThread extends Thread {
	
	Random r = new Random();
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(r.nextInt(5)*1000);
			} catch (InterruptedException e) {e.printStackTrace();	}
			Game.getInstance().generarEnemigo();
			
			
		}
	}

}
