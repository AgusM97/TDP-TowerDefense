package Characters;

import graphics.EnemyGraphic;

public class DragonKing extends Enemy{
	
	public DragonKing(int row) {
		super(row * 80, 15, 1, 100, 100, 2, 2);
		graphic = new EnemyGraphic(this, "/gif/DragonKing_Movement.gif", "/gif/DragonKing_attack.gif");
	}

}
