package threads;

import java.util.Random;

import Game.Game;
import factories.EnemyFactory;

public class EnemyThread extends Thread {
	
	Random r = new Random();
	
	public void run() {
		try {
			
		for(int level = 0; level < Game.getInstance().niveles().size() && !Game.getInstance().isGameOver(); level++) {
			Thread.sleep(5000);
			
			for(int wave=0; wave<Game.getInstance().niveles().get(level).Oleadas().size(); wave++) {
				Thread.sleep(5000);
				
				for(int i=0; i<Game.getInstance().niveles().get(level).Oleadas().get(wave).cantEnemigos(); i++) {
					Game.getInstance().addEnemy(EnemyFactory.getEnemy());
					Thread.sleep((r.nextInt(5)+2)*1000);
					if(Game.getInstance().isGameOver())
						break;
				}
				
				

				if(Game.getInstance().isGameOver())
					break;
				
				
			}
			//Thread.sleep(5000);
			
			

			if(Game.getInstance().isGameOver())
				break;
		}
		
		Game.getInstance().incrementarNivel();	
		
		Game.getInstance().noMoreLevels();
		//Thread.sleep(10000);
		
		} catch (InterruptedException e) {e.printStackTrace();}
	}

}
