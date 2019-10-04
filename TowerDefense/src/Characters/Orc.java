package Characters;

import graphics.OrcGraphic;

public class Orc extends Enemy{

	public Orc(int y) {
		super(0, y);
		graphic = new OrcGraphic(this, hitbox);
		points = 100;
		life = 100;
		speed = 2;
	}

}
