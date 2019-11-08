package Music;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.advanced.AdvancedPlayer;


public class MusicPlayer {
	private AdvancedPlayer player;
	
	
	public MusicPlayer() {
		
	}
	
	public void inputSong(String path) {
		FileInputStream fileInputStream;
		try {
			fileInputStream = new FileInputStream("D:\\Universidad\\TDP\\Proyecto\\GITHUB\\TDP-TowerDefense\\TowerDefense\\src\\mp3\\Obscura.mp3");
			player=new AdvancedPlayer(fileInputStream);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
