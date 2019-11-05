package visitor;

import DropItems.DropProtection;
import enemies.Enemy;
import towers.Tower;

public class DropProtectionVisitor {
	
	protected DropProtection item;
	
	public DropProtectionVisitor(DropProtection drop) {
		this.item=drop;
	}

	//Dependiendo del item deberia darle algun efecto.
	public void visit(Tower t) {
		t.buff(item);
	}
	
		
	public void visit(Enemy t) {}

}
