package Proyectile;

import graphics.ProyectileGraphic;

public class BombProyectile extends TowerProyectile {

	public BombProyectile(int x, int y) {
		super(x, y, 80, 80, 200, 1, 1);
		graphic = new ProyectileGraphic(this, "/img/Empty.png");
	}


	public void move() {
		range -= speed;
	}

}
