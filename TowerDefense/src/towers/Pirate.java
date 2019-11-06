package towers;

import Proyectile.PirateProyectile;
import Proyectile.Proyectile;
import graphics.TowerGraphic;

public class Pirate extends Tower{
	
	/*
	 * damage = 40
	 * range = 300
	 * life = 100
	 * cost = 10
	 * attack speed = 2000ms
	 * 
	 */
	
	public Pirate(int x, int y) {
		super(x * 80, y * 80, 40, 300, 100, 10, 2000);
		graphic = new TowerGraphic(this, "/gif/Pirate_Idle.gif", "/gif/Pirate_Attack.gif");
	}
	
	public Proyectile generateProyectile() {
		return new PirateProyectile(getX(), getY(), damage, range);
	}


}
