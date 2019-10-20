package Characters;

import graphics.EnemyGraphic;

public class TwinDragon extends Enemy{
	
	public TwinDragon(int row) {
		super(row * 80, 15, 1, 100, 100, 2, 2);
		graphic = new EnemyGraphic(this, "/gif/TwinDragon_Movement.gif", "/gif/TwinDragon_Attack.gif");
	}

}
