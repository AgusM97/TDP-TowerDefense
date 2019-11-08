package ShopObjects;

import graphics.ShopItemGraphic;

public class ShopItemDestroyer extends ShopItem{

	public ShopItemDestroyer(int x, int y, int width, int height) {
		super(x, y, width, height);
		graphic = new ShopItemGraphic(this, "/img/ShopItem_Destroyer.png");
	}

}
