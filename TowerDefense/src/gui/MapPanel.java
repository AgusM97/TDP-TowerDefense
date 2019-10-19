package gui;

import javax.swing.JLayeredPane;

public class MapPanel extends JLayeredPane {

	private static MapPanel instance = null;
	
	private MapPanel() {
		this.setVisible(true);
		this.setBounds(0, 0, 960, 720);
	}
	

	public static MapPanel getInstance() {
		if(instance == null)
			instance = new MapPanel();
		return instance;
	}

}
