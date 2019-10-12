package graphics;

import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import Characters.Enemy;

public class EnemyGraphic {
	protected JLabel graphic;
	protected ImageIcon idle;
	protected ImageIcon move;
	protected ImageIcon attack;
	protected Rectangle hitbox;
	
	protected Enemy enemy;
	

	public EnemyGraphic(Enemy e, Rectangle hb, String moveS, String attackS) {
		enemy = e;
		hitbox = hb;

		move = new ImageIcon (new ImageIcon(this.getClass().getResource(moveS)).getImage().getScaledInstance((int) hitbox.getWidth(), (int) hitbox.getHeight(), Image.SCALE_DEFAULT));
		attack = new ImageIcon (new ImageIcon(this.getClass().getResource(attackS)).getImage().getScaledInstance((int) hitbox.getWidth(), (int) hitbox.getHeight(), Image.SCALE_DEFAULT));
		
		graphic = new JLabel();
		graphic.setVisible(true);
		graphic.setBounds( hb.x,  hb.y, (int) hb.getWidth(), (int) hb.getHeight());
		
		//eliminar enemigo en clic (sprint 3)
		graphic.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				enemy.die();
			}
		});
	}
	
	public JLabel getGrafico() {
		return graphic;
	}

	public void startWalking() {
		graphic.setIcon(move);
	}
	
	public void startAttacking() {
		graphic.setIcon(attack);
	}

}
