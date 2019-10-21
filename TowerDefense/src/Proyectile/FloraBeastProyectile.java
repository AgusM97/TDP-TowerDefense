package Proyectile;

import graphics.ProyectileGraphic;

public class FloraBeastProyectile extends EnemyProyectile{
	
	public FloraBeastProyectile(int x, int y, int width, int height, int damage, int range, int speed) {
		super(x, y, width, height, damage, range, speed);
		graphic = new ProyectileGraphic(this, "/img/Proyectile_FloraBeast.png");
	}
	
	public void move() {}//Implementar para que aparesca debajo del enemigo.(puede empezar como Empty.png y cuando colisiona correr el gif.

}
