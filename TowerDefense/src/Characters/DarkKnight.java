package Characters;

import Proyectile.Proyectile;
import graphics.TowerGraphic;

public class DarkKnight extends Tower{

	public DarkKnight(int x, int y) {
		super(x * 80, y * 80);
		graphic = new TowerGraphic(this, "/gif/DarkKnight_idle.gif", "/gif/DarkKnight_idle.gif");
	}

	//CAMBIAR
	public Proyectile attack() {
		return null;
	}

}
