package Characters;

import javax.swing.JLabel;

import graphics.TowerGraphic;
import visitor.TowerVisitor;
import visitor.Visitor;

public abstract class Tower extends Unit {

	protected TowerGraphic grafico;
	protected TowerVisitor visitor;

	public Tower(int x, int y) {
		super(x, y);
		visitor = new TowerVisitor(this);
	}
	
	public JLabel getGrafico() {
		return grafico.getGrafico();
	}

	public boolean isInRange(Unit u) {
		return (getY() - range >= u.getY());
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}

}
