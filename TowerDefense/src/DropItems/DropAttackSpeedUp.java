package DropItems;

import visitor.DropAttackSpeedUpVisitor;

@SuppressWarnings("serial")
public class DropAttackSpeedUp extends Drop{
	
	protected DropAttackSpeedUpVisitor visitor;
	
	public DropAttackSpeedUp(int x, int y) {
		super(x,y,60,60,"/img/Drop_AttackSpeedUp.png");
	}

	@Override
	public void performAction() {
		// TODO Auto-generated method stub
		
	}

}
