package juego;

import javax.swing.JFrame;


public class Juego {
	protected Mapa map;
	
	public Juego(JFrame gui) {
		map = new Mapa();
		gui.add(map.getImg());
	}
}
