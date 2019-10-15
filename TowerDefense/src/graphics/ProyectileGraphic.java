package graphics;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Proyectile.Proyectile;

public class ProyectileGraphic {
	protected JLabel graphic;
	
	public ProyectileGraphic(Proyectile p, String  shotS) {
		graphic = new JLabel(new ImageIcon (new ImageIcon(this.getClass().getResource(shotS)).getImage().getScaledInstance(p.getWidth(), p.getHeight(), Image.SCALE_DEFAULT)));
		
		
		graphic = new JLabel();
		graphic.setVisible(true);
		graphic.setBounds( p.getX(),  p.getY(), p.getWidth(), p.getHeight());
		
	}

}
