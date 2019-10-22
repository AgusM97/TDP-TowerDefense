package DropItems;

import javax.swing.JLabel;

import Game.Entity;
import graphics.DropItemGraphic;
import graphics.TowerGraphic;
import visitor.DropAttackPowerUpVisitor;
import visitor.Visitor;

public abstract class Drop extends Entity{
	protected DropItemGraphic graphic;
	protected DropAttackPowerUpVisitor visitor;
	
	public Drop(int x, int y, int width, int height) {
		super(x,y,width,height);
	}
	
	public JLabel getGraphic() {
		return graphic.getJLabel();
	}
	
	public Visitor getVisitor() {
		return visitor;
	}

}
