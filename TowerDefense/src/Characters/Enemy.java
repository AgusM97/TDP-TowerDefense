package Characters;

import javax.swing.JLabel;

import graphics.EnemyGraphic;

public abstract class Enemy extends Unit{

	protected EnemyGraphic graphic;
	protected int points, coins, speed;
	
	public Enemy(int x, int y) {
		super(x, y);
	}
	
	public JLabel getGrafico() {
		return graphic.getGrafico();
	}

	public int getPoints() {
		return points;
	}
	
	public void die() {
		life = 0;
	}
	
	public boolean isDead() {
		return life <= 0;
	}

	public void move() {
		hitbox.setLocation(hitbox.x + speed, hitbox.y);
		graphic.getGrafico().setLocation(graphic.getGrafico().getX() + speed, graphic.getGrafico().getY());
	}
}
