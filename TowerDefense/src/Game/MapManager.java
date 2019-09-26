package Game;

import javax.swing.JLabel;

public class MapManager {
	protected Map map;
	
	public MapManager() {
		
	}
	
	public void createMap() {
		map=new Map();
	}
	
	public JLabel getGrafico() {
		return map.getGrafico();
	}

}
