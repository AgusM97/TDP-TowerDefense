package MapObjects;

import graphics.MapItemGraphic;

public class MapItemSpikeTrap extends MapItem {
	
	protected int damage = 0; //poner daño.
	
	public MapItemSpikeTrap(int x, int y, int width, int height) {
		super(x,y,width,height);
		graphic = new MapItemGraphic(this, "/img/Empty.png");//Cambiar imagen por una tile con pinchos.
	}

}
