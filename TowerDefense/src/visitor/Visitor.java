package visitor;

import MapObjects.MapItemHole;
import MapObjects.MapItemSpikeTrap;
import enemies.Enemy;
import towers.Tower;

public abstract class Visitor {

	public abstract void visit(Tower t);
	public abstract void visit(Enemy t);
	public abstract void visit(MapItemHole h);
	public abstract void visit(MapItemSpikeTrap s);
}
