package towers;

import Proyectile.Proyectile;
import Proyectile.SorcererProyectile;
import graphics.TowerGraphic;

public class Sorcerer extends Tower{
	
	/*
	 * damage = 20
	 * range = 500
	 * life = 100
	 * cost = 40
	 * attack speed = 1500ms
	 * 
	 */
	
	public Sorcerer(int x, int y) {
		super(x * 80, y * 80, 20, 500, 100, 40, 1500);
		graphic = new TowerGraphic(this, "/gif/Sorcerer_Idle.gif", "/gif/Sorcerer_Attack.gif");
	}

	public Proyectile generateProyectile() {
		return new SorcererProyectile(getX(), getY(), damage, range);
	}

}
