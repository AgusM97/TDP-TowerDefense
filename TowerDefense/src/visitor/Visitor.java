package visitor;

import Characters.Enemy;
import Characters.Tower;

public abstract class Visitor {

	public abstract void visit(Tower t);
	public abstract void visit(Enemy t);
}
