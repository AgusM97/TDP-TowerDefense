package visitor;

import MapObjects.MapItemHole;
import MapObjects.MapItemSpikeTrap;
import ShopObjects.ShopItemBarricade;
import ShopObjects.ShopItemHealer;
import enemies.Enemy;
import towers.Tower;

public class EnemyVisitor extends Visitor {
	
	protected Enemy enemy;

	public EnemyVisitor(Enemy enemy) {
		this.enemy = enemy;
	}

	public void visit(Tower t) {
		if(!enemy.isAttacking()) 
			enemy.startAttacking();
		enemy.setOpponentInRange(true);
	}

	public void visit(Enemy t) {}

	public void visit(MapItemHole h) {}

	public void visit(MapItemSpikeTrap s) {}

	public void visit(ShopItemBarricade b) {
		if(!enemy.isAttacking()) 
			enemy.startAttacking();
		enemy.setOpponentInRange(true);
	}

	public void visit(ShopItemHealer h) {}

}
