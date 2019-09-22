package graphics;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MapGraphic {
	protected JLabel grafico;
	protected final int width = 1280;
	protected final int height = 720;
	
	public MapGraphic() {
		grafico = new JLabel(new ImageIcon
				(new ImageIcon(this.getClass().getResource("/img/9x9undertile.png")).getImage().getScaledInstance(200,200, Image.SCALE_SMOOTH))
				);
				
				new JLabel(new ImageIcon(this.getClass().getResource("/img/9x9undertile.png")));
		grafico.setVisible(true);
		grafico.setBounds(0, 0, width, height);
	}
	
	public JLabel getGrafico() {
		return grafico;
	}
}
