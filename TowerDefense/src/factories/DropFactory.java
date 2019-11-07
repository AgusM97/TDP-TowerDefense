package factories;

import java.util.Random;

import DropItems.*;

public class DropFactory {

	public static Drop getDrop(int x, int y) {
		
		Random r = new Random();
		Drop d = null;
		
		//switch (r.nextInt(5)) {
		switch (4) {
		
		case 0:
			d = new DropGold(x, y);
			break;
		case 1:
			d = new DropBomb(x, y);
			break;
		case 2:
			d = new DropAttackSpeedUp(x, y);
			break;
		case 3:
			d = new DropAttackPowerUp(x, y);
			break;
		case 4:
			d = new DropProtection(x, y);
			break;
		
		}
		
		return d;
	}
	
}
