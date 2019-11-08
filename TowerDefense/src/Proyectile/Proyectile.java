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
	
	/**
	 * 
	 * @param x X correspondiente a la esquina superior izquierda del hitbox
	 * @param y X correspondiente a la esquina superior izquierda del hitbox
	 * @param width Ancho del hitbox
	 * @param height Alto del hitbox
	 * @param damage Daño que realiza el proyectil
	 * @param range Rango maximo del proyectil (px)
	 * @param speed Velocidad de movimiento del proyectil
	 */
	public Proyectile(int x, int y, int width, int height,int damage,int range, int speed) {
		super(x, y, width, height);
		dmg = damage;
		this.range = range;
		this.speed = speed;
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
	
	/**
	 * Retorna si el proyectil ya impacto con un oponente
	 * @return
	 */
	public boolean isSpent() {
		return spent;
	}
	
	/**
	 * Se utiliza cuando el proyectil impacta con un oponente
	 */
	public void setSpent() {
		spent = true;
	}
	
	/**
	 * Indica si el proyectil llego a su maximo rango
	 * @return
	 */
	public boolean maxRange() {
		return range <= 0;
	}
}
