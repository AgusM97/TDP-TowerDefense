package Game;

import javax.swing.JLabel;

import graphics.MapGraphic;

import java.util.LinkedList;

public class Map {
	protected Entity[][] matriz;
	protected MapGraphic grafico;
	protected LinkedList<Enemy> listaEnemigo;
	protected LinkedList<Tower> listaTorre;
	protected Level nivel;
	
	public Map() {
		matriz = new Entity[10][6];
		grafico = new MapGraphic();
	}
	
	public JLabel getGrafico() {
		return grafico.getGrafico();
	}
}
