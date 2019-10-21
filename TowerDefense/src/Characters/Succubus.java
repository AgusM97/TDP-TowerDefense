package Characters;

import Proyectile.Proyectile;
import graphics.EnemyGraphic;

public class Succubus extends Enemy{
	
	/*
	 * damage = 15
	 * range = 1
	 * life = 100
	 * points = 100
	 * coins = 2
	 * speed = 2
	 * 
	 */
	
	public Succubus(int row) {
		super(row * 80, 15, 1, 100, 100, 2, 2);
		graphic = new EnemyGraphic(this, "/gif/Succubus_Movement.gif", "/gif/Succubus_Attack.gif");
	}

	@Override
	public Proyectile attack() {
		// TODO Auto-generated method stub
		return null;
	}

}
