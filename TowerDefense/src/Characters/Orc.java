package Characters;

import Game.Enemy;
import graphics.OrcGraphic;

public class Orc extends Enemy{

	public Orc(int x, int y) {
		super(x, y);
		grafico = new OrcGraphic(hitbox);
	}

}
