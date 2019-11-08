package visitor;

import ShopObjects.ShopItemDestroyer;
import enemies.Enemy;
import towers.Tower;

public class ShopItemDestroyerVisitor extends Visitor{
	protected ShopItemDestroyer destroyer;

	@Override
	public void visit(Tower t) {
		t.die();;
		
	}

	@Override
	public void visit(Enemy t) {
		t.die();
		
	}

}
