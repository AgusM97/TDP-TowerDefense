package ShopObjects;

import Game.Game;

public class ShopItemDestroyer {
	
	public static void destroy() {
		Game.getInstance().killAll();
	}
	
}
