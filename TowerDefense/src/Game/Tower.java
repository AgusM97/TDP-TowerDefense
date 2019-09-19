package Game;

import javax.swing.JLabel;

import graficos.TorreGrafico;

public abstract class Tower extends Unit {

	protected TorreGrafico grafico;
	
	public JLabel getGrafico() {
		return grafico.getGrafico();
	}

}
