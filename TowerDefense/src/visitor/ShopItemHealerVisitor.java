package visitor;

import MapObjects.MapItemHole;
import MapObjects.MapItemSpikeTrap;
import ShopObjects.ShopItemHealer;
import enemies.Enemy;
import towers.Tower;

public class ShopItemHealerVisitor extends Visitor{
	protected ShopItemHealer healer;

	public void visit(Tower t) {
		t.receiveDamage(healer.getDamage());
		
	}

	public void visit(Enemy t) {}

	public void visit(MapItemHole h) {}

	public void visit(MapItemSpikeTrap s) {}
	

}
