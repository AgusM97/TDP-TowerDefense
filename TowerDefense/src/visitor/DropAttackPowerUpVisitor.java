package visitor;

import DropItems.DropAttackPowerUp;
import MapObjects.MapItemHole;
import MapObjects.MapItemSpikeTrap;
import ShopObjects.ShopItemBarricade;
import ShopObjects.ShopItemHealer;
import enemies.Enemy;
import enemies.EnemyAerial;
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

	public void visit(ShopItemBarricade b) {}

	public void visit(ShopItemHealer h) {}

	public void visit(EnemyAerial t) {}

}
