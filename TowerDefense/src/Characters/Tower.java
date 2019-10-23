package Characters;

import javax.swing.JLabel;

import DropItems.DropAttackPowerUp;
import DropItems.DropAttackSpeedUp;
import DropItems.DropProtection;
import Game.TimerThread;
import graphics.TowerGraphic;
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
		this.attackSpeed = attackSpeed;
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
		timer = new TimerThread(this, attackSpeed);
		timer.start(); 
	}
	
	public void stopAttacking() {
		attacking = false;
		graphic.stopAttacking();
	}
	
	public boolean isInRange(Unit u) {
		return (getY() == u.getY()) && (getX() - range <= u.getX() + u.getWidth()) && (getX() > u.getX());
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
