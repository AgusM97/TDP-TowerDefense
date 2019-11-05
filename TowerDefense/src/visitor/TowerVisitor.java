package visitor;

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
	
	
	
	


}
