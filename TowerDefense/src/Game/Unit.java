package Game;

import javax.swing.JLabel;

import Proyectile.Proyectile;
import threads.AttackThread;
import visitor.Visitor;

public abstract class Unit extends Entity {
	
	protected int damage, range, life, attackSpeed;
	protected boolean opponentInRange;
	protected AttackThread timer;
	
	/**
	 * 
	 * @param x X correspondiente a la esquina superior izquierda del hitbox
	 * @param y Y correspondiente a la esquina superior izquierda del hitbox
	 * @param damage Daño que generan los ataques de la unidad
	 * @param range Rango de ataque
	 * @param life Vida de la unidad
	 * @param attackSpeed Velocidad de ataque (ms)
	 */
	public Unit(int x, int y, int damage, int range, int life, int attackSpeed) {
		super(x, y, 80, 80);
		this.damage = damage;
		this.range = range;
		this.life = life;
		this.attackSpeed = attackSpeed;
		opponentInRange = false;
	}

	public abstract JLabel getGraphic();
	public abstract void accept(Visitor v);
	public abstract Visitor getVisitor();
	public abstract boolean isAttacking();
	public abstract boolean isInRange(Unit u);
	public abstract Proyectile generateProyectile();
	public abstract void startAttacking();
	public abstract void stopAttacking();
	public abstract void move();
	
	public int getLife() {
		return life;
	}

	public void receiveDamage(int damage) {
		life -= damage;
	}
	
	/**
	 * @return Indica si la unidad tiene un objetivo de ataque en rango actualmente
	 */
	public boolean hasOpponentInRange() {
		return opponentInRange;
	}
	
	/**
	 * Establece si la unidad tiene un objetivo de ataque en rango actualmente
	 * @param b
	 */
	public void setOpponentInRange(boolean b) {
		opponentInRange = b;
	}

	public void attack() {
		Game.getInstance().addProyectile(generateProyectile());
	}
	
	/**
	 * Unidad muere
	 */
	public void die() {
		life = 0;
	}

	
	
	
}
