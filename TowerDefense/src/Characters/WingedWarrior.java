package Characters;

import Proyectile.EnemyMeleeProyectile;
import Proyectile.Proyectile;
import graphics.EnemyGraphic;

public class WingedWarrior extends Enemy{
	
	/*
	 * damage = 15
	 * range = 1
	 * life = 100
	 * points = 100
	 * coins = 2
	 * speed = 2
	 * 
	 */
	
		public WingedWarrior(int row) {
		super(row * 80, 15, 1, 100, 100, 2, 2);
		graphic = new EnemyGraphic(this, "/gif/WingedWarrior_Movement.gif", "/gif/WingedWarrior_Attack.gif");
	}

	public Proyectile attack() {
		return new EnemyMeleeProyectile(getX() + getWidth(), getY(), damage, range);
	}

}
