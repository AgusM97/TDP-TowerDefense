package Proyectile;

import graphics.ProyectileGraphic;

public class TwinDragonProyectile extends EnemyProyectile{
	
	public TwinDragonProyectile(int x, int y, int damage, int range, int speed) {
		super(x+20, y+20, 40, 40, damage, range, speed);
		graphic = new ProyectileGraphic(this, "/gif/Proyectile_TwinDragon.gif");
	}

}
