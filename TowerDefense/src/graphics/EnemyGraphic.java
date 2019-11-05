package graphics;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import enemies.Enemy;

public class EnemyGraphic {
	protected JLabel graphic;
	protected ImageIcon move;
	protected ImageIcon attack;
	protected Enemy enemy;
	
	public EnemyGraphic(Enemy e, String moveS, String attackS) {
		enemy = e;

		move = new ImageIcon (new ImageIcon(this.getClass().getResource(moveS)).getImage().getScaledInstance(e.getWidth(), e.getHeight(), Image.SCALE_DEFAULT));
		attack = new ImageIcon (new ImageIcon(this.getClass().getResource(attackS)).getImage().getScaledInstance(e.getWidth(), e.getHeight(), Image.SCALE_DEFAULT));
		
		graphic = new JLabel();
		graphic.setVisible(true);
		graphic.setBounds( e.getX(),  e.getY(), e.getWidth(), e.getHeight());
		
		this.startWalking();
		
		//eliminar enemigo en clic (sprint 3)
		graphic.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				enemy.die();
			}
		});
	}
	
	public JLabel getJLabel() {
		return graphic;
	}

	public void startWalking() {
		graphic.setIcon(move);
	}
	
	public void startAttacking() {
		graphic.setIcon(attack);
	}

}
