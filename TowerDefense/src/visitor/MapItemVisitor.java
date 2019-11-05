package visitor;

import MapObjects.MapItem;
import enemies.Enemy;
import towers.Tower;


public class MapItemVisitor extends Visitor{
	
	protected MapItem trap;

	@Override
	public void visit(Tower t) {
		t.receiveDamage(trap.getDamage());
		
		
	}

	@Override
	public void visit(Enemy t) {
		t.receiveDamage(trap.getDamage());
		
	}
	

}
