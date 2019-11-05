package visitor;

import DropItems.DropAttackSpeedUp;
import enemies.Enemy;
import towers.Tower;

public class DropAttackSpeedUpVisitor {
	
	protected DropAttackSpeedUp item;
	
	public DropAttackSpeedUpVisitor(DropAttackSpeedUp drop) {
		this.item=drop;
	}

	//Dependiendo del item deberia darle algun efecto.
	public void visit(Tower t) {
		t.buff(item);
	}
	
		
	public void visit(Enemy t) {}


}
