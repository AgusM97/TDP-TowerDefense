package Game;

import java.awt.*;

public abstract class Entity {
	
	protected Rectangle hitbox; //rectangulo tiene pos. actual y dimensiones
	protected int orientation; //notacion NumPad (6:front, 4:back, 8:up, etc)
	
	public Entity(int x, int y, int width, int height) {
		hitbox = new Rectangle(x, y, width, height);
	}

}
