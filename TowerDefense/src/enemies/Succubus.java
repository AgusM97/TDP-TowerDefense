package enemies;

import Proyectile.Proyectile;
import Proyectile.SuccubusProyectile;
import graphics.EnemyGraphic;

public class Succubus extends Enemy{
	
	/*
	 * damage = 20
	 * range = 400
	 * life = 100
	 * points = 100
	 * coins = 2
	 * speed = 2
	 * attack speed = 1500ms
	 * 
	 */
	
	public Succubus(int row) {
		super(row * 80, 20, 400, 100, 100, 2, 2, 1500);
		graphic = new EnemyGraphic(this, "/gif/Succubus_Movement.gif", "/gif/Succubus_Attack.gif");
	}

	@Override
	public Proyectile generateProyectile() {
		
		return new SuccubusProyectile(getX() + getWidth(), getY(), damage, range, 3);
	}

}
