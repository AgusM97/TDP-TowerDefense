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
	protected String idle;
	protected String move;
	protected String attack;
	
	protected Enemy enemy;
	
	

	public EnemyGraphic(Enemy e, Rectangle hb, String idle) {
		enemy = e;

		
		graphic = new JLabel(new ImageIcon
				(new ImageIcon(this.getClass().getResource(idle)).getImage().getScaledInstance((int) hb.getWidth(), (int) hb.getHeight(), Image.SCALE_DEFAULT))
				);
		graphic.setVisible(true);
		graphic.setBounds( hb.x * 80,  hb.y * 80, (int) hb.getWidth(), (int) hb.getHeight());
		
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

}
