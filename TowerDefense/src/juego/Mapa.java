package juego;

import javax.swing.JLabel;
import java.util.LinkedList;

import graficos.MapaGrafico;

public class Mapa {
	protected Entidad[][] matriz;
	protected MapaGrafico grafico;
	protected LinkedList<Enemigo> listaEnemigo;
	protected LinkedList<Torre> listaTorre;
	protected Nivel nivel;
	
	public Mapa() {
		matriz = new Entidad[10][6];
		grafico = new MapaGrafico();
	}
	
	public JLabel getGrafico() {
		return grafico.getGrafico();
	}
}
