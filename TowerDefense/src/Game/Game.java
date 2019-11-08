package Game;

import java.util.LinkedList;
import javax.swing.JOptionPane;

import DropItems.DropAttackPowerUp;
import DropItems.DropAttackSpeedUp;
import DropItems.DropProtection;
import MapObjects.MapItem;
import MapObjects.MapItemSpikeTrap;
import Proyectile.Proyectile;
import enemies.Enemy;
import gui.GUI;
import gui.MapPanel;
import threads.EnemyThread;
import threads.UpdaterThread;
import towers.Tower;


public class Game {
	protected static Game instance = null;
	protected Map map;
	protected int points, coins, cantEnemy;
	protected boolean gameOver, gameEnd;
	protected LinkedList<Unit> unitList;
	protected LinkedList<Unit> auxUnitList;
	protected LinkedList<Proyectile> proyectileList;
	protected LinkedList<Proyectile> auxProyectileList;
	protected GUI gui;
	protected LinkedList<Nivel> niveles;
	protected int nivelActual;

	
	
	
	//SINGLETON
	private Game(GUI g) {
		unitList = new LinkedList<>();
		proyectileList = new LinkedList<>();
		auxUnitList = new LinkedList<>();
		auxProyectileList = new LinkedList<>();
		niveles = new LinkedList<Nivel>();
		points=0;
		coins=1000;
		cantEnemy=0;
		gameOver = false;
		gameEnd = false;
		map = new Map();
		gui = g;
		gui.add(map.getGrafico(), new Integer(0));
		niveles.add(0, new Nivel(1,2,2));
		niveles.add(1, new Nivel(2,3,4));
		nivelActual=0;
	}
	
	public static void startNewGame(GUI g) {
		instance = new Game(g);
		
		Thread updater = new UpdaterThread();
		updater.start();
		
		Thread hiloEnemigo = new EnemyThread();
		hiloEnemigo.start();
	}
	
	public static Game getInstance() {
		return instance;
	}
	
	
	
	
	//METODOS
	
	public LinkedList<Nivel> niveles(){
		
		return niveles;
	}
	
	public void incrementarNivel() {
		
		nivelActual=nivelActual+1;
	}
	
	public int nivelActual() {
		
		return nivelActual;
	}
	
	public void addPoints(int p) {
		points += p;
	}
	
	public void addCoins(int c) {
		coins += c;
	}
	
	public void addEnemy(Enemy e) {
		auxUnitList.add(e);
		cantEnemy++;
		gui.add(e.getGraphic(), new Integer(2));
	}

	public void addTower(Tower t) {
		boolean posAvailable=true;
		
		for(Unit u:unitList) {
			if(u.intersects(t)) {
				posAvailable = false;
				break;
			}
		}
		
		if(posAvailable && t.getCost() <= coins && t.getY() > 79 && t.getY() < 80*8) {
			coins -= t.getCost();
			auxUnitList.add(t);
			gui.add(t.getGraphic(), new Integer(2));
		}
	}
	
	public void addUnit(Unit u) {
		auxUnitList.add(u);
		gui.add(u.getGraphic(), new Integer(1));
	}

	public void addProyectile(Proyectile p) {
		auxProyectileList.add(p);
		gui.add(p.getGraphic(), new Integer(3));
	}

	public void applyPowerUp(DropAttackPowerUp powerUp) {
		for(Unit u:unitList)
			if(u.getY() / 80 == powerUp.getY() / 80)
				u.accept(powerUp.getVisitor());
	}

	public void applyPowerUp(DropAttackSpeedUp powerUp) {
		for(Unit u:unitList)
			if(u.getY() / 80 == powerUp.getY() / 80)
				u.accept(powerUp.getVisitor());
	}

	public void applyPowerUp(DropProtection powerUp) {
		for(Unit u:unitList)
			if(u.getY() / 80 == powerUp.getY() / 80)
				u.accept(powerUp.getVisitor());
	}
	
	public void enemyDied() {
		cantEnemy--;
	}
	
	public boolean isGameOver() {
		return gameOver;
	}

	public void noMoreLevels() {
		gameEnd = true;
	}
	
	public void finishGame(boolean win) {
		gameOver = true;
		if(win)
			JOptionPane.showMessageDialog(null, "YOU WIN!");
		else
			JOptionPane.showMessageDialog(null, "YOU LOSE!");
	}
	
	
	
	

	
	
	

	//UPDATERS
	
	public void update() {
		
		unitList.addAll(auxUnitList);
		auxUnitList.clear();
		
		LinkedList<Unit> toRemove = new LinkedList<>();
		
		for(Unit u1:unitList) {
			if(u1.getX() > 960) { //enemigo llego a la base
				Game.getInstance().finishGame(false);
				break;
			}
			
			else if(u1.getLife() <= 0) { //unidad esta muerta y se debe remover
				u1.die();
				MapPanel.getInstance().remove(u1.getGraphic());
				toRemove.add(u1);
			}
			
			else {
				for(Unit u2:unitList) {
					if(u1.isInRange(u2)) {
						u2.accept(u1.getVisitor());
						if(u1.hasOpponentInRange())
							break;
					}
				}
				
				if(!u1.hasOpponentInRange() && u1.isAttacking())
					u1.stopAttacking();
				
				if(!u1.isAttacking())
					u1.move();

				u1.setOpponentInRange(false); //resetea el valor para el prox recorrido
			}
		}
		
		
		unitList.removeAll(toRemove);
		toRemove.clear();
		gui.update(points, coins);
		
		if(cantEnemy == 0 && gameEnd && this.nivelActual()+1==niveles.size())
			finishGame(true);
	}

	public void proyectileUpdate() {
		
		proyectileList.addAll(auxProyectileList);
		auxProyectileList.clear();
		
		LinkedList<Proyectile> toRemove = new LinkedList<>();
		
		for(Proyectile p:proyectileList) {
			if(p == null) { //no se xq puede pasar
				toRemove.add(p);
				continue;
			}
			
			p.move();
			
			for(Unit u:unitList) {
				if(p.intersects(u))
					u.accept(p.getVisitor());
			}
			
			if(p.isSpent() || p.maxRange()) {
				gui.remove(p.getGraphic());
				toRemove.add(p);
			}
		}
		
		proyectileList.removeAll(toRemove);
		toRemove.clear();
	}


}
