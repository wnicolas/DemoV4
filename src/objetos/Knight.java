package objetos;

import java.awt.Graphics;

import estados.EstadoJuego;
import graficos.Assets;
import matematica.Vector2D;

public class Knight extends Player implements Personaje{
	
	private final int TIPO_PERSONAJE=1;
	private Personaje sucesor;

	public Knight(String tipo, Vector2D posicion, Personaje s) {
		super(tipo, posicion);
		sucesor=s;
	}

	@Override
	public void setPersonaje(int tipo) {
		if(tipo==TIPO_PERSONAJE) {	
			
			EstadoJuego.Tipo_Personaje=1;
		}
		else {
			sucesor.setPersonaje(tipo);
		}
		
	}
	
	int i=0;
	@Override
	public void dibujar(Graphics g) {
		i++;
		i=i%5;
		g.drawImage(Assets.knight_attack[i],(int) posicion.getX(), (int)posicion.getY(), null);
		
	}

}
