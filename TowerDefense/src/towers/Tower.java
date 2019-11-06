package towers;

import javax.swing.JLabel;

import DropItems.DropAttackPowerUp;
import DropItems.DropAttackSpeedUp;
import DropItems.DropProtection;
import Game.Unit;
import graphics.TowerGraphic;
import threads.AttackThread;
import visitor.TowerVisitor;
import visitor.Visitor;

public abstract class Tower extends Unit {

	protected TowerGraphic graphic;
	protected TowerVisitor visitor;
	protected boolean attacking;
	protected int cost;

	public Tower(int x, int y, int damage, int range, int life, int cost, int attackSpeed) {
		super(x, y, damage, range, life, attackSpeed);
		visitor = new TowerVisitor(this);
		attacking = false;
		this.cost = cost;
		this.attackSpeed = attackSpeed;
	}

	public int getCost() {
		return cost;
	}

	public JLabel getGraphic() {
		return graphic.getJLabel();
	}
	
	public Visitor getVisitor() {
		return visitor;
	}
	
	public boolean isAttacking() {
		return attacking;
	}
	
	public void startAttacking() {
		attacking = true;
		graphic.startAttacking();
		timer = new AttackThread(this, attackSpeed);
		timer.start(); 
	}
	
	public void stopAttacking() {
		attacking = false;
		graphic.stopAttacking();
	}
	
	public boolean isInRange(Unit u) {
		return (u.intersects(getX() - range, getY(), range, getHeight()));
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}

	public void die() {
		attacking = false;
	}
	
	public void move() {}
	
	public void buff(DropAttackPowerUp item) {}
	
	public void buff(DropAttackSpeedUp item) {}
	
	public void buff(DropProtection item) {}


			
}
