package DropItems;

import Game.Game;

@SuppressWarnings("serial")
public class DropGold extends Drop{
	
	public DropGold(int x, int y) {
		super(x,y,60,60,"/img/Drop_Gold.png");
	}

	public void performAction() {
		Game.getInstance().addCoins(100);
	}

}
