package Proyectile;

import visitor.EnemyProyectileVisitor;
import visitor.Visitor;

public class EnemyProyectile extends Proyectile {
	public EnemyProyectileVisitor visitor;
	
	
	public EnemyProyectile(int x, int y, int width, int height, int damage, int range, int speed) {
		super(x, y, width, height, damage, range, speed);
		visitor = new EnemyProyectileVisitor(this);
	}

	public Visitor getVisitor() {
		return visitor;
	}

	public void move() {
		hitbox.setLocation(hitbox.x + speed, hitbox.y);
		graphic.getJLabel().setLocation(graphic.getJLabel().getX() + speed, graphic.getJLabel().getY());
		range -= speed;
	}

}
