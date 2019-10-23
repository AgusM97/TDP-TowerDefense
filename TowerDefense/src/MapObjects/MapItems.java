package MapObjects;

import javax.swing.JLabel;

import visitor.Visitor;

public abstract class MapItems {
	
	public Drop(int x, int y, int width, int height) {
		super(x,y,width,height);
	}
	
	public JLabel getGraphic() {
		return graphic.getJLabel();
	}
	
	public Visitor getVisitor() {
		return visitor;
	}

}
