package Characters;

import Proyectile.Proyectile;
import Proyectile.TowerMeleeProyectile;
import graphics.TowerGraphic;

public class Maid extends Tower{

	/*
	 * damage = 15
	 * range = 500
	 * life = 100
	 * cost = 10
	 * attack speed = 1500ms
	 * 
	 */
	
	public Maid(int x, int y) {
		super(x * 80, y * 80, 15, 500, 100, 10, 1500);
		graphic = new TowerGraphic(this, "/gif/Maid_Idle.gif", "/gif/Maid_Attack.gif");
	}

	@Override
	public Proyectile attack() {
		return new TowerMeleeProyectile(getX(), getY(), damage, range);
	}
	
	
	
	

}
