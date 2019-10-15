package gui;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;
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
	private JLayeredPane mapPane;
	private JPanel menuPane;
	private JTextField pointsText;
	private Game game;

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
		mapPane = new JLayeredPane();
		mapPane.setVisible(true);
		mapPane.setBounds(0, 0, 960, 720);
		frame.getContentPane().add(mapPane);
		
		menuPane = new JPanel();
		menuPane.setVisible(true);
		menuPane.setBounds(961, 0, 320, 720);
		frame.getContentPane().add(menuPane);
		menuPane.setLayout(null);
		
		
		
		pointsText=new JTextField();
		pointsText.setText("Points: 0");
		pointsText.setBounds(77, 60, 166, 20);
		pointsText.setEditable(false);
		pointsText.setColumns(20);
		menuPane.add(pointsText);
		
		JButton btnAddOrc = new JButton("Add Orc");
		btnAddOrc.setBounds(77, 501, 144, 50);
		menuPane.add(btnAddOrc);
		btnAddOrc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Random r = new Random();
				game.addEnemy(new Orc(r.nextInt(7) + 1));
			}
		});
		
		JButton btnAddArcher = new JButton("Add Archer");
		btnAddArcher.setBounds(77, 562, 144, 50);
		menuPane.add(btnAddArcher);
		btnAddArcher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnAddArcher.setEnabled(false);
				mapPane.addMouseListener( new MouseAdapter() {
				    public void mousePressed(MouseEvent e) {
				        game.addTower(new Archer(e.getX() / 80, e.getY() / 80));
						btnAddArcher.setEnabled(true);
				        mapPane.removeMouseListener(this);
				    }
				});
			}
		});
		
		Game.startNewGame(this);
		game = Game.getInstance();
	}
	
	public void add(Component c, Integer i) {
		mapPane.add(c, i);
	}
	
	public void remove(Component c) {
		mapPane.remove(c);
	}
	
	public void update(int points) {
		pointsText.setText("Points: "+points);
		mapPane.revalidate();
		mapPane.repaint();
	}
}
