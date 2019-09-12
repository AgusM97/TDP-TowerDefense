package graficos;

import javax.swing.JLabel;

public abstract class TorreGrafico {
	protected JLabel grafico;
	protected final int width = 80;
	protected final int height = 80;


	public JLabel getGrafico() {
		return grafico;
	}
}
