package visitor;

import ShopObjects.ShopItemHealer;
import enemies.Enemy;
import towers.Tower;

public class ShopItemHealerVisitor extends Visitor{
	protected ShopItemHealer healer;

	@Override
	public void visit(Tower t) {
		t.receiveDamage(healer.getDamage());
		
	}

	@Override
	public void visit(Enemy t) {
		// TODO Auto-generated method stub
		
	}
	

}
