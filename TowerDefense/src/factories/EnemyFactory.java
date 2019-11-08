package factories;

import java.util.Random;

import enemies.*;

public class EnemyFactory {
	
	/**
	 * Genera un nuevo enemigo en un camino al azar 
	 * @return
	 */
	public static Enemy getEnemy() {
		
		Random tipoEnemigo = new Random();
		Random posicion = new Random();
		 
		switch (tipoEnemigo.nextInt(6)) {
		
		case 0:
			return new DragonKing(posicion.nextInt(7)+1);
		case 1:
			return new Prinny(posicion.nextInt(7)+1);
		case 2:
			return new Orc(posicion.nextInt(7)+1);
		case 3:
			return new WingedWarrior(posicion.nextInt(7)+1);
		case 4:
			return new Succubus(posicion.nextInt(7)+1);
		case 5:
			return new TwinDragon(posicion.nextInt(6)+1);
		default:
			return null;
		}
		
	}

}
