package visitor;

import MapObjects.MapItemHole;
import MapObjects.MapItemSpikeTrap;
import ShopObjects.ShopItemBarricade;
import ShopObjects.ShopItemHealer;
import enemies.Enemy;
import towers.Tower;

public class ShopItemHealerVisitor extends Visitor{
	protected ShopItemHealer healer;

	
	public ShopItemHealerVisitor(ShopItemHealer healer) {
		super();
		this.healer = healer;
	}
	

	public void visit(Tower t) {
		t.receiveDamage(healer.getDamage());
		healer.receiveDamage(healer.getDamage());
	}

	public void visit(Enemy t) {}

	public void visit(MapItemHole h) {}

	public void visit(MapItemSpikeTrap s) {}

	public void visit(ShopItemBarricade b) {}

	public void visit(ShopItemHealer h) {}
	

}
