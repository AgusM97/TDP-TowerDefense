package enemies;


import Game.Game;
import Proyectile.Proyectile;
import Proyectile.TwinDragonProyectile;
import graphics.EnemyGraphic;
import threads.AttackThread;

public class TwinDragon extends Enemy{
	
	/*
	 * damage = 40
	 * range = 200
	 * life = 500
	 * points = 1000
	 * coins = 120
	 * speed = 2
	 * attack speed = 1600ms
	 * 
	 */
	
	public TwinDragon(int row) {
		super(row * 80, 15, 200, 100, 100, 2, 2, 1500);
		hitbox.setBounds(getX(), getY(), getWidth() * 2, getHeight() * 2);
		graphic = new EnemyGraphic(this, "/gif/TwinDragon_Movement.gif", "/gif/TwinDragon_Attack.gif");
	}
	
	public void startAttacking() {
		attacking = true;
		graphic.startAttacking();
		timer = new AttackThread(this, attackSpeed);
		timer.start(); 
	}

	public Proyectile generateProyectile() {
		return new TwinDragonProyectile(getX() + getWidth(), getY(), damage, range, 5);
	}

	public Proyectile generateProyectile2() {
		return new TwinDragonProyectile(getX() + getWidth(), getY() + 80, damage, range, 5);
	}
	
	public void attack() {
		Game.getInstance().addProyectile(generateProyectile());
		Game.getInstance().addProyectile(generateProyectile2());
	}

}
