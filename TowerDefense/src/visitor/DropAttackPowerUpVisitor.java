package visitor;

import DropItems.DropAttackPowerUp;
import enemies.Enemy;
import towers.Tower;

public class DropAttackPowerUpVisitor extends Visitor{
	
	protected DropAttackPowerUp item;
	
	public DropAttackPowerUpVisitor(DropAttackPowerUp drop) {
		this.item=drop;
	}

	//Dependiendo del item deberia darle algun efecto.
	public void visit(Tower t) {
		t.buff(item);
	}
	
		
	public void visit(Enemy t) {}

}
