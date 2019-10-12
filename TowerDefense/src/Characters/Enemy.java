package Characters;

import javax.swing.JLabel;

import graphics.EnemyGraphic;
import visitor.EnemyVisitor;
import visitor.Visitor;

public abstract class Enemy extends Unit{

	protected EnemyGraphic graphic;
	protected EnemyVisitor visitor;
	protected boolean attacking;
	protected int points, coins, speed;
	
	public Enemy(int y) {
		super(-80, y);
		visitor = new EnemyVisitor(this);
		attacking = false;
	}
	
	public JLabel getGrafico() {
		return graphic.getGrafico();
	}

	public int getPoints() {
		return points;
	}
	
	public boolean isAttacking() {
		return attacking;
	}
	
	public void startAttacking() {
		attacking = true;
	}
	
	public void stopAttacking() {
		attacking = false;
	}

	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public void die() {
		life = 0;
	}

	public boolean isInRange(Unit u) {
		return (getY() == u.getY()) && (getX() + range >= u.getX()) && (getX() < u.getX()); //misma fila y dentro del rango
	}
	
	public void move() {
		hitbox.setLocation(hitbox.x + speed, hitbox.y);
		graphic.getGrafico().setLocation(graphic.getGrafico().getX() + speed, graphic.getGrafico().getY());
	}
}
