package ShopObjects;

import javax.swing.JLabel;

import Game.Unit;
import Proyectile.Proyectile;
import graphics.GenericUnitGraphic;
import visitor.Visitor;

public class ShopItemBarricade extends Unit{
	protected GenericUnitGraphic graphic;
	
	public ShopItemBarricade(int x, int y) {
		super(x*80, y*80, 0, 0, 20, 0);
		graphic = new GenericUnitGraphic(this, "/img/CorpsePile.png");
	}

	public Proyectile generateProyectile() {
		return null;
	}

	public JLabel getGraphic() {
		return graphic.getJLabel();
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

	public Visitor getVisitor() {
		return null;
	}

	public boolean isAttacking() {
		return false;
	}

	public boolean isInRange(Unit u) {
		return false;
	}

	public void startAttacking() {}

	public void stopAttacking() {}

	public void move() {}

	

}
