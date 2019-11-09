package ShopObjects;

import java.util.Random;

import Game.Game;

public class ShopItemProfit{

	public static boolean profitOrNot() {
		Random r = new Random();
		Game juego = Game.getInstance();
		if(r.nextInt(2)==0) {
			juego.addCoins(100);
			return true;
		}
		else {
			juego.subCoins(100);
			return false;
		}
	}
	

}
