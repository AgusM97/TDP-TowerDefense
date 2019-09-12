package graficos;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class CaballeroGrafico extends TorreGrafico{

	public CaballeroGrafico() {
		grafico = new JLabel(new ImageIcon(this.getClass().getResource("/img/chrono_idle.png")));
		grafico.setVisible(true);
		grafico.setBounds(162, 81, width, height);
	}
}
