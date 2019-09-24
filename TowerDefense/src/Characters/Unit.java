package Characters;

import Game.Entity;

public abstract class Unit extends Entity {
	
	protected float damage;
	protected int range;
	protected float life;
	
	protected int width;
	protected int height;

	public Unit(int x, int y) {
		super(x, y, 80, 80);
		width = 80;
		width = 80;
	}
	
}
