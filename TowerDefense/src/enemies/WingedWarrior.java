package enemies;

import Proyectile.EnemyMeleeProyectile;
import Proyectile.Proyectile;
import graphics.EnemyGraphic;

public class WingedWarrior extends EnemyAerial{
	
	/*
	 * damage = 20
	 * range = 1
	 * life = 150
	 * points = 250
	 * coins = 40
	 * speed = 4
	 * attack speed = 1500ms
	 * 
	 */
	
		public WingedWarrior(int row) {
		super(row * 80, 15, 1, 100, 100, 2, 2, 1500);
		graphic = new EnemyGraphic(this, "/gif/WingedWarrior_Movement.gif", "/gif/WingedWarrior_Attack.gif");
	}

	public Proyectile generateProyectile() {
		return new EnemyMeleeProyectile(getX() + getWidth(), getY(), damage, range);
	}

}
