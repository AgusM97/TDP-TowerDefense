package DropItems;

import Game.Game;
import visitor.DropAttackSpeedUpVisitor;
import visitor.Visitor;

@SuppressWarnings("serial")
public class DropAttackSpeedUp extends Drop{
	
	protected DropAttackSpeedUpVisitor visitor;
	
	public DropAttackSpeedUp(int x, int y) {
		super(x,y+20,60,60,"/img/Drop_AttackSpeedUp.png");
		visitor = new DropAttackSpeedUpVisitor(this);
	}

	public void performAction() {
		Game.getInstance().applyPowerUp(this);
	}

	public Visitor getVisitor() {
		return visitor;
	}

}
