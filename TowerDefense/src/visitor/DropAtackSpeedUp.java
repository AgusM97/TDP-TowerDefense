package visitor;

import Characters.Enemy;
import Characters.Tower;
import DropItems.DropAttackSpeedUp;

public class DropAtackSpeedUp {
	
DropAttackSpeedUp item;
	
	public DropAtackSpeedUp(DropAttackSpeedUp drop) {
		this.item=drop;
	}

	//Dependiendo del item deberia darle algun efecto.
	public void visit(Tower t) {
		t.buff(item);
	}
	
		
	public void visit(Enemy t) {}


}
