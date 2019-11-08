package towers;

import javax.swing.JLabel;

import DropItems.DropAttackPowerUp;
import DropItems.DropAttackSpeedUp;
import DropItems.DropProtection;
import Game.Unit;
import Proyectile.Proyectile;
import graphics.TowerGraphic;
import threads.AttackThread;
import visitor.TowerVisitor;
import visitor.Visitor;

public abstract class Tower extends Unit {

	protected TowerGraphic graphic;
	protected TowerVisitor visitor;
	protected boolean attacking;
	protected int cost, powerUpCount, speedUpCount, shield;

	/**
	 * 
	 * @param x X correspondiente a la esquina superior izquierda del hitbox
	 * @param y Y correspondiente a la esquina superior izquierda del hitbox
	 * @param damage Daño que generan los ataques de la unidad
	 * @param range Rango de ataque
	 * @param life Vida de la unidad
	 * @param cost Costo de compra de la unidad
	 * @param attackSpeedb Velocidad de ataque
	 */
	public Tower(int x, int y, int damage, int range, int life, int cost, int attackSpeed) {
		super(x, y, damage, range, life, attackSpeed);
		visitor = new TowerVisitor(this);
		attacking = false;
		this.cost = cost;
		this.attackSpeed = attackSpeed;
		powerUpCount=speedUpCount=shield= 0;
		
	}
	
	public void receiveDamage(int damage) {
		if(shield > 0) {
			shield--;
			damage = 0;
		}
		life -= damage;
	}

	public int getCost() {
		return cost;
	}

	public JLabel getGraphic() {
		return graphic.getJLabel();
	}
	
	public Visitor getVisitor() {
		return visitor;
	}
	
	public boolean isAttacking() {
		return attacking;
	}
	
	public void startAttacking() {
		attacking = true;
		graphic.startAttacking();
		timer = new AttackThread(this, attackSpeed);
		timer.start(); 
	}
	
	public void stopAttacking() {
		attacking = false;
		graphic.stopAttacking();
	}
	
	
	
	public boolean isInRange(Unit u) {
		return (u.intersects(getX() - range, getY(), range, getHeight()));
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}

	public void die() {
		life = 0;
		attacking = false;
	}

	public Proyectile attack() {
		Proyectile toReturn = generateProyectile();
		
		if(powerUpCount > 0) {
			powerUpCount--;
			if(powerUpCount == 0)
				damage -= damage / 3;
		}
		
		if(speedUpCount > 0) {
			speedUpCount--;
			if(speedUpCount == 0) {
				attackSpeed = attackSpeed * 2;
				timer.changeSpeed(attackSpeed);
			}
		}
		
		return toReturn;
	}
	
	public void move() {}
	
	public void buff(DropAttackPowerUp item) {
		damage += damage / 2;
		powerUpCount=3;
	}
	
	public void buff(DropAttackSpeedUp item) {
		attackSpeed = attackSpeed / 2;
		if(isAttacking())
			timer.changeSpeed(attackSpeed);
		speedUpCount=5;
	}
	
	public void buff(DropProtection item) {
		shield += 3;
	}


			
}
