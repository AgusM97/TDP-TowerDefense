package Characters;

import Proyectile.ArcherProyectile;
import Proyectile.Proyectile;
import graphics.TowerGraphic;

public class Archer extends Tower{
	
	/*
	 * damage = 15
	 * range = 500
	 * life = 100
	 * cost = 10
	 * attack speed = 1500ms
	 * 
	 */
	
	public Archer(int x, int y) {
		super(x * 80, y * 80, 15, 500, 100, 10, 1500);
		graphic = new TowerGraphic(this, "/gif/Archer_idle.gif", "/gif/Archer_attack.gif");
	}
	
	public Proyectile attack() {
		return new ArcherProyectile(getX(), getY(), damage, range);
	}

}
