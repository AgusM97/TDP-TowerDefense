package MapObjects;

import javax.swing.JLabel;
import Game.Entity;
import graphics.MapItemGraphic;


public abstract class MapItem extends Entity {
	protected MapItemGraphic graphic;
	
	public MapItem(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	
	public JLabel getGraphic() {
		return graphic.getJLabel();
	}
	
	
}
