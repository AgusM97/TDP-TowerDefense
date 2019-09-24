package Characters;

import javax.swing.JLabel;

import graphics.EnemyGraphic;

public abstract class Enemy extends Unit{

	protected EnemyGraphic graphic;
	protected int points, coins;
	
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

}
