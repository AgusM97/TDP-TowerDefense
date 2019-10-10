package Characters;

import graphics.DarkKnightGraphic;

public class Archer extends Tower{
	
	public Archer(int x, int y) {
		super(x * 80, y * 80);
		grafico = new DarkKnightGraphic(hitbox);
	}

}
