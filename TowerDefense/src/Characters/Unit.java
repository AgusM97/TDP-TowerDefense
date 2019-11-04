package Characters;

import javax.swing.JLabel;

import Game.Entity;
import Game.AttackThread;
import Proyectile.Proyectile;
import visitor.Visitor;

public abstract class Unit extends Entity {
	
	protected int damage, range, life, attackSpeed;
	protected boolean opponentInRange;
	protected AttackThread timer;
	
	
	public Unit(int x, int y, int damage, int range, int life, int attackSpeed) {
		super(x, y, 80, 80);
		this.damage = damage;
		this.range = range;
		this.life = life;
		this.attackSpeed = attackSpeed;
		opponentInRange = false;
	}

	public abstract JLabel getGraphic();
	public abstract void accept(Visitor v);
	public abstract void die();
	public abstract Visitor getVisitor();
	public abstract boolean isAttacking();
	public abstract boolean isInRange(Unit u);
	public abstract Proyectile attack();
	public abstract void startAttacking();
	public abstract void stopAttacking();
	public abstract void move();
	
	public int getLife() {
		return life;
	}

	public void receiveDamage(int damage) {
		life -= damage;
	}
	
	public boolean hasOpponentInRange() {
		return opponentInRange;
	}
	
	public void setOpponentInRange(boolean b) {
		opponentInRange = b;
	}



	
	
	
}
