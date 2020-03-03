package eu.andreirusu.daw;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UseMusicPlayer {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Music music=context.getBean("musicBean", Music.class);
		MusicPlayer musicplayer=context.getBean("musicPlayer", MusicPlayer.class);
		musicplayer.playMusic();
	}
}
