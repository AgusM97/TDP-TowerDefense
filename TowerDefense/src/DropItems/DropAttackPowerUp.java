package DropItems;

import graphics.DropItemGraphic;

public class DropAttackPowerUp extends Drop{
	
	public DropAttackPowerUp(int x, int y, int width, int height) {
		super(x,y,width,height);
		graphic = new DropItemGraphic(this, "/img/Drop_AttackPowerUp.png");
	}

}
