package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLayeredPane;

import Game.Game;

public class GUI {

	private JFrame frame;
	private JLayeredPane pane;

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
		
		Game j= new Game(pane);
	}
}
