package Characters;

import graphics.EnemyGraphic;

public class Orc extends Enemy{

	public Orc(int y) {
		super(y * 80);
		graphic = new EnemyGraphic(this, "/gif/Orc_movement.gif", "/gif/Orc_attack.gif");
		points = 100;
		life = 100;
		speed = 2;
		range = 81;
	}

}
