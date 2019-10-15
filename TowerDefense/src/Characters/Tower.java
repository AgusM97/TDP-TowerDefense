package Characters;

import javax.swing.JLabel;

import graphics.TowerGraphic;
import visitor.TowerVisitor;
import visitor.Visitor;

public abstract class Tower extends Unit {

	protected TowerGraphic graphic;
	protected TowerVisitor visitor;
	protected boolean attacking;

	public Tower(int x, int y) {
		super(x, y);
		visitor = new TowerVisitor(this);
		attacking = false;
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
		timer = new TimerThread(this);
		timer.start(); 
	}
	
	public void stopAttacking() {
		attacking = false;
		graphic.stopAttacking();
	}
	
	public boolean isInRange(Unit u) {
		return (getY() == u.getY()) && (getX() - range <= u.getX()) && (getX() > u.getX());
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}

}
