package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedList;

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
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import java.awt.Color;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class MenuPanel extends JPanel {
	
	private static MenuPanel instance = null;
	private JTextField pointsText, coinsText;
	protected LinkedList<JButton> botones;
	
	
	/* Panel  donde se agregan los botones y los oyentes de cada boton para realizar las tarea de compras para el
	 *  juego
	 */
	
	private MenuPanel(GUI g) {
		
		
		
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
		
		botones = new LinkedList<>();
		
		JPanel panelCompras = new JPanel();
		panelCompras.setToolTipText("");
		panelCompras.setBorder(null);
		panelCompras.setBounds(0, 147, 320, 221);
		add(panelCompras);
		panelCompras.setLayout(null);
		
		JLabel lblTowersSale = new JLabel("Towers Sale");
		lblTowersSale.setForeground(Color.RED);
		lblTowersSale.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblTowersSale.setBounds(124, 0, 98, 26);
		panelCompras.add(lblTowersSale);
		
		JLabel labelArcher = new JLabel("");
		labelArcher.setBounds(0, 40, 30, 27);
		labelArcher.setIcon(new ImageIcon (new ImageIcon(this.getClass().getResource("/img/ArcherIcon.png")).getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));
		panelCompras.add(labelArcher);
		
		JLabel labelMaid = new JLabel("");
		labelMaid.setBounds(0, 89, 37, 30);
		labelMaid.setIcon(new ImageIcon (new ImageIcon(this.getClass().getResource("/img/MaidIcon.png")).getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));
		panelCompras.add(labelMaid);
		
		JLabel labelDarkKnight = new JLabel("");
		labelDarkKnight.setBounds(161, 40, 37, 27);
		labelDarkKnight.setIcon(new ImageIcon (new ImageIcon(this.getClass().getResource("/img/DarkKnightIcon.png")).getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));
		panelCompras.add(labelDarkKnight);
		
		JLabel labelPirate = new JLabel("");
		labelPirate.setBounds(161, 77, 30, 54);
		labelPirate.setIcon(new ImageIcon (new ImageIcon(this.getClass().getResource("/img/PirateIcon.png")).getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));
		panelCompras.add(labelPirate);
		
		JLabel lblSorcerer = new JLabel("");
		lblSorcerer.setBounds(95, 155, 30, 24);
		lblSorcerer.setIcon(new ImageIcon (new ImageIcon(this.getClass().getResource("/img/SorcererIcon.png")).getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));
		panelCompras.add(lblSorcerer);
		
		JPanel panelObjets = new JPanel();
		panelObjets.setBorder(null);
		panelObjets.setBounds(0, 397, 320, 210);
		add(panelObjets);
		panelObjets.setLayout(null);
		
		JLabel lblObjetsSale = new JLabel("Objets Sale");
		lblObjetsSale.setForeground(Color.RED);
		lblObjetsSale.setFont(new Font("Times New Roman", Font.ITALIC, 16));
		lblObjetsSale.setBounds(136, 11, 98, 29);
		panelObjets.add(lblObjetsSale);
		
		JButton BotonArcher = new JButton("Buy Archer");
		BotonArcher.setEnabled(false);
		botones.add(BotonArcher);
		
		JButton BotonDarkknight = new JButton("Buy DarkKnight");
		BotonDarkknight.setEnabled(false);
		botones.add(BotonDarkknight);
		
		JButton BotonMaid = new JButton("Buy Maid");
		BotonMaid.setEnabled(false);
		botones.add(BotonMaid);
		
		JButton BotonPirate = new JButton("Buy Pirate");
		BotonPirate.setEnabled(false);
		botones.add(BotonPirate);
		
		JButton BotonSorcerer = new JButton("Buy Sorcerer");
		BotonSorcerer.setEnabled(false);
		botones.add(BotonSorcerer);
		
		JButton BotonBarricade = new JButton("Buy Barricade");
		BotonBarricade.setEnabled(false);
		botones.add(BotonBarricade);
		
		JButton BotonHealer = new JButton("Buy Healer");
		BotonHealer.setEnabled(false);
		botones.add(BotonHealer);
		
		JButton BotonProfit = new JButton("Buy Profit");
		BotonProfit.setEnabled(false);
		botones.add(BotonProfit);
		
		JButton BotonDestroyer = new JButton("Buy Destroyer");
		BotonDestroyer.setEnabled(false);
		botones.add(BotonDestroyer);
		
		
		BotonBarricade.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Game.getInstance().getCoins()>=20) {
					deshabilitarBotones();
					
					MapPanel.getInstance().addMouseListener( new MouseAdapter() {
					    public void mousePressed(MouseEvent e) {
							Game.getInstance().subCoins(20);
					        Game.getInstance().addUnit(new ShopItemBarricade(e.getX() / 80, e.getY() / 80));
					        
							MapPanel.getInstance().removeMouseListener(this);
							habilitarBotones();
					    }
					});
				}
				else if (Game.getInstance().getCoins()<20) {
					
					JOptionPane.showMessageDialog(null, "No hay suficiente dinero");					
				}
			}
		});
		BotonBarricade.setBounds(125, 43, 121, 23);
		panelObjets.add(BotonBarricade);
		
		//JButton BotonHealer = new JButton("Buy Healer");
		//BotonHealer.setEnabled(false);
		BotonHealer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Game.getInstance().getCoins()>=50) {
					deshabilitarBotones();
					
					MapPanel.getInstance().addMouseListener( new MouseAdapter() {
					    public void mousePressed(MouseEvent e) {
							Game.getInstance().subCoins(50);
					        Game.getInstance().addUnit(new ShopItemHealer(e.getX() / 80, e.getY() / 80));
					        
							MapPanel.getInstance().removeMouseListener(this);
							habilitarBotones();
					    }
					});
				}
				else if (Game.getInstance().getCoins()<50) {
					
					JOptionPane.showMessageDialog(null, "No hay suficiente dinero");					
				}
			}
		});
		BotonHealer.setBounds(125, 77, 121, 23);
		panelObjets.add(BotonHealer);
		
		//JButton BotonProfit = new JButton("Buy Profit");
		//BotonProfit.setEnabled(false);
		BotonProfit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Game.getInstance().getCoins() >= 100) {
					ShopItemProfit.profitOrNot();
				}
				else if (Game.getInstance().getCoins() < 100) {
					
					JOptionPane.showMessageDialog(null, "No hay suficiente dinero");					
				}
			}
		});
		BotonProfit.setBounds(127, 111, 119, 23);
		panelObjets.add(BotonProfit);
		
		//JButton BotonDestroyer = new JButton("Buy Destroyer");
		//BotonDestroyer.setEnabled(false);
		BotonDestroyer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Game.getInstance().getCoins() >= 200) {
					Game.getInstance().subCoins(200);
					ShopItemDestroyer.destroy();
				}
				else if (Game.getInstance().getCoins() < 200) {
					
					JOptionPane.showMessageDialog(null, "No hay suficiente dinero");					
				}
			}
		});
		BotonDestroyer.setBounds(125, 145, 121, 23);
		panelObjets.add(BotonDestroyer);
		
		JLabel labelBarricade = new JLabel("");
		labelBarricade.setIcon(new ImageIcon (new ImageIcon(this.getClass().getResource("/img/CorpsePile.png")).getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));
		labelBarricade.setBounds(75, 30, 30, 44);
		panelObjets.add(labelBarricade);
		
		JLabel labelHealer = new JLabel("");
		labelHealer.setIcon(new ImageIcon (new ImageIcon(this.getClass().getResource("/img/ShopItems_Heal.png")).getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));
		labelHealer.setBounds(75, 71, 30, 29);
		panelObjets.add(labelHealer);
		
		JLabel labelProfit = new JLabel("");
		labelProfit.setIcon(new ImageIcon (new ImageIcon(this.getClass().getResource("/img/ShopItem_Profit.png")).getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));
		labelProfit.setBounds(75, 105, 46, 29);
		panelObjets.add(labelProfit);
		
		JLabel labelDestroyer = new JLabel("");
		labelDestroyer.setIcon(new ImageIcon (new ImageIcon(this.getClass().getResource("/img/ShopItem_Destroyer.png")).getImage().getScaledInstance(30,30, Image.SCALE_DEFAULT)));
		labelDestroyer.setBounds(75, 139, 46, 29);
		panelObjets.add(labelDestroyer);
		
		JButton btnComenzar = new JButton("Start Game");
		btnComenzar.setForeground(Color.RED);
		btnComenzar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnComenzar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
					
						try {
							Game.getInstance();
						} catch (Exception e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
					
				
				
				btnComenzar.setEnabled(false);
				BotonArcher.setEnabled(true);
				BotonDarkknight.setEnabled(true);
				BotonMaid.setEnabled(true);
				BotonPirate.setEnabled(true);
				BotonSorcerer.setEnabled(true);
				BotonBarricade.setEnabled(true);
				BotonHealer.setEnabled(true);
				BotonProfit.setEnabled(true);
				BotonDestroyer.setEnabled(true);
				
				
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
		//JButton BotonArcher = new JButton("Buy Archer");
		BotonArcher.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Game.getInstance().getCoins() >= (new Archer(0,0).getCost())) {
					deshabilitarBotones();
					
					MapPanel.getInstance().addMouseListener( new MouseAdapter() {
					    public void mousePressed(MouseEvent e) {
					        Game.getInstance().addTower(new Archer(e.getX() / 80, e.getY() / 80));
					        MapPanel.getInstance().removeMouseListener(this);
					        habilitarBotones();
					    }
					});
				}
				else if (Game.getInstance().getCoins()<(new Archer(0,0).getCost())) {
					
					JOptionPane.showMessageDialog(null, "No hay suficiente dinero");					
				}
			}
		});
		BotonArcher.setBounds(40, 40, 98, 23);
		panelCompras.add(BotonArcher);
		
		//JButton BotonDarkknight = new JButton("Buy DarkKnight");
		BotonDarkknight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Game.getInstance().getCoins()>=(new DarkKnight(0,0).getCost())) {
					deshabilitarBotones();
					MapPanel.getInstance().addMouseListener( new MouseAdapter() {
					    public void mousePressed(MouseEvent e) {
					        Game.getInstance().addTower(new DarkKnight(e.getX() / 80, e.getY() / 80));
					       	MapPanel.getInstance().removeMouseListener(this);
					       	habilitarBotones();
					    }
					});
				}
				else if (Game.getInstance().getCoins()<(new DarkKnight(0,0).getCost())) {
					
					JOptionPane.showMessageDialog(null, "No hay suficiente dinero");					
				}
			}
		});
		BotonDarkknight.setBounds(198, 40, 122, 23);
		panelCompras.add(BotonDarkknight);
		
		//JButton BotonMaid = new JButton("Buy Maid");
		BotonMaid.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Game.getInstance().getCoins()>=(new Maid(0,0).getCost())) {
					deshabilitarBotones();
					
					MapPanel.getInstance().addMouseListener( new MouseAdapter() {
					    public void mousePressed(MouseEvent e) {
					        Game.getInstance().addTower(new Maid(e.getX() / 80, e.getY() / 80));
					        
							MapPanel.getInstance().removeMouseListener(this);
							habilitarBotones();
					    }
					});
				}
				else if (Game.getInstance().getCoins()<(new Maid(0,0).getCost())) {
					
					JOptionPane.showMessageDialog(null, "No hay suficiente dinero");					
				}
			}
		});
		BotonMaid.setBounds(49, 96, 87, 23);
		panelCompras.add(BotonMaid);
		
		//JButton BotonPirate = new JButton("Buy Pirate");
		BotonPirate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Game.getInstance().getCoins()>=(new Pirate(0,0).getCost())) {
					deshabilitarBotones();
					
					MapPanel.getInstance().addMouseListener( new MouseAdapter() {
					    public void mousePressed(MouseEvent e) {
					        Game.getInstance().addTower(new Pirate(e.getX() / 80, e.getY() / 80));
					        
							MapPanel.getInstance().removeMouseListener(this);
							habilitarBotones();
					    }
					});
				}
				else if (Game.getInstance().getCoins()<(new Pirate(0,0).getCost())) {
					
					JOptionPane.showMessageDialog(null, "No hay suficiente dinero");					
				}
			}
		});
		BotonPirate.setBounds(214, 96, 96, 23);
		panelCompras.add(BotonPirate);
		
		//JButton BotonSorcerer = new JButton("Buy Sorcerer");
		BotonSorcerer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (Game.getInstance().getCoins()>=(new Sorcerer(0,0).getCost())) {
					deshabilitarBotones();
					
					MapPanel.getInstance().addMouseListener( new MouseAdapter() {
					    public void mousePressed(MouseEvent e) {
					        Game.getInstance().addTower(new Sorcerer(e.getX() / 80, e.getY() / 80));
					        
							MapPanel.getInstance().removeMouseListener(this);
							habilitarBotones();
					    }
					});
				}
				else if (Game.getInstance().getCoins()<(new Sorcerer(0,0).getCost())) {
					
					JOptionPane.showMessageDialog(null, "No hay suficiente dinero");					
				}
			}
		});
		BotonSorcerer.setBounds(131, 155, 111, 23);
		panelCompras.add(BotonSorcerer);
		
		
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
	
	protected void deshabilitarBotones() {
		
		for (JButton boton:botones) {
			boton.setEnabled(false);
		}
	}
	
	protected void habilitarBotones() {
		
		for(JButton boton:botones) {
			boton.setEnabled(true);
		}
	}
}