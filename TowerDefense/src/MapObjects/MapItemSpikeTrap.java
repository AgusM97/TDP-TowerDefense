package MapObjects;

import Game.Unit;
import Proyectile.Proyectile;
import graphics.GenericUnitGraphic;
import visitor.SpikeVisitor;
import visitor.Visitor;

public class MapItemSpikeTrap extends MapItem {
	
	protected SpikeVisitor visitor;
	
	public MapItemSpikeTrap(int x, int y) {
		super(x, y, 1, 0, 300, 1);
		graphic = new GenericUnitGraphic(this, "/img/Spikes.png");
		visitor = new SpikeVisitor(this);
	}
	
	public int getDamage() {
		return damage;
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
		return null;
	}
	
	public void startAttacking() {}
	
	public void stopAttacking() {}
	
	public void move() {}


}
