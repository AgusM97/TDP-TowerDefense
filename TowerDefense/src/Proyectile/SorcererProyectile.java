package Proyectile;

import graphics.ProyectileGraphic;

public class SorcererProyectile extends TowerProyectile{
	
	public SorcererProyectile(int x, int y,int damage,int range) {
		super(x-40 , y+50 , 40, 10, damage, range, 5);
		graphic = new ProyectileGraphic(this, "/img/Proyectile_Sorcerer.gif");
	}

}
