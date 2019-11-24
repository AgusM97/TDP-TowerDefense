package enemies;

import visitor.Visitor;

public abstract class EnemyAerial extends Enemy {

	public EnemyAerial(int y, int damage, int range, int life, int points, int coins, int speed, int attackSpeed) {
		super(y, damage, range, life, points, coins, speed, attackSpeed);
		// TODO Auto-generated constructor stub
	}


	public void accept(Visitor v) {
		v.visit(this);
	}
	

}
