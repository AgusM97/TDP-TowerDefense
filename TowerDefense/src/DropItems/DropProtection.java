package DropItems;

import graphics.DropItemGraphic;

public class DropProtection extends Drop{
	
	public DropProtection(int x, int y, int width, int height) {
		super(x,y,width,height);
		graphic = new DropItemGraphic(this, "/img/Drop_Protection.png");
	}

}
