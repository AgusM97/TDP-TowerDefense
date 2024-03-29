package Game;

import java.util.LinkedList;
import javax.swing.JOptionPane;

import DropItems.DropAttackPowerUp;
import DropItems.DropAttackSpeedUp;
import DropItems.DropProtection;
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
	protected LinkedList<Nivel> niveles;
	protected int nivelActual;

	
	
	
	//SINGLETON
	private Game() {
		unitList = new LinkedList<>();
		proyectileList = new LinkedList<>();
		auxUnitList = new LinkedList<>();
		auxProyectileList = new LinkedList<>();
		niveles = new LinkedList<Nivel>();
		points=0;
		coins=500;
		cantEnemy=0;
		gameOver = false;
		gameEnd = false;
		map = new Map();
		GUI.getInstance().add(map.getGrafico(), new Integer(0));
		niveles.add(0, new Nivel(1,2,2));
		niveles.add(1, new Nivel(2,3,4));
		nivelActual=0;
		
	}
	
	/**
	 * 
	 * @return Instancia actual del juego
	 */
	public static Game getInstance() {
		if(instance == null) {
			instance = new Game();
			
			Thread updater = new UpdaterThread();
			updater.start();
			
			Thread hiloEnemigo = new EnemyThread();
			hiloEnemigo.start();
			
			
		}
		
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

	public void subCoins(int cost) {
		coins -= cost;
	}
	
	public int getCoins() {
		return coins;
	}
	
	public void addEnemy(Enemy e) {
		auxUnitList.add(e);
		cantEnemy++;
		GUI.getInstance().add(e.getGraphic(), new Integer(2));
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
			GUI.getInstance().add(t.getGraphic(), new Integer(2));
		}
	}
	
	public void addUnit(Unit u) {
		auxUnitList.add(u);
		GUI.getInstance().add(u.getGraphic(), new Integer(1));
	}

	public void addProyectile(Proyectile p) {
		auxProyectileList.add(p);
		GUI.getInstance().add(p.getGraphic(), new Integer(3));
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

	/**
	 * Mata a todas las unidades
	 */
	public void killAll() {
		for(Unit u:unitList)
			u.receiveDamage(10000);
	}
	
	
	public void enemyDied() {
		cantEnemy--;
	}
	
	public boolean isGameOver() {
		return gameOver;
	}

	/**
	 * usado para notificar cuando no quedan mas enemigos por generar
	 */
	public void noMoreLevels() {
		gameEnd = true;
	}
	
	/**
	 * Finaliza la partida actual
	 * @param win
	 */
	public void finishGame(boolean win) {
		gameOver = true;
		if(win)
			JOptionPane.showMessageDialog(null, "YOU WIN!");
		else
			JOptionPane.showMessageDialog(null, "YOU LOSE!");
	}
	
	
	
	

	
	
	

	//UPDATERS
	
	/**
	 * Metodo principal de actualizacion
	 */
	public void update() {
		
		unitList.addAll(auxUnitList);
		auxUnitList.clear();
		
		LinkedList<Unit> toRemove = new LinkedList<>();
		
		for(Unit u1:unitList) {
			if(u1.getX() > 960) { //enemigo llego a la base y finaliza la partida
				Game.getInstance().finishGame(false);
				break;
			}
			
			else if(u1.getLife() <= 0) { //unidad esta muerta y se debe remover
				u1.die();
				MapPanel.getInstance().remove(u1.getGraphic());
				toRemove.add(u1); //agrega a la lista de unidads a remover
			}
			
			else { //unidad aun tiene vida y debe actuar
				for(Unit u2:unitList) {
					if(u1.isInRange(u2)) {
						u2.accept(u1.getVisitor());
						if(u1.hasOpponentInRange())
							break;
					}
				}
				
				//Si la unidad no tiene enemigos en su rango y esta atacando, deja de atacar
				if(!u1.hasOpponentInRange() && u1.isAttacking())
					u1.stopAttacking();

				//Si la unidad no esta atacando, intenta moverse
				if(!u1.isAttacking())
					u1.move();

				u1.setOpponentInRange(false); //resetea el valor para el prox recorrido
			}
		}
		
		//remueve todas las unidades muertas
		unitList.removeAll(toRemove);
		toRemove.clear();
		
		//actualiza la GUI
		GUI.getInstance().update(points, coins);
		
		//si no quedan mas enemigos en el mapa y se llegó al final del juego, gana
		if(cantEnemy == 0 && gameEnd && this.nivelActual()+1==niveles.size())
			finishGame(true);
	}

	/**
	 * Gestiona los proyectiles en cada actualizacion
	 */
	public void proyectileUpdate() {
		
		proyectileList.addAll(auxProyectileList);
		auxProyectileList.clear();
		
		LinkedList<Proyectile> toRemove = new LinkedList<>();
		
		for(Proyectile p:proyectileList) {
			if(p == null) {
				toRemove.add(p);
				continue;
			}
			
			p.move();
			
			for(Unit u:unitList) {
				if(p.intersects(u))
					u.accept(p.getVisitor());
			}
			
			//si proyectil llega a su maximo rango o ya impacto con algo, se remueve
			if(p.isSpent() || p.maxRange()) {
				GUI.getInstance().remove(p.getGraphic());
				toRemove.add(p);
			}
		}
		
		proyectileList.removeAll(toRemove);
		toRemove.clear();
	}

}
