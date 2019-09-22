package graphics;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MapGraphic {
	protected JLabel grafico;
	protected final int width = 1440;
	protected final int height = 900;
	
	public MapGraphic() {
		grafico = new JLabel(new ImageIcon(this.getClass().getResource("/img/asd2.png")));
		grafico.setVisible(true);
		grafico.setBounds(0, 0, width, height);
	}
	
	public JLabel getGrafico() {
		return grafico;
	}
}
