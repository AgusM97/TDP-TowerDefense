package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Characters.*;
import Game.Game;
import enemies.Orc;
import towers.Archer;
import towers.DarkKnight;
import towers.Maid;
import towers.Pirate;
import towers.Sorcerer;

@SuppressWarnings("serial")
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
		btnAddOrc.setBounds(70, 200, 130, 50);
		this.add(btnAddOrc);
		btnAddOrc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random r = new Random();
				Game.getInstance().addEnemy(new Orc(r.nextInt(7) + 1));
			}
		});
		
		JButton btnAddArcher = new JButton("Add Archer");
		btnAddArcher.setBounds(70, 350, 130, 40);
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
		
		JButton btnAddKnight = new JButton("Add Dark Knight");
		btnAddKnight.setBounds(70, 400, 130, 40);
		this.add(btnAddKnight);
		btnAddKnight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAddKnight.setEnabled(false);
				MapPanel.getInstance().addMouseListener( new MouseAdapter() {
				    public void mousePressed(MouseEvent e) {
				        Game.getInstance().addTower(new DarkKnight(e.getX() / 80, e.getY() / 80));
				        btnAddKnight.setEnabled(true);
						MapPanel.getInstance().removeMouseListener(this);
				    }
				});
			}
		});
		
		JButton btnAddPirate = new JButton("Add Pirate");
		btnAddPirate.setBounds(70, 450, 130, 40);
		this.add(btnAddPirate);
		btnAddPirate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAddPirate.setEnabled(false);
				MapPanel.getInstance().addMouseListener( new MouseAdapter() {
				    public void mousePressed(MouseEvent e) {
				        Game.getInstance().addTower(new Pirate(e.getX() / 80, e.getY() / 80));
				        btnAddPirate.setEnabled(true);
						MapPanel.getInstance().removeMouseListener(this);
				    }
				});
			}
		});
		
		JButton btnAddSorcerer = new JButton("Add Sorcerer");
		btnAddSorcerer.setBounds(70, 500, 130, 40);
		this.add(btnAddSorcerer);
		btnAddSorcerer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAddSorcerer.setEnabled(false);
				MapPanel.getInstance().addMouseListener( new MouseAdapter() {
				    public void mousePressed(MouseEvent e) {
				        Game.getInstance().addTower(new Sorcerer(e.getX() / 80, e.getY() / 80));
				        btnAddSorcerer.setEnabled(true);
						MapPanel.getInstance().removeMouseListener(this);
				    }
				});
			}
		});
		
		JButton btnAddMaid = new JButton("Add Maid");
		btnAddMaid.setBounds(70, 550, 130, 40);
		this.add(btnAddMaid);
		btnAddMaid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAddMaid.setEnabled(false);
				MapPanel.getInstance().addMouseListener( new MouseAdapter() {
				    public void mousePressed(MouseEvent e) {
				        Game.getInstance().addTower(new Maid(e.getX() / 80, e.getY() / 80));
				        btnAddMaid.setEnabled(true);
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
