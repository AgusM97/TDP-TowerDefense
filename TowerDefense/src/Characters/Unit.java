package Characters;

import Game.Entity;
import Proyectile.Proyectile;
import visitor.Visitor;

public abstract class Unit extends Entity {
	
	protected float damage;
	protected int range;
	protected float life;
	protected Proyectile proyectile;
	
	public Unit(int x, int y) {
		super(x, y, 80, 80);
	}

	public abstract void accept(Visitor v);
	public abstract Visitor getVisitor();

	public abstract boolean isInRange(Unit u);
	
	public boolean isDead() {
		return life <= 0;
	}
	
	
	
}
