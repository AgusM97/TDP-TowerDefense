package DropItems;

import graphics.DropItemGraphic;

public class DropAttackSpeedUp extends Drop{
	
	public DropAttackSpeedUp(int x, int y, int width, int height) {
		super(x,y,width,height);
		graphic = new DropItemGraphic(this, "/img/Drop_AttackSpeedUp.png");
	}

}
