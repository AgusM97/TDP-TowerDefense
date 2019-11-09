package Music;



import javazoom.jl.decoder.JavaLayerException;

import javazoom.jl.player.advanced.AdvancedPlayer;
import javazoom.jl.player.advanced.PlaybackListener;


public class MusicPlayer extends PlaybackListener implements Runnable{
	private AdvancedPlayer player;
	private Thread playerThread; 
	
	
	public MusicPlayer() {
		
	}
	
	public void inputSong(String path) {
		try {
			player=new AdvancedPlayer(this.getClass().getResourceAsStream(path));
		} catch (JavaLayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		this.player.setPlayBackListener(this);

        this.playerThread = new Thread(this, "AudioPlayerThread");
	
		
	}
	
		
	public void stopSong() {
		player.stop();
	}

	

	public void run() {
		try
        {
            this.player.play();
        }
        catch (javazoom.jl.decoder.JavaLayerException ex)
        {
            ex.printStackTrace();
        }
		
	}

}