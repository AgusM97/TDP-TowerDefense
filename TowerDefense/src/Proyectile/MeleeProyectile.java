package Proyectile;

import graphics.ProyectileGraphic;

public class MeleeProyectile extends TowerProyectile{
	
	public MeleeProyectile(int x, int y,int damage,int range) {
		super(x-40 , y+50 , 40, 10, damage, range);
		graphic = new ProyectileGraphic(this, "/img/Empty.png");///it shows nothing.
	}

}
