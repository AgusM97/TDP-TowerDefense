package Proyectile;

import graphics.ProyectileGraphic;

public class DragonKingProyectile extends EnemyProyectile{
	
	public DragonKingProyectile(int x, int y, int damage, int range, int speed) {
		super(x-20, y+20, 50, 50, damage, range, speed);
		graphic = new ProyectileGraphic(this, "/gif/Proyectile_DragonKing.gif");
	}

}
