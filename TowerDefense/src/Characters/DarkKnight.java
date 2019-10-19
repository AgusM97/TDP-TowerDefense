package Characters;

import Proyectile.Proyectile;
import graphics.TowerGraphic;

public class DarkKnight extends Tower{
	
	/*
	 * damage = 40
	 * range = 1
	 * life = 200
	 * cost = 10
	 * 
	 */
	
	public DarkKnight(int x, int y) {
		super(x * 80, y * 80, 40, 1, 200, 10);
		graphic = new TowerGraphic(this, "/gif/DarkKnight_idle.gif", "/gif/DarkKnight_Attack.gif");
	}

	//CAMBIAR
	public Proyectile attack() {
		return null;
	}

}
