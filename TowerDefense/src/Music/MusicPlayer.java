package Music;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;


public class MusicPlayer {
	private AdvancedPlayer player;
	
	
	public MusicPlayer() {
		
	}
	
	public void inputSong(String path) {
		try {
			player=new AdvancedPlayer(this.getClass().getResourceAsStream(path));
		} catch (JavaLayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void playSong() {
		try {
			player.play();
		} catch (JavaLayerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void stopSong() {
		player.stop();
	}
	
	
	

}
