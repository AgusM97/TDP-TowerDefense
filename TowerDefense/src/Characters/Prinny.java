package Characters;

import graphics.EnemyGraphic;

public class Prinny extends Enemy{
	
	public Prinny(int row) {
		super(row * 80, 15, 1, 100, 100, 2, 2);
		graphic = new EnemyGraphic(this, "/gif/Prinny_Movement.gif", "/gif/Prinny_Attack.gif");//Como añadir el otro gif de movimiento?.
	}

}
