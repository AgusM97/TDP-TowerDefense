package graficos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MapaGrafico {
	protected JLabel grafico;
	protected final int width = 500;
	protected final int height = 300;
	
	public MapaGrafico() {
		grafico = new JLabel(new ImageIcon(this.getClass().getResource("/img/forest_bkg.png")));
		grafico.setVisible(true);
		grafico.setBounds(0, 0, width, height);
	}
	
	public JLabel getGrafico() {
		return grafico;
	}
}
