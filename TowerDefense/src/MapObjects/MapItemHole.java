package MapObjects;

import graphics.MapItemGraphic;

public class MapItemHole extends MapItem{
	
	protected int damage = 0;//Cambiar daño;
	
	
	public MapItemHole(int x, int y, int width, int height) {
		super(x,y,width,height);
		graphic = new MapItemGraphic(this, "/img/Hole.png");//Cambiar imagen por un tile agujero.
	}

	public int getDamage() {
		
		return damage;
	}

}
