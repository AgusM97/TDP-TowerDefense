package Characters;

import Proyectile.DragonKingProyectile;
import Proyectile.Proyectile;
import graphics.EnemyGraphic;

public class DragonKing extends Enemy{
	
	/*
	 * damage = 15
	 * range = 1
	 * life = 100
	 * points = 100
	 * coins = 2
	 * speed = 2
	 * attack speed = 1500ms
	 * 
	 */
	
	public DragonKing(int row) {
		super(row * 80, 15, 1, 100, 100, 2, 2, 1500);
		graphic = new EnemyGraphic(this, "/gif/DragonKing_Movement.gif", "/gif/DragonKing_attack.gif");
	}

	public Proyectile attack() {
		return new DragonKingProyectile(getX(), getY(),getWidth(),getHeight() ,damage, range,speed);
	}

}
