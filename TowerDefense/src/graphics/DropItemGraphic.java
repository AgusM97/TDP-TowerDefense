package graphics;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import DropItems.Drop;

public class DropItemGraphic {
	protected JLabel graphic;
	protected ImageIcon item;
	protected Drop d;
	
	public DropItemGraphic(Drop d,String itemS) {
		item = new ImageIcon (new ImageIcon(this.getClass().getResource(itemS)).getImage().getScaledInstance(d.getWidth(), d.getHeight(), Image.SCALE_DEFAULT));
		
		graphic = new JLabel();
		graphic.setVisible(true);
		graphic.setBounds( d.getX(),  d.getY(), d.getWidth(), d.getHeight());
	}
	
	public JLabel getJLabel() {
		return graphic;
	}
	
}
