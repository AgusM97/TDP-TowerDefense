package Characters;

import javax.swing.JLabel;

import Proyectile.Proyectile;
import visitor.Visitor;

public class Barricade extends Unit{
	//ver la vida de la barricada.
	public Barricade(int x, int y, int damage, int range, int life, int attackSpeed) {
		super(x, y, 0, 0, 20, 0);
		// TODO Auto-generated constructor stub
	}

	@Override
	public JLabel getGraphic() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void accept(Visitor v) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void die() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Visitor getVisitor() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isAttacking() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isInRange(Unit u) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Proyectile attack() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void startAttacking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopAttacking() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}

}
