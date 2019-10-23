package DropItems;

import graphics.DropItemGraphic;
import visitor.DropProtectionVisitor;

public class DropProtection extends Drop{
	protected DropProtectionVisitor visitor;
	
	public DropProtection(int x, int y, int width, int height) {
		super(x,y,width,height);
		graphic = new DropItemGraphic(this, "/img/Drop_Protection.png");
	}

}
