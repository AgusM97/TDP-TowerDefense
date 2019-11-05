package towers;

import Proyectile.Proyectile;
import Proyectile.TowerMeleeProyectile;
import graphics.TowerGraphic;

public class DarkKnight extends Tower{
	
	/*
	 * damage = 40
	 * range = 5
	 * life = 200
	 * cost = 10
	 * attack speed = 1500ms
	 * 
	 */
	
	public DarkKnight(int x, int y) {
		super(x * 80, y * 80, 40, 5, 200, 10, 1500);
		graphic = new TowerGraphic(this, "/gif/DarkKnight_idle.gif", "/gif/DarkKnight_Attack.gif");
	}

	public Proyectile attack() {
		return new TowerMeleeProyectile(getX(), getY(), damage, range);
	}

}
