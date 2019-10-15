package visitor;

import Characters.Enemy;
import Characters.Tower;
import Proyectile.TowerProyectile;

public class TowerProyectileVisitor extends Visitor {
	protected TowerProyectile p;
	
	public TowerProyectileVisitor(TowerProyectile p) {
		this.p = p;
	}

	public void visit(Tower t) {
		//no hace nada
	}

	public void visit(Enemy e) {
		e.receiveDamage(p.getDamage());
		p.setSpent();
	}

}
