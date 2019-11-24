package visitor;

import MapObjects.MapItemHole;
import MapObjects.MapItemSpikeTrap;
import ShopObjects.ShopItemBarricade;
import ShopObjects.ShopItemHealer;
import enemies.Enemy;
import enemies.EnemyAerial;
import towers.Tower;

public class HealerVisitor extends Visitor{
	protected ShopItemHealer healer;

	
	public HealerVisitor(ShopItemHealer healer) {
		super();
		this.healer = healer;
	}
	

	public void visit(Tower t) {
		t.receiveDamage(healer.getDamage());
		healer.receiveDamage( -(healer.getDamage()) );
	}

	public void visit(Enemy t) {}

	public void visit(MapItemHole h) {}

	public void visit(MapItemSpikeTrap s) {}

	public void visit(ShopItemBarricade b) {}

	public void visit(ShopItemHealer h) {}


	public void visit(EnemyAerial t) {}
	

}
