package Characters;

import java.util.Random;

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
	 * 
	 */
	
	public Prinny(int row) {
		super(row * 80, 15, 1, 100, 100, 2, 2);
		Random r = new Random();
		if(r.nextInt(5) % 4 == 0)
			graphic = new EnemyGraphic(this, "/gif/Prinny_Movement1.gif", "/gif/Prinny_Attack.gif");
		else
			graphic = new EnemyGraphic(this, "/gif/Prinny_Movement2.gif", "/gif/Prinny_Attack.gif");
	}

	@Override
	public Proyectile attack() {
		// TODO Auto-generated method stub
		return null;
	}

}
