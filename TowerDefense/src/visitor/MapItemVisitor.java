package visitor;

import Characters.Enemy;
import Characters.Tower;
import MapObjects.MapItemHole;

public class MapItemVisitor extends Visitor{
	
	protected MapItemHole trap;

	@Override
	public void visit(Tower t) {
		t.receiveDamage(trap.getDamage());
		
		
	}

	@Override
	public void visit(Enemy t) {
		t.receiveDamage(trap.getDamage());
		
	}
	

}
