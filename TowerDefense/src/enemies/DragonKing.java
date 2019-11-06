package enemies;

import Proyectile.DragonKingProyectile;
import Proyectile.Proyectile;
import graphics.EnemyGraphic;

public class DragonKing extends Enemy{
	
	/*
	 * damage = 30
	 * range = 100
	 * life = 150
	 * points = 100
	 * coins = 2
	 * speed = 2
	 * attack speed = 1000ms
	 * 
	 */
	
	public DragonKing(int row) {
		super(row * 80, 30, 100, 150, 100, 2, 2, 1000);
		graphic = new EnemyGraphic(this, "/gif/DragonKing_Movement.gif", "/gif/DragonKing_attack.gif");
	}

	public Proyectile generateProyectile() {
		return new DragonKingProyectile(getX() + getWidth(), getY(), damage, range, 4);
	}

}
