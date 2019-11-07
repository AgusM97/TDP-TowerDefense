package DropItems;

import visitor.DropAttackPowerUpVisitor;
import visitor.Visitor;
import Game.Game;

@SuppressWarnings("serial")
public class DropAttackPowerUp extends Drop{
	
	protected DropAttackPowerUpVisitor visitor;
	
	public DropAttackPowerUp(int x, int y) {
		super(x,y+20,60,60,"/img/Drop_AttackPowerUp.png");
		visitor = new DropAttackPowerUpVisitor(this);
	}

	public void performAction() {
		Game.getInstance().applyPowerUp(this);
	}
	
	public Visitor getVisitor() {
		return visitor;
	}

}
