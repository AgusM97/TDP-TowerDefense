package Game;

import java.awt.*;

public abstract class Entity {
	
	protected Rectangle hitbox; //rectangulo tiene pos. actual y dimensiones
	
	/**
	 * 
	 * @param x X correspondiente a la esquina superior izquierda del hitbox
	 * @param y Y correspondiente a la esquina superior izquierda del hitbox
	 * @param width Ancho del hitbox
	 * @param height Alto del hitbox
	 */
	public Entity(int x, int y, int width, int height) {
		hitbox = new Rectangle(x, y, width, height);
	}

	

	public int getY() {
		return hitbox.y;
	}

	public int getX() {
		return hitbox.x;
	}
	
	public int getWidth() {
		return hitbox.width;
	}
	
	public int getHeight() {
		return hitbox.height;
	}
	
	public boolean intersects(Entity e) {
		return hitbox.intersects(e.getX(), e.getY(), e.getWidth(), e.getHeight());
	}
	
	public boolean intersects(int x, int y, int width, int height) {
		return hitbox.intersects(x, y, width, height);
	}
}
