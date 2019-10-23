package Characters;

import javax.swing.JLabel;

import Proyectile.Proyectile;
import graphics.DropItemGraphic;
import graphics.TowerGraphic;
import visitor.Visitor;

public class Barricade extends Tower{
	//ver la vida de la barricada.
	
	public Barricade(int x, int y, int damage, int range, int life, int attackSpeed) {
		super(x, y, 0, 0, 20, 0, 0);
		graphic = new TowerGraphic(this, "/img/CorpsePile.pngf", "/img/CorpsePile.png");
		// TODO Auto-generated constructor stub
	}

	@Override
	public Proyectile attack() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
