package Proyectile;

import visitor.Visitor;

public class ArcherArrow extends Proyectile {

	public ArcherArrow(int x, int y, int width, int height,int damage,int range) {
		super(x, y, width, height,damage,range);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void accept(Visitor v) {
		
		
	}

}
