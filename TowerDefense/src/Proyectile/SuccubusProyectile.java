package Proyectile;

import graphics.ProyectileGraphic;
import visitor.EnemyProyectileVisitor;
import visitor.Visitor;

public class SuccubusProyectile extends EnemyProyectile{
	
	public SuccubusProyectile(int x, int y, int width, int height, int damage, int range, int speed) {
		super(x, y, width, height, damage, range, speed);
		graphic = new ProyectileGraphic(this, "/img/Proyectile_Succubus.png");
	}

}
