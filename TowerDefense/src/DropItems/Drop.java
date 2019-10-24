package DropItems;

import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import gui.MapPanel;

@SuppressWarnings("serial")
public abstract class Drop extends JLabel{
	
	JLabel label;
	
	public Drop(int x, int y, int width, int height, String icon) {
		this.setBounds(x, y, width, height);
		this.setIcon(new ImageIcon (new ImageIcon(this.getClass().getResource(icon)).getImage().getScaledInstance(getWidth(), getHeight(), Image.SCALE_DEFAULT)));
		this.setVisible(true);
		label = this;
		
		this.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				MapPanel.getInstance().remove(label);
			}
		});
	}
	
	

}
