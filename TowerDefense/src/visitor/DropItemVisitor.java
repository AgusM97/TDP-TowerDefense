package visitor;

import Characters.Enemy;
import Characters.Tower;
import DropItems.Drop;

public class DropItemVisitor extends Visitor{
	
	Drop item;
	
	public DropItemVisitor(Drop drop) {
		this.item=drop;
	}

	//Dependiendo del item deberia darle algun efecto.
	public void visit(Tower t) {
		
		
	}

	
	public void visit(Enemy t) {
		
		
	}

}
