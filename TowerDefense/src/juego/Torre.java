package juego;

import javax.swing.JLabel;

import graficos.TorreGrafico;

public abstract class Torre extends Unidad {

	protected TorreGrafico grafico;
	
	public JLabel getGrafico() {
		return grafico.getGrafico();
	}

}
