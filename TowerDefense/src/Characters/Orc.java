package Characters;

import Proyectile.EnemyMeleeProyectile;
import Proyectile.Proyectile;
import graphics.EnemyGraphic;

public class Orc extends Enemy{
	
	/*
	 * damage = 30
	 * range = 1
	 * life = 100
	 * points = 100
	 * coins = 2
	 * speed = 2
	 * 
	 */
	
	public Orc(int row) {
		super(row * 80, 30, 1, 100, 100, 2, 2);
		graphic = new EnemyGraphic(this, "/gif/Orc_movement.gif", "/gif/Orc_attack.gif");
	}

	public Proyectile attack() {
		return new EnemyMeleeProyectile(getX() + getWidth(), getY(), damage, range);
	}

}
