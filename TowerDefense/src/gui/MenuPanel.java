package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Game.Game;
import ShopObjects.ShopItemBarricade;
import ShopObjects.ShopItemDestroyer;
import ShopObjects.ShopItemHealer;
import ShopObjects.ShopItemProfit;
import towers.Archer;
import towers.DarkKnight;
import towers.Maid;
import towers.Pirate;
import towers.Sorcerer;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ButtonGroup;
import java.awt.Color;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class MenuPanel extends JPanel {
	
	private GUI Principal;
	private static MenuPanel instance = null;
	private JTextField pointsText, coinsText;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private final ButtonGroup buttonGroup2 = new ButtonGroup();
	
	
	/* Panel  donde se agregan los botones y los oyentes de cada boton para realizar las tarea de compras para el
	 *  juego
	 */
	
	private MenuPanel(GUI g) {
		
		
		
		Principal=g;
		this.setVisible(true);
		this.setBounds(961, 0, 320, 720);
		this.setLayout(null);
		
		
		pointsText=new JTextField();
		pointsText.setText("Points: 0");
		pointsText.setBounds(71, 71, 84, 20);
		pointsText.setEditable(false);
		pointsText.setColumns(20);
		this.add(pointsText);
		
		
		coinsText=new JTextField();
		coinsText.setText("Coins: 0");
		coinsText.setBounds(165, 71, 84, 20);
		coinsText.setEditable(false);
		coinsText.setColumns(20);
		this.add(coinsText);
		
		JPanel panelCompras = new JPanel();
		panelCompras.setToolTipText("");
		panelCompras.setBorder(null);
		panelCompras.setBounds(10, 102, 293, 166);
		add(panelCompras);
		panelCompras.setLayout(null);
		
		JLabel lblTowersSale = new JLabel("Towers Sale");
		lblTowersSale.setForeground(Color.RED);
		lblTowersSale.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblTowersSale.setBounds(81, 11, 98, 26);
		panelCompras.add(lblTowersSale);
		
		JRadioButton rdbtnArcher = new JRadioButton("Archer");
		buttonGroup.add(rdbtnArcher);
		rdbtnArcher.setBounds(36, 44, 77, 23);
		panelCompras.add(rdbtnArcher);
		
		JRadioButton rdbDarkKnight = new JRadioButton("DarkKnight");
		buttonGroup.add(rdbDarkKnight);
		rdbDarkKnight.setBounds(172, 44, 98, 23);
		panelCompras.add(rdbDarkKnight);
		
		JRadioButton rdbtnMaid = new JRadioButton("Maid");
		buttonGroup.add(rdbtnMaid);
		rdbtnMaid.setBounds(36, 82, 77, 23);
		panelCompras.add(rdbtnMaid);
		
		JRadioButton rdbtnSorcerer = new JRadioButton("Sorcerer");
		buttonGroup.add(rdbtnSorcerer);
		rdbtnSorcerer.setBounds(92, 127, 92, 23);
		panelCompras.add(rdbtnSorcerer);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(52, 86, 46, 14);
		panelCompras.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(52, 48, 46, 14);
		panelCompras.add(lblNewLabel_1);
		
		JRadioButton rdbtnPirate = new JRadioButton("Pirate");
		rdbtnPirate.setBounds(178, 82, 92, 23);
		panelCompras.add(rdbtnPirate);
		buttonGroup.add(rdbtnPirate);
		
		JLabel labelArcher = new JLabel("");
		labelArcher.setBounds(0, 40, 30, 27);
		labelArcher.setIcon(new ImageIcon (new ImageIcon(this.getClass().getResource("/img/ArcherIcon.png")).getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));
		panelCompras.add(labelArcher);
		
		JLabel labelMaid = new JLabel("");
		labelMaid.setBounds(0, 78, 37, 30);
		labelMaid.setIcon(new ImageIcon (new ImageIcon(this.getClass().getResource("/img/MaidIcon.png")).getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));
		panelCompras.add(labelMaid);
		
		JLabel labelDarkKnight = new JLabel("");
		labelDarkKnight.setBounds(139, 40, 37, 27);
		labelDarkKnight.setIcon(new ImageIcon (new ImageIcon(this.getClass().getResource("/img/DarkKnightIcon.png")).getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));
		panelCompras.add(labelDarkKnight);
		
		JLabel labelPirate = new JLabel("");
		labelPirate.setBounds(139, 65, 37, 46);
		labelPirate.setIcon(new ImageIcon (new ImageIcon(this.getClass().getResource("/img/PirateIcon.png")).getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));
		panelCompras.add(labelPirate);
		
		JLabel lblSorcerer = new JLabel("");
		lblSorcerer.setBounds(62, 126, 30, 24);
		lblSorcerer.setIcon(new ImageIcon (new ImageIcon(this.getClass().getResource("/img/SorcererIcon.png")).getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));
		panelCompras.add(lblSorcerer);
		
		JButton btnComprarTower = new JButton("Buy Tower Selected");
		btnComprarTower.setEnabled(false);
		btnComprarTower.setBounds(84, 279, 144, 31);
		add(btnComprarTower);
		
		JPanel panelObjets = new JPanel();
		panelObjets.setBorder(null);
		panelObjets.setBounds(10, 325, 300, 153);
		add(panelObjets);
		panelObjets.setLayout(null);
		
		JLabel lblObjetsSale = new JLabel("Objets Sale");
		lblObjetsSale.setForeground(Color.RED);
		lblObjetsSale.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblObjetsSale.setBounds(105, 11, 98, 29);
		panelObjets.add(lblObjetsSale);
		
		JRadioButton rdbtnBarricade = new JRadioButton("Barricade");
		buttonGroup2.add(rdbtnBarricade);
		rdbtnBarricade.setBounds(36, 47, 93, 23);
		panelObjets.add(rdbtnBarricade);
		
		JRadioButton rdbtnHealer = new JRadioButton("Healer");
		buttonGroup2.add(rdbtnHealer);
		rdbtnHealer.setBounds(158, 47, 80, 23);
		panelObjets.add(rdbtnHealer);
		
		JRadioButton rdbtnProfit = new JRadioButton("Profit");
		buttonGroup2.add(rdbtnProfit);
		rdbtnProfit.setBounds(36, 93, 80, 23);
		panelObjets.add(rdbtnProfit);
		
		JRadioButton rdbtnDestroy = new JRadioButton("Destroyer");
		buttonGroup2.add(rdbtnDestroy);
		rdbtnDestroy.setBounds(158, 93, 80, 23);
		panelObjets.add(rdbtnDestroy);
		
		JButton btnComprarItem = new JButton("Buy Object Selected");
		btnComprarItem.setEnabled(false);
		btnComprarItem.setBounds(84, 489, 165, 40);
		add(btnComprarItem);
		
		JButton btnComenzar = new JButton("Start Game");
		btnComenzar.setForeground(Color.RED);
		btnComenzar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnComenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Game.startNewGame(Principal);
				btnComenzar.setEnabled(false);
				btnComprarTower.setEnabled(true);
				btnComprarItem.setEnabled(true);
			}
		});
		btnComenzar.setBounds(24, 22, 133, 23);
		add(btnComenzar);
		
		JButton btnTerminar = new JButton("Finish Game");
		btnTerminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				g.finishGame();
			}
		});
		btnTerminar.setForeground(Color.RED);
		btnTerminar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTerminar.setBounds(165, 22, 131, 23);
		add(btnTerminar);
		
		btnComprarTower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//Archer
				if ((rdbtnArcher.isSelected()) && (Game.getInstance().getCoins() >= (new Archer(0,0).getCost()))) {
					btnComprarTower.setEnabled(false);
					btnComprarItem.setEnabled(false);
					MapPanel.getInstance().addMouseListener( new MouseAdapter() {
					    public void mousePressed(MouseEvent e) {
					        Game.getInstance().addTower(new Archer(e.getX() / 80, e.getY() / 80));
					        btnComprarTower.setEnabled(true);
					        btnComprarItem.setEnabled(true);
							MapPanel.getInstance().removeMouseListener(this);
					    }
					});
				}
				if ((rdbtnArcher.isSelected()) && (Game.getInstance().getCoins()<(new Archer(0,0).getCost()))) {
					
					JOptionPane.showMessageDialog(null, "No hay suficiente dinero");					
				}
				
				//Dark Knight
				if ((rdbDarkKnight.isSelected()) && (Game.getInstance().getCoins()>=(new DarkKnight(0,0).getCost()))) {
					btnComprarTower.setEnabled(false);
					btnComprarItem.setEnabled(false);
					MapPanel.getInstance().addMouseListener( new MouseAdapter() {
					    public void mousePressed(MouseEvent e) {
					        Game.getInstance().addTower(new DarkKnight(e.getX() / 80, e.getY() / 80));
					        btnComprarTower.setEnabled(true);
					        btnComprarItem.setEnabled(true);
							MapPanel.getInstance().removeMouseListener(this);
					    }
					});
				}
				if ((rdbDarkKnight.isSelected()) && (Game.getInstance().getCoins()<(new DarkKnight(0,0).getCost()))) {
					
					JOptionPane.showMessageDialog(null, "No hay suficiente dinero");					
				}
				
				//Maid
				if ((rdbtnMaid.isSelected()) && (Game.getInstance().getCoins()>=(new Maid(0,0).getCost()))) {
					btnComprarTower.setEnabled(false);
					btnComprarItem.setEnabled(false);
					MapPanel.getInstance().addMouseListener( new MouseAdapter() {
					    public void mousePressed(MouseEvent e) {
					        Game.getInstance().addTower(new Maid(e.getX() / 80, e.getY() / 80));
					        btnComprarTower.setEnabled(true);
					        btnComprarItem.setEnabled(true);
							MapPanel.getInstance().removeMouseListener(this);
					    }
					});
				}
				if ((rdbtnMaid.isSelected()) && (Game.getInstance().getCoins()<(new Maid(0,0).getCost()))) {
					
					JOptionPane.showMessageDialog(null, "No hay suficiente dinero");					
				}
					
				//Pirate
				if ((rdbtnPirate.isSelected()) && (Game.getInstance().getCoins()>=(new Pirate(0,0).getCost()))) {
					btnComprarTower.setEnabled(false);
					btnComprarItem.setEnabled(false);
					MapPanel.getInstance().addMouseListener( new MouseAdapter() {
					    public void mousePressed(MouseEvent e) {
					        Game.getInstance().addTower(new Pirate(e.getX() / 80, e.getY() / 80));
					        btnComprarTower.setEnabled(true);
					        btnComprarItem.setEnabled(true);
							MapPanel.getInstance().removeMouseListener(this);
					    }
					});
				}
				if ((rdbtnPirate.isSelected()) && (Game.getInstance().getCoins()<(new Pirate(0,0).getCost()))) {
					
					JOptionPane.showMessageDialog(null, "No hay suficiente dinero");					
				}
				
				//Sorcerer
				if ((rdbtnSorcerer.isSelected()) && (Game.getInstance().getCoins()>=(new Sorcerer(0,0).getCost()))) {
					btnComprarTower.setEnabled(false);
					btnComprarItem.setEnabled(false);
					MapPanel.getInstance().addMouseListener( new MouseAdapter() {
					    public void mousePressed(MouseEvent e) {
					        Game.getInstance().addTower(new Sorcerer(e.getX() / 80, e.getY() / 80));
					        btnComprarTower.setEnabled(true);
					        btnComprarItem.setEnabled(true);
							MapPanel.getInstance().removeMouseListener(this);
					    }
					});
				}
				if ((rdbtnSorcerer.isSelected()) && (Game.getInstance().getCoins()<(new Sorcerer(0,0).getCost()))) {
					
					JOptionPane.showMessageDialog(null, "No hay suficiente dinero");					
				}
								
								
				
			
				
			}
		});
		
		btnComprarItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//Barricade
				if ((rdbtnBarricade.isSelected()) && (Game.getInstance().getCoins()>=20)) {
					btnComprarTower.setEnabled(false);
					btnComprarItem.setEnabled(false);
					MapPanel.getInstance().addMouseListener( new MouseAdapter() {
					    public void mousePressed(MouseEvent e) {
							Game.getInstance().subCoins(20);
					        Game.getInstance().addUnit(new ShopItemBarricade(e.getX() / 80, e.getY() / 80));
					        btnComprarTower.setEnabled(true);
					        btnComprarItem.setEnabled(true);
							MapPanel.getInstance().removeMouseListener(this);
					    }
					});
				}
				if ((rdbtnBarricade.isSelected()) && (Game.getInstance().getCoins()<20)) {
					
					JOptionPane.showMessageDialog(null, "No hay suficiente dinero");					
				}
					
				//Profit
				if ((rdbtnProfit.isSelected())  && (Game.getInstance().getCoins() >= 100)) {
					ShopItemProfit.profitOrNot();
				}
				if ((rdbtnProfit.isSelected()) && (Game.getInstance().getCoins() < 100)) {
					
					JOptionPane.showMessageDialog(null, "No hay suficiente dinero");					
				}
					
				//Healer
				if ((rdbtnHealer.isSelected()) && (Game.getInstance().getCoins()>=50)) {
					btnComprarTower.setEnabled(false);
					btnComprarItem.setEnabled(false);
					MapPanel.getInstance().addMouseListener( new MouseAdapter() {
					    public void mousePressed(MouseEvent e) {
							Game.getInstance().subCoins(50);
					        Game.getInstance().addUnit(new ShopItemHealer(e.getX() / 80, e.getY() / 80));
					        btnComprarTower.setEnabled(true);
					        btnComprarItem.setEnabled(true);
							MapPanel.getInstance().removeMouseListener(this);
					    }
					});
				}
				if ((rdbtnHealer.isSelected()) && (Game.getInstance().getCoins()<50)) {
					
					JOptionPane.showMessageDialog(null, "No hay suficiente dinero");					
				}
				
				//Destroyer
				if ((rdbtnDestroy.isSelected())  && (Game.getInstance().getCoins() >= 200)) {
					Game.getInstance().subCoins(200);
					ShopItemDestroyer.destroy();
				}
				if ((rdbtnDestroy.isSelected()) && (Game.getInstance().getCoins() < 200)) {
					
					JOptionPane.showMessageDialog(null, "No hay suficiente dinero");					
				}
			}
		});
		
		
			}

	public static MenuPanel getInstance(GUI g) {
		if(instance == null)
			instance = new MenuPanel(g);
		return instance;
	}
	
	public void setPoints(int points) {
		pointsText.setText("Points: "+ points);
		
	}

	public void setCoins(int coins) {
		coinsText.setText("Coins: "+ coins);
		
	}
}