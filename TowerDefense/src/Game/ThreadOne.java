package Game;

public class ThreadOne extends Thread {

	protected Game game;
	
	
	public ThreadOne(Game game) {
		this.game = game;
	}
	
	public void run() {
		while(true) {
			/*try {
				Thread.sleep(500);
				System.out.println("running");
			} catch (InterruptedException e) {e.printStackTrace();	}*/
			game.update();
		}
	}
}
