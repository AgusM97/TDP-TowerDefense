package visitor;

import Characters.Enemy;
import Characters.Tower;
import ShopObjects.ShopItemHealer;

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
