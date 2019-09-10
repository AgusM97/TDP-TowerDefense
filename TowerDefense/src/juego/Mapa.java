package juego;

import javax.swing.JLabel;

import graficos.MapaGrafico;

public class Mapa {
	protected Entidad[][] matriz;
	protected MapaGrafico grafico;
	
	public Mapa() {
		matriz = new Entidad[10][6];
		grafico = new MapaGrafico();
	}
	
	public JLabel getGrafico() {
		return grafico.getGrafico();
	}
}
