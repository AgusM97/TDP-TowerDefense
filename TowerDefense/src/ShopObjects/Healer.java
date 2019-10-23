package ShopObjects;

import graphics.ShopItemGraphic;

public class Healer extends ShopItem{

	public Healer(int x, int y, int width, int height) {
		super(x, y, width, height);
		graphic = new ShopItemGraphic(this, "/img/Empty.png");
		// TODO Auto-generated constructor stub
	}

}
