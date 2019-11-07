package DropItems;

import Game.Game;
import visitor.DropProtectionVisitor;
import visitor.Visitor;

@SuppressWarnings("serial")
public class DropProtection extends Drop{
	protected DropProtectionVisitor visitor;
	
	public DropProtection(int x, int y) {
		super(x,y,60,60,"/img/Drop_Protection.png");
		visitor = new DropProtectionVisitor(this);
	}

	public void performAction() {
		Game.getInstance().applyPowerUp(this);
	}

	public Visitor getVisitor() {
		return visitor;
	}

}
