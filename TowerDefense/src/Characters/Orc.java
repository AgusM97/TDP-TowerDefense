package Characters;

import graphics.OrcGraphic;

public class Orc extends Enemy{

	public Orc(int x, int y) {
		super(x, y);
		graphic = new OrcGraphic(this, hitbox);
		points = 100;
		life = 100;
	}

}
