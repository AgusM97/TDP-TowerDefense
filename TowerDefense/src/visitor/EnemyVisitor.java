package visitor;

import Characters.Enemy;
import Characters.Tower;

public class EnemyVisitor extends Visitor {
	
	Enemy enemy;

	public EnemyVisitor(Enemy enemy) {
		this.enemy = enemy;
	}

	public void visit(Tower t) {
		if(enemy.isInRange(t)) {
			enemy.startAttacking();
		}
	}

	public void visit(Enemy t) {
	}


}
