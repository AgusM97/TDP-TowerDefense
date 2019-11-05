package threads;

import java.util.Random;

import Game.Game;
import factories.EnemyFactory;

public class EnemyThread extends Thread {
	
	Random r = new Random();
	
	public void run() {
		try {
			
		for(int level = 0; level<1 && !Game.getInstance().isGameOver(); level++) {
			Thread.sleep(7000);
			
			for(int wave=0; wave<1; wave++) {
				Thread.sleep(5000);
				
				for(int i=0; i<15; i++) {
					Game.getInstance().addEnemy(EnemyFactory.getEnemy());
					Thread.sleep((r.nextInt(5)+2)*1000);
					if(Game.getInstance().isGameOver())
						break;
				}

				if(Game.getInstance().isGameOver())
					break;
			}

			if(Game.getInstance().isGameOver())
				break;
		}
		
		Game.getInstance().noMoreLevels();
		
		} catch (InterruptedException e) {e.printStackTrace();}
	}

}
