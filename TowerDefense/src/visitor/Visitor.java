package visitor;

import MapObjects.MapItemHole;
import MapObjects.MapItemSpikeTrap;
import ShopObjects.ShopItemBarricade;
import ShopObjects.ShopItemHealer;
import enemies.Enemy;
import towers.Tower;

public abstract class Visitor {

	public abstract void visit(Tower t);
	public abstract void visit(Enemy t);
	public abstract void visit(MapItemHole h);
	public abstract void visit(MapItemSpikeTrap s);
	public abstract void visit(ShopItemBarricade b);
	public abstract void visit(ShopItemHealer h);
}
