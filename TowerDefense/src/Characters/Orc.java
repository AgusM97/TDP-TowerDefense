package Characters;

import graphics.EnemyGraphic;

public class Orc extends Enemy{
	
	/*
	 * damage = 15
	 * range = 1
	 * life = 100
	 * points = 100
	 * coins = 2
	 * speed = 2
	 * 
	 */
	
	public Orc(int row) {
		super(row * 80, 15, 1, 100, 100, 2, 2);
		graphic = new EnemyGraphic(this, "/gif/Orc_movement.gif", "/gif/Orc_attack.gif");
	}

}
