package juego;

import javax.swing.JFrame;


public class Juego {
	protected Mapa map;
	
	public Juego(JFrame gui) {
		map = new Mapa();
		Torre guerrero = new Caballero();
		gui.add(guerrero.getGrafico());
		gui.add(map.getGrafico());
	}
}
