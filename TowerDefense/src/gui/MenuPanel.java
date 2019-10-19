package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Characters.Archer;
import Characters.Orc;
import Game.Game;

public class MenuPanel extends JPanel {

	private static MenuPanel instance = null;
	private JTextField pointsText;
	
	private MenuPanel() {

		this.setVisible(true);
		this.setBounds(961, 0, 320, 720);
		this.setLayout(null);
		
		
		pointsText=new JTextField();
		pointsText.setText("Points: 0");
		pointsText.setBounds(77, 60, 166, 20);
		pointsText.setEditable(false);
		pointsText.setColumns(20);
		this.add(pointsText);

		
		JButton btnAddOrc = new JButton("Add Orc");
		btnAddOrc.setBounds(77, 501, 144, 50);
		this.add(btnAddOrc);
		btnAddOrc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random r = new Random();
				Game.getInstance().addEnemy(new Orc(r.nextInt(7) + 1));
			}
		});
		
		JButton btnAddArcher = new JButton("Add Archer");
		btnAddArcher.setBounds(77, 562, 144, 50);
		this.add(btnAddArcher);
		btnAddArcher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAddArcher.setEnabled(false);
				MapPanel.getInstance().addMouseListener( new MouseAdapter() {
				    public void mousePressed(MouseEvent e) {
				        Game.getInstance().addTower(new Archer(e.getX() / 80, e.getY() / 80));
						btnAddArcher.setEnabled(true);
						MapPanel.getInstance().removeMouseListener(this);
				    }
				});
			}
		});
	}

	public static MenuPanel getInstance() {
		if(instance == null)
			instance = new MenuPanel();
		return instance;
	}
	
	public void setPoints(int points) {
		pointsText.setText("Points: "+ points);
		
	}
	
}
