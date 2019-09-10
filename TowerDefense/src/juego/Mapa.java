package juego;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Mapa {
	protected JLabel img;
	protected Entidad[][] matriz;
	
	public Mapa() {
		img.setIcon(new ImageIcon(this.getClass().getResource("/img/forest_bkg.png")));
	}
	
	public JLabel getImg() {
		return img;
	}
}
