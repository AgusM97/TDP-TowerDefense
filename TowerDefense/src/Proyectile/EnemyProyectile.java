package Proyectile;

import visitor.Visitor;

public class EnemyProyectile extends Proyectile{

	public EnemyProyectile(int x, int y, int width, int height, int damage, int range) {
		super(x, y, width, height, damage, range);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Visitor getVisitor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

}
