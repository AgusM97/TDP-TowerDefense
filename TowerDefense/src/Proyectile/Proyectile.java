package Proyectile;

import Game.Entity;
import graphics.ProyectileGraphic;

public abstract class Proyectile extends Entity{

	protected int dmg;
	protected int range;
	protected ProyectileGraphic graphic;
	
	public Proyectile(int x, int y, int width, int height,int damage,int range) {
		super(x, y, width, height);
	}
	
	public ProyectileGraphic getGraphic() {
		return graphic;
	}
	

}
