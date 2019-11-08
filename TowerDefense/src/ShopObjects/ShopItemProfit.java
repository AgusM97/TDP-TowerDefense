package ShopObjects;

import Game.Game;

public class ShopItemProfit{

	public static void profitOrNot() {
		double x = Math.random();
		Game juego = Game.getInstance();
		if((x%2)==0) {
			juego.addCoins(1000);
		}
		else {
			juego.addCoins(-1000);
		}
	}
	

}
