package enemies;

import java.util.Random;

import Proyectile.EnemyMeleeProyectile;
import Proyectile.Proyectile;
import graphics.EnemyGraphic;

public class Prinny extends Enemy{
	
	/*
	 * damage = 15
	 * range = 1
	 * life = 100
	 * points = 100
	 * coins = 2
	 * speed = 2
	 * attack speed = 1500ms
	 * 
	 */
	
	public Prinny(int row) {
		super(row * 80, 15, 1, 100, 100, 2, 2, 1500);
		Random r = new Random();
		if(r.nextInt(5) % 4 == 0)
			graphic = new EnemyGraphic(this, "/gif/Prinny_Movement1.gif", "/gif/Prinny_Attack.gif");
		else
			graphic = new EnemyGraphic(this, "/gif/Prinny_Movement2.gif", "/gif/Prinny_Attack.gif");
	}

	public Proyectile attack() {
		return new EnemyMeleeProyectile(getX() + getWidth(), getY(), damage, range);
	}

}
