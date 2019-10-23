package DropItems;

import graphics.DropItemGraphic;
import visitor.DropAttackSpeedUpVisitor;

public class DropAttackSpeedUp extends Drop{
	
	protected DropAttackSpeedUpVisitor visitor;
	
	public DropAttackSpeedUp(int x, int y, int width, int height) {
		super(x,y,width,height);
		graphic = new DropItemGraphic(this, "/img/Drop_AttackSpeedUp.png");
	}

}
