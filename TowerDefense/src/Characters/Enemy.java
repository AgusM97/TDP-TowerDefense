package Characters;

import javax.swing.JLabel;

import Proyectile.Proyectile;
import graphics.EnemyGraphic;
import visitor.EnemyVisitor;
import visitor.Visitor;
import Game.Game;

public abstract class Enemy extends Unit{

	protected EnemyGraphic graphic;
	protected EnemyVisitor visitor;
	protected boolean attacking;
	protected int points, coins, speed;
	
	public Enemy(int y, int damage, int range, int life, int points, int coins, int speed) {
		super(-100, y, damage, range, life);
		this.points = points;
		this.coins = coins;
		this.speed = speed;
		visitor = new EnemyVisitor(this);
		attacking = false;
	}
	
	public JLabel getGraphic() {
		return graphic.getJLabel();
	}
	
	public Visitor getVisitor() {
		return visitor;
	}

	public int getPoints() {
		return points;
	}
	
	public boolean isAttacking() {
		return attacking;
	}
	
	public void startAttacking() {
		attacking = true;
		graphic.startAttacking();
	}
	
	public void stopAttacking() {
		attacking = false;
		graphic.startWalking();
	}

	public void accept(Visitor v) {
		v.visit(this);
	}
	
	public void die() {
		attacking = false;
		Game.getInstance().addPoints(this.points);
	}

	public boolean isInRange(Unit u) {
		return (getY() == u.getY()) && (getX() + getWidth() + range >= u.getX()) && (getX() < u.getX()); //misma fila y dentro del rango
	}
	
	public void move() {
		hitbox.setLocation(hitbox.x + speed, hitbox.y);
		graphic.getJLabel().setLocation(graphic.getJLabel().getX() + speed, graphic.getJLabel().getY());
	}
	
	
	
	
	//AUX CAMBIAR
	public Proyectile attack() {
		return null;
	}
}
