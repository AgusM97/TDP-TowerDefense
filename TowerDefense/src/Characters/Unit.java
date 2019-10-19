package Characters;

import java.awt.Component;

import javax.swing.JLabel;

import Game.Entity;
import Proyectile.Proyectile;
import visitor.Visitor;

public abstract class Unit extends Entity {
	
	protected int damage;
	protected int range;
	protected int life;
	protected boolean opponentInRange;
	protected TimerThread timer;
	
	
	public Unit(int x, int y, int damage, int range, int life) {
		super(x, y, 80, 80);
		this.damage = damage;
		this.range = range;
		this.life = life;
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
