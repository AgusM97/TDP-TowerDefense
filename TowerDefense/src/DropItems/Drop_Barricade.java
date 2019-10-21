package DropItems;

import graphics.DropItemGraphic;
import graphics.ProyectileGraphic;

public class Drop_Barricade extends Drop{
	
	public Drop_Barricade(int x, int y, int width, int height) {
		super(x,y,width,height);
		graphic = new DropItemGraphic(this, "/img/CorpsePile.png");
	}

}
