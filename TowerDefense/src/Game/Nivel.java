package Game;

import java.util.LinkedList;

public class Nivel {
	
	protected LinkedList<Oleada> Oleadas;
	
	public Nivel(int o1, int o2,int o3) {
		
		Oleadas = new LinkedList<Oleada>();
		Oleadas.add(0, new Oleada(o1));
		Oleadas.add(1, new Oleada(o2));
		Oleadas.add(2, new Oleada(o3));
		
	}
	
	public LinkedList<Oleada> Oleadas(){
		
		return Oleadas;
	}

}
