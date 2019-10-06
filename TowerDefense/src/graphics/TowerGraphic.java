package graphics;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class TowerGraphic {
	protected JLabel grafico;
	String idle;
	String attack;

	public TowerGraphic(Rectangle hb, String idle) {

		
		grafico = new JLabel(new ImageIcon
				(new ImageIcon(this.getClass().getResource(idle)).getImage().getScaledInstance((int) hb.getWidth(), (int) hb.getHeight(), Image.SCALE_DEFAULT))
				);
		grafico.setVisible(true);
		grafico.setBounds( hb.x,  hb.y, (int) hb.getWidth(), (int) hb.getHeight());
	}

	public JLabel getGrafico() {
		return grafico;
	}
}
