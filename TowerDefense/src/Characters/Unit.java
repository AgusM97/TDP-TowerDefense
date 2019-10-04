package Characters;

import Game.Entity;
import Game.Proyectile;

public abstract class Unit extends Entity {
	
	protected float damage;
	protected int range;
	protected float life;
	
	protected Proyectile proyectile;

	public Unit(int x, int y) {
		super(x, y, 80, 80);
	}
	
}