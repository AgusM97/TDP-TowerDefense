package Game;

public class UpdaterThread extends Thread {

	
	public void run() {
		while(!Game.getInstance().isGameOver()) {
			try {
				Thread.sleep(32);
			} catch (InterruptedException e) {e.printStackTrace();	}
			Game.getInstance().update();
			Game.getInstance().proyectileUpdate();
		} 
	}
	
}
