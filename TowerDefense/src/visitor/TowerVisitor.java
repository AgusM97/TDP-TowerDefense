package visitor;

import Characters.Enemy;
import Characters.Tower;
import DropItems.Drop;
import DropItems.DropAttackPowerUp;

public class TowerVisitor extends Visitor {

	protected Tower tower;
	
	public TowerVisitor(Tower tower) {
		this.tower = tower;
	}

	public void visit(Tower t) {}

	public void visit(Enemy e) {
		if(!tower.isAttacking())
			tower.startAttacking();
		tower.setOpponentInRange(true);
	}
	
	public void visit(DropAttackPowerUp buff){
		tower.buffAtackPower();
		
	}
	
	public void visit(DropAttackSpeedUp buff) {
		tower.buffAttackSpeed();
	}


}
