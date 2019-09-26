package Characters;

import graphics.DarkKnightGraphic;

public class DarkKnight extends Tower{

	public DarkKnight(int x, int y) {
		super(x, y);
		grafico = new DarkKnightGraphic(hitbox);
	}
}
