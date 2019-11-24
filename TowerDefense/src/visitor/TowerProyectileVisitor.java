package visitor;

import MapObjects.MapItemHole;
import MapObjects.MapItemSpikeTrap;
import Proyectile.TowerProyectile;
import ShopObjects.ShopItemBarricade;
import ShopObjects.ShopItemHealer;
import enemies.Enemy;
import enemies.EnemyAerial;
import towers.Tower;

public class TowerProyectileVisitor extends Visitor {
	protected TowerProyectile p;
	
	public TowerProyectileVisitor(TowerProyectile p) {
		this.p = p;
	}

	public void visit(Tower t) {}

	public void visit(Enemy e) {
		e.receiveDamage(p.getDamage());
		p.setSpent();
	}

	public void visit(EnemyAerial t) {
		t.receiveDamage(p.getDamage());
		p.setSpent();
	}

	public void visit(MapItemHole h) {}

	public void visit(MapItemSpikeTrap s) {}

	public void visit(ShopItemBarricade b) {}

	public void visit(ShopItemHealer h) {}


}
