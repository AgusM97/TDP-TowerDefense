package Proyectile;

import graphics.ProyectileGraphic;

public class DragonKingProyectile extends EnemyProyectile{
	
	public DragonKingProyectile(int x, int y, int width, int height, int damage, int range, int speed) {
		super(x, y, width, height, damage, range, speed);
		graphic = new ProyectileGraphic(this, "/img/Proyectile_DragonKing.png");
	}

}
