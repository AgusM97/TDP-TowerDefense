package juego;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Mapa {
	protected JLabel img;
	protected Entidad[][] matriz;
	
	public Mapa() {
		img.setIcon(new ImageIcon());
		img.setBounds(20, 20, 500, 300);
		img.setVisible(true);
	}
	
	public JLabel getImg() {
		return img;
	}
}
