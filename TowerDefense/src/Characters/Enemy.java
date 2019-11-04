package Characters;

import java.util.Random;

import javax.swing.JLabel;

import Game.Game;
import Game.AttackThread;
import factories.DropFactory;
import graphics.EnemyGraphic;
import gui.MapPanel;
import visitor.EnemyVisitor;
import visitor.Visitor;

public abstract class Enemy extends Unit{

	protected EnemyGraphic graphic;
	protected EnemyVisitor visitor;
	protected boolean attacking;
	protected int points, coins, speed;
	
	public Enemy(int y, int damage, int range, int life, int points, int coins, int speed, int attackSpeed) {
		super(-100, y, damage, range, life, attackSpeed);
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
		timer = new AttackThread(this, attackSpeed);
		timer.start(); 
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
		if((new Random()).nextInt(2) % 2 == 0)
			MapPanel.getInstance().add(DropFactory.getDrop(getX(), getY()), new Integer(5));
		Game.getInstance().addPoints(this.points);
		Game.getInstance().enemyDied();
	}

	public boolean isInRange(Unit u) {
		return (u.intersects(getX() + getWidth(), getY(), range, getHeight()));
	}
	
	public void move() {
		hitbox.setLocation(hitbox.x + speed, hitbox.y);
		graphic.getJLabel().setLocation(graphic.getJLabel().getX() + speed, graphic.getJLabel().getY());
	}
	

}
