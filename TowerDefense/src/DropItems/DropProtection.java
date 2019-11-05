package DropItems;

import visitor.DropProtectionVisitor;

@SuppressWarnings("serial")
public class DropProtection extends Drop{
	protected DropProtectionVisitor visitor;
	
	public DropProtection(int x, int y) {
		super(x,y,60,60,"/img/Drop_Protection.png");
	}

	@Override
	public void performAction() {
		// TODO Auto-generated method stub
		
	}

}
