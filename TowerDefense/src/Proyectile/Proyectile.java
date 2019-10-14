package Proyectile;

import Game.Entity;

public abstract class Proyectile extends Entity{

	protected int dmg;
	protected int range;
	
	public Proyectile(int x, int y, int width, int height,int damage,int range) {
		super(x, y, width, height);
	}
	

}
