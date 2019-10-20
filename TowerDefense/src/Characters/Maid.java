package Characters;

import Proyectile.Proyectile;
import graphics.TowerGraphic;

public class Maid extends Tower{

	public Maid(int x, int y, int damage, int range, int life, int cost) {
		super(x * 80, y * 80, 15, 500, 100, 10);
		graphic = new TowerGraphic(this, "/gif/Maid_Idle.gif", "/gif/Maid_Attack.gif");
	}

	@Override
	public Proyectile attack() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
