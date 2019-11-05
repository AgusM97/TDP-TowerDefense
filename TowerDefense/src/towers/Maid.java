package towers;

import Proyectile.Proyectile;
import Proyectile.TowerMeleeProyectile;
import graphics.TowerGraphic;

public class Maid extends Tower{

	/*
	 * damage = 15
	 * range = 1
	 * life = 100
	 * cost = 10
	 * attack speed = 1000ms
	 * 
	 */
	
	public Maid(int x, int y) {
		super(x * 80, y * 80, 15, 1, 100, 10, 1000);
		graphic = new TowerGraphic(this, "/gif/Maid_Idle.gif", "/gif/Maid_Attack.gif");
	}

	public Proyectile attack() {
		return new TowerMeleeProyectile(getX(), getY(), damage, range);
	}
	
	
	
	

}
