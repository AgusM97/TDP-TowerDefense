package Characters;

import Proyectile.PirateProyectile;
import Proyectile.Proyectile;
import graphics.TowerGraphic;

public class Pirate extends Tower{
	
	public Pirate(int x, int y) {
		super(x * 80, y * 80, 15, 500, 100, 10);
		graphic = new TowerGraphic(this, "/gif/Pirate_Idle.gif", "/gif/Pirate_Attack.gif");
	}
	
	public Proyectile attack() {
		return new PirateProyectile(getX(), getY(), damage, range);
	}


}
