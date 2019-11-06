package DropItems;

import Game.Game;
import Proyectile.BombProyectile;

@SuppressWarnings("serial")
public class DropBomb extends Drop{
	
	public DropBomb(int x, int y) {
		super(x,y,60,60,"/img/Drop_Bomb.png");
	}

	public void performAction() {
		Game.getInstance().addProyectile(new BombProyectile(getX() - 80, getY() - 80));
		Game.getInstance().addProyectile(new BombProyectile(getX(), getY() - 80));
		Game.getInstance().addProyectile(new BombProyectile(getX() + 80, getY() - 80));
		
		Game.getInstance().addProyectile(new BombProyectile(getX() - 80, getY()));
		Game.getInstance().addProyectile(new BombProyectile(getX(), getY()));
		Game.getInstance().addProyectile(new BombProyectile(getX() + 80, getY()));
		
		Game.getInstance().addProyectile(new BombProyectile(getX() - 80, getY() + 80));
		Game.getInstance().addProyectile(new BombProyectile(getX(), getY() + 80));
		Game.getInstance().addProyectile(new BombProyectile(getX() + 80, getY() + 80));
		
	}

}