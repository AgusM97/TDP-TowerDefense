package Game;

import javax.swing.JFrame;

import Characters.DarkKnight;
import Characters.Orc;


public class Game {
	protected Map map;
	protected int points;
	
	public Game(JFrame gui) {
		map = new Map();
		
		//test
		Tower guerrero = new DarkKnight(6, 4);
		Enemy orc = new Orc(1, 0);
		gui.getContentPane().add(guerrero.getGrafico());
		gui.getContentPane().add(orc.getGrafico());
		gui.getContentPane().add(map.getGrafico());
	}
}
