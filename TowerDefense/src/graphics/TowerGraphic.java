package graphics;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import Characters.Tower;

public class TowerGraphic {
	protected JLabel graphic;
	protected ImageIcon idle;
	protected ImageIcon attack;
	protected Tower t;

	public TowerGraphic(Tower t, String idleS, String attackS) {
		this.t = t;
		
		idle = new ImageIcon (new ImageIcon(this.getClass().getResource(idleS)).getImage().getScaledInstance(t.getWidth(), t.getHeight(), Image.SCALE_DEFAULT));
		attack = new ImageIcon (new ImageIcon(this.getClass().getResource(attackS)).getImage().getScaledInstance(t.getWidth(), t.getHeight(), Image.SCALE_DEFAULT));
		
		graphic = new JLabel();
		graphic.setVisible(true);
		graphic.setBounds( t.getX(),  t.getY(), t.getWidth(), t.getHeight());
		
		this.stopAttacking();
	}

	public JLabel getJLabel() {
		return graphic;
	}
	
	public void stopAttacking() {
		graphic.setIcon(idle);
	}
	
	public void startAttacking() {
		graphic.setIcon(attack);
	}
}
