package DropItems;

import javax.swing.JLabel;

import Game.Entity;
import graphics.DropItemGraphic;
import graphics.TowerGraphic;
import visitor.DropItemVisitor;
import visitor.Visitor;

public abstract class Drop extends Entity{
	protected DropItemGraphic graphic;
	protected DropItemVisitor visitor;
	
	public Drop(int x, int y, int width, int height) {
		super(x,y,width,height);
		visitor=new DropItemVisitor(this);
	}
	
	public JLabel getGraphic() {
		return graphic.getJLabel();
	}
	
	public Visitor getVisitor() {
		return visitor;
	}

}
