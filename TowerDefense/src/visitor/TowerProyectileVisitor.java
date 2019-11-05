package visitor;

import Proyectile.TowerProyectile;
import enemies.Enemy;
import towers.Tower;

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
