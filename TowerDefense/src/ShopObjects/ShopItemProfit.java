package ShopObjects;

import graphics.ShopItemGraphic;
import Game.Game;

public class ShopItemProfit extends ShopItem{
	
	

	public ShopItemProfit(int x, int y, int width, int height) {
		super(x, y, width, height);
		graphic = new ShopItemGraphic(this, "/gif/coins.gif");
		// TODO Auto-generated constructor stub
	}
	
	public void profitOrNot() {
		double x = Math.random();
		Game juego = Game.getInstance();
		if((x%2)==0) {
			graphic.changeIcon("/img/coinsWin");
			juego.addCoins(1000);
		}
		else {
			graphic.changeIcon("/img/coinsLose");
			juego.addCoins(-1000);
		}
	}
	

}
