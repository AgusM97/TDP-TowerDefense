package Characters;

import Game.Entity;
import Proyectile.Proyectile;
import visitor.Visitor;

public abstract class Unit extends Entity {
	
	protected int damage;
	protected int range;
	protected int life;
	protected TimerThread timer;
	
	public Unit(int x, int y) {
		super(x, y, 80, 80);
	}

	public abstract void accept(Visitor v);
	public abstract Visitor getVisitor();
	public abstract boolean isAttacking();
	public abstract boolean isInRange(Unit u);
	public abstract Proyectile attack();
	
	public boolean isDead() {
		return life <= 0;
	}

	public void receiveDamage(int damage) {
		life -= damage;
	}
	
	
	
}
