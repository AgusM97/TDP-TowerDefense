package Proyectile;

import graphics.ProyectileGraphic;

public class EnemyMeleeProyectile extends EnemyProyectile {

	public EnemyMeleeProyectile(int x, int y, int damage, int range) {
		super(x, y, 10, 10, damage, range, 1);
		graphic = new ProyectileGraphic(this, null);
	}

}
