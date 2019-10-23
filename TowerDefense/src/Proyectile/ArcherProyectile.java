package Proyectile;

import graphics.ProyectileGraphic;

public class ArcherProyectile extends TowerProyectile {

	public ArcherProyectile(int x, int y,int damage,int range) {
		super(x-20 , y+50 , 40, 10, damage, range, 5);
		graphic = new ProyectileGraphic(this, "/img/Proyectile_Archer.png");
	}

}
