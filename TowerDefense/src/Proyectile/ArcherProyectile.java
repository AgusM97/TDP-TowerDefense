package Proyectile;

import graphics.ProyectileGraphic;

public class ArcherProyectile extends TowerProyectile {

	public ArcherProyectile(int x, int y,int damage,int range) {
		super(x-40 , y+50 , 40, 10, damage, range);
		graphic = new ProyectileGraphic(this, "/img/Proyectile_Archer.png");
	}

}
