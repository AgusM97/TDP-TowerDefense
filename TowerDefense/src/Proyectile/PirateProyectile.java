package Proyectile;

import graphics.ProyectileGraphic;

public class PirateProyectile extends TowerProyectile {
	
	public PirateProyectile(int x, int y,int damage,int range) {
		super(x-40 , y+40 , 40, 20, damage, range, 5);
		graphic = new ProyectileGraphic(this, "/img/Proyectile_Pirate.png");
	}
}
