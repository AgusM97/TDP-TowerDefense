package factories;

import java.util.Random;

import MapObjects.MapItem;
import MapObjects.MapItemHole;
import MapObjects.MapItemSpikeTrap;


public class MapItemFactory {

	/**
	 * Genera un nuevo objeto de mapa en una casilla al azar
	 * @return
	 */
	public static MapItem getMapItem() {
		
		Random r = new Random();
		 
		switch (r.nextInt(2)) {
		
		case 0:
			return new MapItemHole(r.nextInt(9), r.nextInt(7)+1);
		case 1:
			return new MapItemSpikeTrap(r.nextInt(9), r.nextInt(7)+1);
		default:
			return null;
		}
		
	}

	
}
