package ShopObjects;

import Game.Game;

public class ShopItemProfit{

	public static boolean profitOrNot() {
		double x = Math.random();
		Game juego = Game.getInstance();
		if((x%2)==0) {
			juego.addCoins(100);
			return true;
		}
		else {
			juego.subCoins(100);
			return false;
		}
	}
	

}
