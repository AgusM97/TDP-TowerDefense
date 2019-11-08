package graphics;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import towers.Tower;
import Game.Game;

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
		
		graphic.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				sell();
			}
		});
	}

	protected void sell() {
		int n = JOptionPane.showOptionDialog(null,
				"Desea vender la unidad?\n Ganancia: " + t.getCost()/2,
				"Vender",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE,
				null,null,null);

		if(n == 0 && t.getLife() > 0) {
			Game.getInstance().addCoins(t.getCost() / 2);
			t.die();
		}
		else if(n == 0 && t.getLife() <= 0){
			JOptionPane.showMessageDialog(null, "Unidad ya no existe.", "Demasiado tarde", JOptionPane.WARNING_MESSAGE);
		}
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
