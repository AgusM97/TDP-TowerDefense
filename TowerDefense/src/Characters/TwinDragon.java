package Characters;


import Proyectile.Proyectile;
import Proyectile.TwinDragonProyectile;
import graphics.EnemyGraphic;

public class TwinDragon extends Enemy{
	
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
	
	public TwinDragon(int row) {
		super(row * 80, 15, 1, 100, 100, 2, 2, 1500);
		graphic = new EnemyGraphic(this, "/gif/TwinDragon_Movement.gif", "/gif/TwinDragon_Attack.gif");
	}


	public Proyectile attack() {
		return new TwinDragonProyectile(getX(), getY(),getWidth(),getHeight() ,damage, range,speed);
	}

}
