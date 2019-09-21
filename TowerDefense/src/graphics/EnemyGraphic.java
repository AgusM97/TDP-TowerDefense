package graphics;

import java.awt.Image;
import java.awt.Rectangle;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class EnemyGraphic {
	protected JLabel grafico;
	String idle;
	String move;
	String attack;

	public EnemyGraphic(Rectangle hb, String idle) {

		
		grafico = new JLabel(new ImageIcon
				(new ImageIcon(this.getClass().getResource(idle)).getImage().getScaledInstance((int) hb.getWidth(), (int) hb.getHeight(), Image.SCALE_DEFAULT))
				);
		grafico.setVisible(true);
		grafico.setBounds( (int) hb.getX() * 80, (int)  hb.getY() * 80, (int) hb.getWidth(), (int) hb.getHeight());
	}
	
	public JLabel getGrafico() {
		return grafico;
	}

}
