package MapObjects;

import graphics.MapItemGraphic;

public class MapItemHole extends MapItem{
	
	protected int damage = 10000;//Mata de 1;
	
	
	public MapItemHole(int x, int y, int width, int height) {
		super(x,y,width,height);
		graphic = new MapItemGraphic(this, "/img/Hole.png");//Cambiar imagen por un tile agujero.
	}

	public int getDamage() {
		
		return damage;
	}

}
