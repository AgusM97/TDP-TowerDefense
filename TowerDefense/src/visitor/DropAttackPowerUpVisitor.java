package visitor;

import DropItems.DropAttackPowerUp;
import MapObjects.MapItemHole;
import MapObjects.MapItemSpikeTrap;
import enemies.Enemy;
import towers.Tower;

public class DropAttackPowerUpVisitor extends Visitor{
	
	protected DropAttackPowerUp item;
	
	public DropAttackPowerUpVisitor(DropAttackPowerUp drop) {
		this.item=drop;
	}

	public void visit(Tower t) {
		t.buff(item);
	}
	
		
	public void visit(Enemy t) {}

	public void visit(MapItemHole h) {}

	public void visit(MapItemSpikeTrap s) {}

}
