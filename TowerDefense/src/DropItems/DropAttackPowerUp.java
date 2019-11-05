package DropItems;

import visitor.DropAttackPowerUpVisitor;

@SuppressWarnings("serial")
public class DropAttackPowerUp extends Drop{
	
	protected DropAttackPowerUpVisitor visitor;
	
	public DropAttackPowerUp(int x, int y) {
		super(x,y+20,60,60,"/img/Drop_AttackPowerUp.png");
	}

	@Override
	public void performAction() {
		// TODO Auto-generated method stub
		
	}

}
