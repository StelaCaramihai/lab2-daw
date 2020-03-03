package eu.andreirusu.daw;

public class MusicPlayer {
	private Music music;
	
	public MusicPlayer(Music music) {
		this.music = music;
	}
	
	public void playMusic() {
		//music = new ClassicalMusic();
		//music =new RockMusic();
		System.out.println(music.getSong());
	}
}
