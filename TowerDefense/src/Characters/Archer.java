package Characters;

import graphics.TowerGraphic;

public class Archer extends Tower{
	
	public Archer(int x, int y) {
		super(x * 80, y * 80);
		graphic = new TowerGraphic(this, "/gif/Archer_idle.gif", "/gif/Archer_attack.gif");
		range = 400;
	}

}
