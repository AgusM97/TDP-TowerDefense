package visitor;

import MapObjects.MapItemHole;
import MapObjects.MapItemSpikeTrap;
import enemies.Enemy;
import towers.Tower;

public class HoleVisitor extends Visitor {
	protected MapItemHole item;
	

	public HoleVisitor(MapItemHole item) {
		super();
		this.item = item;
	}

	public void visit(Tower t) {
		if(!t.isAerial())
			t.die();
	}

	public void visit(Enemy t) {
		if(!t.isAerial())
			t.die();
	}

	public void visit(MapItemHole h) {}

	public void visit(MapItemSpikeTrap s) {}

}
