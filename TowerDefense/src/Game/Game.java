package Game;

import javax.swing.JFrame;


public class Game {
	protected Map map;
	
	public Game(JFrame gui) {
		map = new Map();
		Tower guerrero = new DarkKnight();
		gui.add(guerrero.getGrafico());
		gui.add(map.getGrafico());
	}
}
