package Game;

public abstract class Unit extends Entity {
	
	protected float damage;
	protected int range;
	protected float life;
	
	//medidas de una unidad en px
	protected final static int width = 80;
	protected final static int height = 80;

	public Unit(int x, int y) {
		super(x, y, width, height);
	}
	
}
