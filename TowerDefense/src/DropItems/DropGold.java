package DropItems;

import graphics.DropItemGraphic;

public class DropGold extends Drop{
	
	public DropGold(int x, int y, int width, int height) {
		super(x,y,width,height);
		graphic = new DropItemGraphic(this, "/img/Drop_Gold.png");
	}

}
