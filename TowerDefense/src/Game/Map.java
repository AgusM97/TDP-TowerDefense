package Game;

import javax.swing.JLabel;
import java.util.LinkedList;

import graficos.MapaGrafico;

public class Map {
	protected Entity[][] matriz;
	protected MapaGrafico grafico;
	protected LinkedList<Enemy> listaEnemigo;
	protected LinkedList<Tower> listaTorre;
	protected Level nivel;
	
	public Map() {
		matriz = new Entity[10][6];
		grafico = new MapaGrafico();
	}
	
	public JLabel getGrafico() {
		return grafico.getGrafico();
	}
}
