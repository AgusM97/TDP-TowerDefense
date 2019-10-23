package DropItems;

import graphics.DropItemGraphic;
import visitor.DropAttackPowerUpVisitor;

public class DropAttackPowerUp extends Drop{
	
	protected DropAttackPowerUpVisitor visitor;
	
	public DropAttackPowerUp(int x, int y, int width, int height) {
		super(x,y,width,height);
		graphic = new DropItemGraphic(this, "/img/Drop_AttackPowerUp.png");
	}

}
