package gui;

import javax.swing.JLayeredPane;

@SuppressWarnings("serial")
public class MapPanel extends JLayeredPane {

	private static MapPanel instance = null;
	
	private MapPanel() {
		this.setLayout(null);
		this.setVisible(true);
		this.setBounds(0, 0, 960, 720);
	}
	

	public static MapPanel getInstance() {
		if(instance == null)
			instance = new MapPanel();
		return instance;
	}

}
