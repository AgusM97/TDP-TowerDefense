package Proyectile;

import visitor.TowerProyectileVisitor;
import visitor.Visitor;

public class TowerProyectile extends Proyectile {
	protected TowerProyectileVisitor visitor;

	public TowerProyectile(int x, int y, int width, int height, int damage, int range, int speed) {
		super(x, y, width, height, damage, range, speed);
		visitor = new TowerProyectileVisitor(this);
	}

	public Visitor getVisitor() {
		return visitor;
	}

	public void move() {
		hitbox.setLocation(hitbox.x - speed, hitbox.y);
		graphic.getJLabel().setLocation(graphic.getJLabel().getX() - speed, graphic.getJLabel().getY());
		range -= speed;
	}

}
