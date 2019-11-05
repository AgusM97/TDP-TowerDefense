package factories;

import java.util.Random;

import enemies.DragonKing;
import enemies.Enemy;
import enemies.Orc;
import enemies.Prinny;
import enemies.Succubus;
import enemies.TwinDragon;
import enemies.WingedWarrior;

public class EnemyFactory {
	
public static Enemy getEnemy() {
		
		Random tipoEnemigo = new Random();
		Random posicion = new Random();
		 
		switch (tipoEnemigo.nextInt(7)) {
		
		case 0:
			return new DragonKing(posicion.nextInt(7)+1);
		case 1:
			//return new FloraBeast(posicion.nextInt(7)+1);
			return new Prinny(posicion.nextInt(7)+1);
		case 2:
			return new Orc(posicion.nextInt(7)+1);
		case 3:
			return new Prinny(posicion.nextInt(7)+1);
		case 4:
			return new Succubus(posicion.nextInt(7)+1);
		case 5:
			return new TwinDragon(posicion.nextInt(6)+1);
		case 6:
			return new WingedWarrior(posicion.nextInt(7)+1);
		default:
			return null;
		}
		
	}

}
