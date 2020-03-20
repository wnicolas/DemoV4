package sonido;

import java.applet.AudioClip;

public class JumpSound implements Strategy{

	@Override
	public void getSonido() {
		AudioClip sonido;
		sonido=java.applet.Applet.newAudioClip(getClass().getResource("/sonidos/saltar.wav"));
		sonido.play();
	}

}
