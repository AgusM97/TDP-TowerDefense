package ShopObjects;

import javax.swing.JLabel;

import Game.Unit;
import Proyectile.Proyectile;
import graphics.GenericUnitGraphic;
import visitor.ShopItemHealerVisitor;
import visitor.Visitor;

public class ShopItemHealer extends Unit{
	protected ShopItemHealerVisitor visitor;
	GenericUnitGraphic graphic;

	public ShopItemHealer(int x, int y) {
		super(x*80, y*80, -2, 0, 400, 1500);
		graphic = new GenericUnitGraphic(this, "/img/ShopItems_Heal.png");
		visitor = new ShopItemHealerVisitor(this);
	}

	public int getDamage() {
		return damage;
	}

	public JLabel getGraphic() {
		return graphic.getJLabel();
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

	public Visitor getVisitor() {
		return visitor;
	}

	public boolean isAttacking() {
		return false;
	}

	public boolean isInRange(Unit u) {
		return u.getY() == getY();
	}

	public Proyectile generateProyectile() {
		return null;
	}

	public void startAttacking() {}

	public void stopAttacking() {}

	public void move() {}

}
