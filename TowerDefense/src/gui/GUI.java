package gui;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import Game.Game;


public class GUI {

	private JFrame frame;
	private MapPanel mapPane;
	private MenuPanel menuPane;

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
		mapPane = MapPanel.getInstance();
		frame.getContentPane().add(mapPane);
		
		menuPane = MenuPanel.getInstance();
		frame.getContentPane().add(menuPane);
		
		
		
		Game.startNewGame(this);
	}
	
	public void add(Component c, Integer i) {
		mapPane.add(c, i);
	}
	
	public void remove(Component c) {
		mapPane.remove(c);
	}
	
	public void update(int points, int coins) {
		menuPane.setPoints(points);
		menuPane.setCoins(coins);
		mapPane.revalidate();
		mapPane.repaint();
	}
	
}
