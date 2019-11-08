package MapObjects;

import javax.swing.JLabel;

import Game.Unit;
import graphics.GenericUnitGraphic;


public abstract class MapItem extends Unit {
	protected GenericUnitGraphic graphic;
	
	/**
	 * 
	 * @param x X correspondiente a la esquina superior izquierda del hitbox
	 * @param y Y correspondiente a la esquina superior izquierda del hitbox
	 * @param dmg Daño que generan los ataques de la unidad
	 * @param range Rango de ataque
	 * @param life Vida de la unidad
	 * @param atSpeed Velocidad de ataque
	 */
	public MapItem(int x, int y, int dmg, int range, int life, int atSpeed) {
		super(x * 80, y * 80, dmg, range, life, atSpeed);
	}
	
	public JLabel getGraphic() {
		return graphic.getJLabel();
	}
	
	
}
