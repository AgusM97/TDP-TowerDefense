package ShopObjects;

import javax.swing.JLabel;

import Game.Entity;
import graphics.ShopItemGraphic;


public class ShopItem extends Entity{
	protected ShopItemGraphic graphic;
	

	public ShopItem(int x, int y, int width, int height) {
		super(x, y, width, height);
		// TODO Auto-generated constructor stub
	}
	
	public JLabel getGraphic() {
		return graphic.getJLabel();
	}

}
