package graphics;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import MapObjects.MapItem;

public class MapItemGraphic {
	protected JLabel graphic;
	protected ImageIcon item;
	protected MapItem m;
	
	public MapItemGraphic(MapItem m,String itemS) {
		item = new ImageIcon (new ImageIcon(this.getClass().getResource(itemS)).getImage().getScaledInstance(m.getWidth(), m.getHeight(), Image.SCALE_DEFAULT));
		
		graphic = new JLabel(item);
		graphic.setVisible(true);
		graphic.setBounds( m.getX(),  m.getY(), m.getWidth(), m.getHeight());
	}
	
	public JLabel getJLabel() {
		return graphic;
	}
	
}