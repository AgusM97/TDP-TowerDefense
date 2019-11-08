package visitor;

import DropItems.DropAttackSpeedUp;
import MapObjects.MapItemHole;
import MapObjects.MapItemSpikeTrap;
import ShopObjects.ShopItemBarricade;
import ShopObjects.ShopItemHealer;
import enemies.Enemy;
import towers.Tower;

public class DropAttackSpeedUpVisitor extends Visitor{
	
	protected DropAttackSpeedUp item;
	
	public DropAttackSpeedUpVisitor(DropAttackSpeedUp drop) {
		this.item=drop;
	}

	public void visit(Tower t) {
		t.buff(item);
	}
	
		
	public void visit(Enemy t) {}

	public void visit(MapItemHole h) {}

	public void visit(MapItemSpikeTrap s) {}

	public void visit(ShopItemBarricade b) {}

	public void visit(ShopItemHealer h) {}

}
