package visitor;

import MapObjects.MapItemHole;
import MapObjects.MapItemSpikeTrap;
import ShopObjects.ShopItemBarricade;
import ShopObjects.ShopItemHealer;
import enemies.Enemy;
import towers.Tower;

public class SpikeVisitor extends Visitor {
	protected MapItemSpikeTrap s;

	public SpikeVisitor(MapItemSpikeTrap mapItemSpikeTrap) {
		s = mapItemSpikeTrap;
	}

	
	
	public void visit(Tower t) {
		if(!t.isAerial()) {
			t.receiveDamage(s.getDamage());
			s.receiveDamage(1);
		}
	}

	public void visit(Enemy t) {
		if(!t.isAerial()) {
			t.receiveDamage(s.getDamage());
			s.receiveDamage(1);
		}

	}

	public void visit(MapItemHole h) {}

	public void visit(MapItemSpikeTrap s) {}

	public void visit(ShopItemBarricade b) {}

	public void visit(ShopItemHealer h) {}

}
