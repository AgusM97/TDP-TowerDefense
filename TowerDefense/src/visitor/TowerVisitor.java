package visitor;

import Characters.Enemy;
import Characters.Tower;

public class TowerVisitor extends Visitor {

	Tower tower;
	
	public TowerVisitor(Tower tower) {
		this.tower = tower;
	}

	@Override
	public void visit(Tower t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visit(Enemy t) {
		// TODO Auto-generated method stub
		
	}


}
