package graphics;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import ShopObjects.ShopItem;


public class ShopItemGraphic {
	protected JLabel graphic;
	protected ImageIcon item;
	protected ShopItem m;
	
	public ShopItemGraphic(ShopItem m,String itemS) {
		item = new ImageIcon (new ImageIcon(this.getClass().getResource(itemS)).getImage().getScaledInstance(m.getWidth(), m.getHeight(), Image.SCALE_DEFAULT));
		
		graphic = new JLabel();
		graphic.setVisible(true);
		graphic.setBounds( m.getX(),  m.getY(), m.getWidth(), m.getHeight());
	}
	
	public JLabel getJLabel() {
		return graphic;
	}
	
	public void changeIcon(String itemS) {
		item = new ImageIcon (new ImageIcon(this.getClass().getResource(itemS)).getImage().getScaledInstance(m.getWidth(), m.getHeight(), Image.SCALE_DEFAULT));
	}

}
