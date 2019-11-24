package visitor;

import MapObjects.MapItemHole;
import MapObjects.MapItemSpikeTrap;
import ShopObjects.ShopItemBarricade;
import ShopObjects.ShopItemHealer;
import enemies.Enemy;
import enemies.EnemyAerial;
import towers.Tower;

public class HoleVisitor extends Visitor {
	protected MapItemHole item;
	

	public HoleVisitor(MapItemHole item) {
		super();
		this.item = item;
	}

	public void visit(Tower t) {
		t.receiveDamage(10000);
	}

	public void visit(EnemyAerial t) {}

	public void visit(Enemy t) {
		t.receiveDamage(10000);
	}

	public void visit(MapItemHole h) {}

	public void visit(MapItemSpikeTrap s) {}

	public void visit(ShopItemBarricade b) {}

	public void visit(ShopItemHealer h) {}

}
