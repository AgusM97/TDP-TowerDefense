package gui;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JTextField;

import Characters.*;
import Game.Game;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;
import java.awt.event.ActionEvent;

public class GUI {

	private JFrame frame;
	private JLayeredPane pane;
	private JTextField pointsText;
	private Game game;
	private JButton btnAddArcher;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI window = new GUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1280, 750);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		
		//panel con capas
		pane = new JLayeredPane();
		pane.setVisible(true);
		pane.setBounds(0, 0, 1280, 750);
		frame.getContentPane().add(pane);
		
		pointsText=new JTextField();
		pointsText.setText("Points: 0");
		pointsText.setBounds(1100, 50, 100, 20);
		pointsText.setEditable(false);
		pointsText.setColumns(20);
		pane.add(pointsText);
		
		JButton btnAddOrc = new JButton("Add Orc");
		btnAddOrc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random r = new Random();
				game.addEnemy(new Orc(r.nextInt(7) + 1));
			}
		});
		btnAddOrc.setBounds(1065, 486, 144, 50);
		pane.add(btnAddOrc);
		
		btnAddArcher = new JButton("Add Archer");
		btnAddArcher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAddArcher.setEnabled(false);
				pane.addMouseListener( new MouseAdapter() {
				    public void mousePressed(MouseEvent e) {
				        game.addTower(new Archer(e.getX() / 80, e.getY() / 80));
						btnAddArcher.setEnabled(true);
				        pane.removeMouseListener(this);
				    }
				});
			}
		});
		btnAddArcher.setBounds(1065, 547, 144, 50);
		pane.add(btnAddArcher);
		
		game= new Game(this);
	}
	
	public void add(Component c, Integer i) {
		pane.add(c, i);
	}
	
	public void remove(Component c) {
		pane.remove(c);
	}
	
	public void update(int points) {
		pointsText.setText("Points: "+points);
		pane.revalidate();
		pane.repaint();
	}
}
