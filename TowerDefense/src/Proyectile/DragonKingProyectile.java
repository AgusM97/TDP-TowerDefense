package Proyectile;

import graphics.ProyectileGraphic;

public class DragonKingProyectile extends EnemyProyectile{
	
	public DragonKingProyectile(int x, int y, int damage, int range, int speed) {
		super(x, y, 40, 40, damage, range, speed);
		graphic = new ProyectileGraphic(this, "/gif/Proyectile_DragonKing.gif");
	}

}
