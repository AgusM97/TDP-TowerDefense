package visitor;

import MapObjects.MapItemHole;
import MapObjects.MapItemSpikeTrap;
import enemies.Enemy;
import towers.Tower;

public class TowerVisitor extends Visitor {

	protected Tower tower;
	
	public TowerVisitor(Tower tower) {
		this.tower = tower;
	}

	public void visit(Tower t) {}

	public void visit(Enemy e) {
		if(!tower.isAttacking())
			tower.startAttacking();
		tower.setOpponentInRange(true);
	}

	public void visit(MapItemHole h) {}

	public void visit(MapItemSpikeTrap s) {}
	
	
	
	


}
