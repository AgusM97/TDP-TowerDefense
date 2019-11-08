package MapObjects;

import graphics.MapItemGraphic;

public class MapItemSpikeTrap extends MapItem {
	
	protected int damage = 10; //poner da�o.
	
	public MapItemSpikeTrap(int x, int y, int width, int height) {
		super(x,y,width,height);
		graphic = new MapItemGraphic(this, "/img/Spikes.png");
	}
	
public int getDamage() {
		
		return damage;
	}


}
