package Characters;

import Proyectile.EnemyMeleeProyectile;
import Proyectile.Proyectile;
import graphics.EnemyGraphic;

public class DragonKing extends Enemy{
	
	/*
	 * damage = 15
	 * range = 1
	 * life = 100
	 * points = 100
	 * coins = 2
	 * speed = 2
	 * 
	 */
	
	public DragonKing(int row) {
		super(row * 80, 15, 1, 100, 100, 2, 2);
		graphic = new EnemyGraphic(this, "/gif/DragonKing_Movement.gif", "/gif/DragonKing_attack.gif");
	}

	public Proyectile attack() {
		return new EnemyMeleeProyectile(getX() + getWidth(), getY(), damage, range);
	}

}
