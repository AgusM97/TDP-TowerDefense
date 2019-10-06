package Characters;

import graphics.DarkKnightGraphic;

public class DarkKnight extends Tower{

	public DarkKnight(int x, int y) {
		super(x * 80, y * 80);
		grafico = new DarkKnightGraphic(hitbox);
	}

}
