package Proyectile;

import javax.swing.JLabel;

import Game.Entity;
import graphics.ProyectileGraphic;
import visitor.Visitor;

public abstract class Proyectile extends Entity{

	protected int dmg;
	protected int range;
	protected int speed;
	protected boolean spent;
	protected ProyectileGraphic graphic;
	
	public Proyectile(int x, int y, int width, int height,int damage,int range) {
		super(x, y, width, height);
		dmg = damage;
		this.range = range;
		spent = false;
	}
	
	public abstract Visitor getVisitor();
	public abstract void move();
	
	public JLabel getGraphic() {
		return graphic.getJLabel();
	}
	
	public int getDamage() {
		return dmg;
	}
	
	public boolean isSpent() {
		return spent;
	}
	
	public void setSpent() {
		spent = true;
	}
	
	public boolean maxRange() {
		return range <= 0;
	}
}
