package Characters;

import graphics.ArcherGraphic;

public class Archer extends Tower{
	
	public Archer(int x, int y) {
		super(x * 80, y * 80);
		grafico = new ArcherGraphic(hitbox);
	}

}
