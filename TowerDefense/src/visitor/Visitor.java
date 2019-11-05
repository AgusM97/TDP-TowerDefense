package visitor;

import enemies.Enemy;
import towers.Tower;

public abstract class Visitor {

	public abstract void visit(Tower t);
	public abstract void visit(Enemy t);
}
