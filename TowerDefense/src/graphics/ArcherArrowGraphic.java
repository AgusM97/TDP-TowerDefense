package graphics;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Proyectile.Proyectile;

public class ArcherArrowGraphic extends ProyectileGraphic {
	protected JLabel graphic;
	protected ImageIcon shot;
	
	public ArcherArrowGraphic(Proyectile p,String shotS) {
		super(p,"/img/Proyectile -Archer'sArrow");
		shot = new ImageIcon (new ImageIcon(this.getClass().getResource(shotS)).getImage().getScaledInstance(p.getWidth(), p.getHeight(), Image.SCALE_DEFAULT));
		
		
		graphic = new JLabel();
		graphic.setVisible(true);
		graphic.setBounds( p.getX(),  p.getY(), p.getWidth(), p.getHeight());
	}


}
