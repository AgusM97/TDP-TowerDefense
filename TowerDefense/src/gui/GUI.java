package gui;

import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;

import Music.MusicPlayer;


public class GUI {

	private JFrame frame;
	private MapPanel mapPane;
	private MenuPanel menuPane;
	private static GUI instance;

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
		
		new Thread(){
			public void run(){
				  MusicPlayer music = new MusicPlayer();
				  music.inputSong("/mp3/Obscura.mp3");
				  music.run();
				    //Your play code
				  }
				}.start();
		
		
		
	}

	/**
	 * Create the application.
	 */
	protected GUI() {
		instance = initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private GUI initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setBounds(100, 100, 1280, 740);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//frame.setExtendedState(JFrame.MAXIMIZED_BOTH); 
		//frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		
		//panel con capas
		mapPane = MapPanel.getInstance();
		frame.getContentPane().add(mapPane);
		
		menuPane = MenuPanel.getInstance(this);
		frame.getContentPane().add(menuPane);
		
		return this;
		
	}
	
	public static GUI getInstance() {
		return instance;
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

	public void finishGame() {
		System.exit(0);
	}
	
}
