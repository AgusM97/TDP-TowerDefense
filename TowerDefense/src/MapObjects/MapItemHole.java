package MapObjects;

import Game.Unit;
import Proyectile.Proyectile;
import graphics.GenericUnitGraphic;
import visitor.HoleVisitor;
import visitor.Visitor;

public class MapItemHole extends MapItem{
	
	protected HoleVisitor visitor;
	
	/**
	 * 
	 * @param x Columna
	 * @param y	Fila
	 */
	public MapItemHole(int x, int y) {
		super(x, y, 0, 0, 1, 0);
		graphic = new GenericUnitGraphic(this, "/img/Hole.png");
		visitor = new HoleVisitor(this);
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
		return u.intersects(this);
	}

	public Proyectile generateProyectile() {
		return null;}

	public void startAttacking() {}

	public void stopAttacking() {}

	public void move() {}
	

}
