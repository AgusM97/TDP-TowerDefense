package enemies;

import Proyectile.DragonKingProyectile;
import Proyectile.Proyectile;
import graphics.EnemyGraphic;

public class DragonKing extends Enemy{
	
	/*
	 * damage = 50
	 * range = 80
	 * life = 200
	 * points = 500
	 * coins = 60
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
