package sonido;

import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import graficos.Loader;

public class AttackSound implements Strategy{

	@Override
	public void getSonido() {

		
			try {
				Clip clip= AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(AttackSound.class.getResourceAsStream("/sonidos/atacar.wav")));
				clip.setFramePosition(20000);
				clip.start();
			} catch (LineUnavailableException | IOException | UnsupportedAudioFileException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	
	}



}
