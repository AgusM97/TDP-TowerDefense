package visitor;

import MapObjects.MapItemHole;
import MapObjects.MapItemSpikeTrap;
import Proyectile.EnemyProyectile;
import enemies.Enemy;
import towers.Tower;

public class EnemyProyectileVisitor extends Visitor{
	protected EnemyProyectile p;
	
	public EnemyProyectileVisitor(EnemyProyectile p) {
		this.p = p;
	}

	public void visit(Tower t) {
		t.receiveDamage(p.getDamage());
		p.setSpent();
	}

	public void visit(Enemy t) {}

	public void visit(MapItemHole h) {}

	public void visit(MapItemSpikeTrap s) {}
}
