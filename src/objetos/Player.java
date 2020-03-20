package objetos;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import StateAction.KAttack;
import StateAction.KJump;
import StateAction.KStop;
import StateAction.KWalk;
import graficos.Assets;
import input.KeyBoard;
import matematica.Vector2D;
import sonido.AttackSound;
import sonido.JumpSound;
import sonido.Strategy;

public class Player extends GameObject {
	
	Strategy sonido;
	
	public Player(String tipo, Vector2D posicion) {
		super(tipo, posicion);
		
	}
	
	@Override
	public void actualizar() {
		if(KeyBoard.W)
			posicion.setY(posicion.getY()-5);
		if(KeyBoard.D)
			posicion.setX(posicion.getX()+5);
			Knight.setEstado(new KWalk());
		if(KeyBoard.S)
			posicion.setY(posicion.getY()+5);
		if(KeyBoard.A) {
			posicion.setX(posicion.getX()-5);
		}
		if(KeyBoard.J) {
			sonido=new JumpSound();
			Knight.setEstado(new KJump());
			sonido.getSonido();
		}
		if(KeyBoard.K) {
			sonido=new AttackSound();
			Knight.setEstado(new KAttack());
			sonido.getSonido();
		}
		if(KeyBoard.W==false&&KeyBoard.D==false && KeyBoard.S==false && KeyBoard.A==false && KeyBoard.J==false && KeyBoard.K==false) {
			Knight.setEstado(new KStop());
		}
		
	}
	
	@Override
	public void dibujar(Graphics g) {

	}
	
	
}
