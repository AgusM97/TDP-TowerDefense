package Game;

import javax.swing.JLabel;
import Characters.Enemy;
import Characters.Tower;
import graphics.MapGraphic;

import java.util.LinkedList;

public class Map {
	protected Entity[][] matrix; //no sirve de nada por ahora
	protected MapGraphic graphic;
	
	public Map() {
		matrix = new Entity[10][6];
		graphic = new MapGraphic();
	}
	
	public JLabel getGrafico() {
		return graphic.getGrafico();
	}
}
