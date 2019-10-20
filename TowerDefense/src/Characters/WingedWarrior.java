package Characters;

import graphics.EnemyGraphic;

public class WingedWarrior extends Enemy{
	
	public WingedWarrior(int row) {
		super(row * 80, 15, 1, 100, 100, 2, 2);
		graphic = new EnemyGraphic(this, "/gif/WingedWarrior_Movement.gif", "/gif/WingedWarrior_Attack.gif");
	}

}
