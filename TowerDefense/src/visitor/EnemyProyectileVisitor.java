package visitor;

import Characters.Enemy;
import Characters.Tower;
import Proyectile.EnemyProyectile;

public class EnemyProyectileVisitor extends Visitor{
	protected EnemyProyectile p;
	
	public EnemyProyectileVisitor(EnemyProyectile p) {
		this.p = p;
	}

	public void visit(Tower t) {
		t.receiveDamage(p.getDamage());
		p.setSpent();
	}

	public void visit(Enemy t) {
		//no hace nada
	}

}
