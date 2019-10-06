package Game;

public class UpdaterThread extends Thread {

	protected Game game;
	
	
	public UpdaterThread(Game game) {
		this.game = game;
	}
	
	public void run() {
		while(true) {
			try {
				Thread.sleep(32);
			} catch (InterruptedException e) {e.printStackTrace();	}
			game.update();
		}
	}
}
