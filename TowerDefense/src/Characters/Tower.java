package Characters;

import javax.swing.JLabel;

import graphics.TowerGraphic;

public abstract class Tower extends Unit {

	protected TowerGraphic grafico;

	public Tower(int x, int y) {
		super(x, y);
	}
	
	public JLabel getGrafico() {
		return grafico.getGrafico();
	}

}
