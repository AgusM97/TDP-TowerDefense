package DropItems;

import graphics.DropItemGraphic;
import visitor.DropProtectionVisitor;

public class DropProtection extends Drop{
	protected DropProtectionVisitor visitor;
	
	public DropProtection(int x, int y) {
		super(x,y,60,60,"/img/Drop_Protection.png");
	}

}
