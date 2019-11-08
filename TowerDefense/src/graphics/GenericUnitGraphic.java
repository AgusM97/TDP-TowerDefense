package graphics;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Game.Unit;

public class GenericUnitGraphic {
	protected JLabel graphic;
	protected ImageIcon item;
	protected Unit u;
	
	public GenericUnitGraphic(Unit u,String itemS) {
		this.u = u;
		item = new ImageIcon (new ImageIcon(this.getClass().getResource(itemS)).getImage().getScaledInstance(u.getWidth(), u.getHeight(), Image.SCALE_DEFAULT));
		
		graphic = new JLabel(item);
		graphic.setVisible(true);
		graphic.setBounds( u.getX(),  u.getY(), u.getWidth(), u.getHeight());
	}
	
	public JLabel getJLabel() {
		return graphic;
	}
	
}