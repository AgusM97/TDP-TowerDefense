package threads;

import java.util.LinkedList;
import java.util.Random;

import Game.Game;
import MapObjects.MapItem;
import factories.EnemyFactory;
import factories.MapItemFactory;

public class EnemyThread extends Thread {
	
	protected Random r = new Random();
	protected LinkedList<MapItem> mapItemList = new LinkedList<MapItem>();
	
	public void run() {
		try {
			
		for(int level = 0; level < Game.getInstance().niveles().size() && !Game.getInstance().isGameOver(); level++) {

			//elimina las trampas existentes
			for(MapItem i:mapItemList)
				i.die();
			mapItemList.clear();
			
			//genera trampas
			for(int i=0; i<3; i++) {
				mapItemList.add(MapItemFactory.getMapItem());
				Game.getInstance().addUnit(mapItemList.getLast());
			}
				
			
			
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
