package visitor;

import Characters.Enemy;
import Characters.Tower;

public class EnemyVisitor extends Visitor {
	
	protected Enemy enemy;

	public EnemyVisitor(Enemy enemy) {
		this.enemy = enemy;
	}

	public void visit(Tower t) {
		if(!enemy.isAttacking()) 
			enemy.startAttacking();
		enemy.setOpponentInRange(true);
	}

	public void visit(Enemy t) {}


}
