package DropItems;

import graphics.DropItemGraphic;

public class DropBomb extends Drop{
	
	public DropBomb(int x, int y, int width, int height) {
		super(x,y,width,height);
		graphic = new DropItemGraphic(this, "/img/Drop_Bomb.png");
	}

}
