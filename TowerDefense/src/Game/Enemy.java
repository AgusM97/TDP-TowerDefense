package Game;

import javax.swing.JLabel;

import graphics.EnemyGraphic;

public abstract class Enemy extends Unit{

	protected EnemyGraphic grafico;
	
	public Enemy(int x, int y) {
		super(x, y);
	}
	
	public JLabel getGrafico() {
		return grafico.getGrafico();
	}

}
