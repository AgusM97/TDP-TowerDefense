package Game;

import javax.swing.JLabel;

import graphics.MapGraphic;

public class Map {
	protected MapGraphic graphic;
	
	public Map() {
		graphic = new MapGraphic();
	}
	
	public JLabel getGrafico() {
		return graphic.getGrafico();
	}
}
