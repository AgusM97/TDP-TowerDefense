package Characters;

import graphics.EnemyGraphic;

public class Succubus extends Enemy{
	
	public Succubus(int row) {
		super(row * 80, 15, 1, 100, 100, 2, 2);
		graphic = new EnemyGraphic(this, "/gif/Succubus_Movement.gif", "/gif/Succubus_Attack.gif");
	}

}
