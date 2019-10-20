package Characters;

import graphics.EnemyGraphic;

public class FloraBeast extends Enemy{
	
	public FloraBeast(int row) {
		super(row * 80, 15, 1, 100, 100, 2, 2);
		graphic = new EnemyGraphic(this, "/gif/FloraBeast_Movement.gif", "/gif/FloraBeast_Attack.gif");
	}

}
