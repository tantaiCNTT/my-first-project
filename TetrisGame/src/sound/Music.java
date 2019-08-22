package sound;

import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Music {
	public static final String playGame ="GamePlayAudio.wav";
	
	private static Music instance;
	private HashMap<String, AudioClip> audioMap;
	private Music() {
		audioMap = new HashMap<>();
		loadAudio();
	}
	public static Music getInstance() {
		if(instance == null) {
			instance = new Music();
		}
		return instance;
	}
	public void loadAudio() {
		putAudio(playGame);
	}
	public void stopAudio() {
		getAudio(playGame).stop();
	}
	
	
	
	
	public void putAudio(String fileName) {
		AudioClip audio = Applet.newAudioClip(Music.class.getResource(fileName));
		audioMap.put(fileName, audio);
		
	}
	public AudioClip getAudio(String fileName) {
		return audioMap.get(fileName) ;
			
		}
	}
