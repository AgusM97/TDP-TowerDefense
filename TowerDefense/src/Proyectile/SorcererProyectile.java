package Proyectile;

import graphics.ProyectileGraphic;

public class SorcererProyectile extends TowerProyectile{
	
	public SorcererProyectile(int x, int y,int damage,int range) {
		super(x-20 , y+20 , 40, 40, damage, range, 5);
		graphic = new ProyectileGraphic(this, "/gif/Proyectile_Sorcerer.gif");
	}

}
