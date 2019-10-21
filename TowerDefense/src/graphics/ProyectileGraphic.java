package graphics;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Proyectile.Proyectile;

public class ProyectileGraphic {
	protected JLabel graphic;
	
	
	/**
	 * 
	 * @param p
	 * @param shotS debe ser null para que no tenga imagen
	 */
	public ProyectileGraphic(Proyectile p, String  shotS) {
		
		if(shotS != null)
			graphic = new JLabel(new ImageIcon (new ImageIcon(this.getClass().getResource(shotS)).getImage().getScaledInstance(p.getWidth(), p.getHeight(), Image.SCALE_DEFAULT)));
		else
			graphic = new JLabel();
		
		graphic.setVisible(true);
		graphic.setBounds( p.getX(),  p.getY(), p.getWidth(), p.getHeight());
		
	}
	
	public JLabel getJLabel() {
		return graphic;
	}

}
