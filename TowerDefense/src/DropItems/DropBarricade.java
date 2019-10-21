package DropItems;

import graphics.DropItemGraphic;


public class DropBarricade extends Drop{
	
	public DropBarricade(int x, int y, int width, int height) {
		super(x,y,width,height);
		graphic = new DropItemGraphic(this, "/img/CorpsePile.png");
	}

}




