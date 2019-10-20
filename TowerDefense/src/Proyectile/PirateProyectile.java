package Proyectile;

import graphics.ProyectileGraphic;

public class PirateProyectile extends TowerProyectile {
	
	public PirateProyectile(int x, int y,int damage,int range) {
		super(x-40 , y+50 , 40, 10, damage, range);
		graphic = new ProyectileGraphic(this, "/img/Proyectile_Pirate.png");
	}
}
