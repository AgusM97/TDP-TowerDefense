package ShopObjects;

import graphics.ShopItemGraphic;

public class ShopItemHealer extends ShopItem{
	protected int damage = -10;//Al restarle -10 le cura la vida.

	public ShopItemHealer(int x, int y, int width, int height) {
		super(x, y, width, height);
		graphic = new ShopItemGraphic(this, "/img/Empty.png");
		// TODO Auto-generated constructor stub
	}

	public int getDamage() {
		// TODO Auto-generated method stub
		return damage;
	}

}
