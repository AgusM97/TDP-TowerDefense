package ShopObjects;

import graphics.ShopItemGraphic;
import visitor.ShopItemHealerVisitor;

public class ShopItemHealer extends ShopItem{
	protected int damage = -10;//Al restarle -10 le cura la vida.
	protected ShopItemHealerVisitor visitor;

	public ShopItemHealer(int x, int y, int width, int height) {
		super(x, y, width, height);
		graphic = new ShopItemGraphic(this, "/img/ShopItems_Heal.png");
		visitor = new ShopItemHealerVisitor();
	}

	public int getDamage() {
		// TODO Auto-generated method stub
		return damage;
	}

}
