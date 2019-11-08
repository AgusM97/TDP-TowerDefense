package ShopObjects;

import graphics.ShopItemGraphic;
import visitor.ShopItemDestroyerVisitor;

public class ShopItemDestroyer extends ShopItem{
	protected ShopItemDestroyerVisitor visitor;

	public ShopItemDestroyer(int x, int y, int width, int height) {
		super(x, y, width, height);
		graphic = new ShopItemGraphic(this, "/img/ShopItem_Destroyer.png");
		visitor = new ShopItemDestroyerVisitor();
	}

}
