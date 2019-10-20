package Characters;

import Proyectile.Proyectile;
import Proyectile.SorcererProyectile;
import graphics.TowerGraphic;

public class Sorcerer extends Tower{
	
	
	public Sorcerer(int x, int y) {
		super(x * 80, y * 80, 15, 500, 100, 10);
		graphic = new TowerGraphic(this, "/gif/Sorcerer_Idle.gif", "/gif/Sorcerer_Attack.gif");
	}

	@Override
	public Proyectile attack() {
		return new SorcererProyectile(getX(), getY(), damage, range);
	}

}
