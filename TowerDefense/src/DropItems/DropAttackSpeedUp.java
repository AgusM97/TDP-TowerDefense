package DropItems;

import graphics.DropItemGraphic;
import visitor.DropAttackSpeedUpVisitor;

public class DropAttackSpeedUp extends Drop{
	
	protected DropAttackSpeedUpVisitor visitor;
	
	public DropAttackSpeedUp(int x, int y) {
		super(x,y,60,60,"/img/Drop_AttackSpeedUp.png");
	}

}
