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
	private MapPanel mapPane;
	private MenuPanel menuPane;
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
		mapPane = MapPanel.getInstance();
		frame.getContentPane().add(mapPane);
		
		menuPane = MenuPanel.getInstance();
		frame.getContentPane().add(menuPane);
		
		
		
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
		menuPane.setPoints(points);
		mapPane.revalidate();
		mapPane.repaint();
	}
	
	public void actualizar() {
		mapPane.revalidate();
		mapPane.repaint();
	}
	
}
