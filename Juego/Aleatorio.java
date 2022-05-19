package Juego;

import java.util.Random;

public class Aleatorio {
	private int min;
	private int max;
	private int oculto;
	private Random num;
	
	public Aleatorio(int min, int max){
		this.min = min;
		this.max = max;
		this.num = new Random();
		generar();
	}
	
	public void generar() {
		oculto = num.nextInt((max+1)-min)+min;
	}
	
	public boolean consultar(int valor) {
		return valor == oculto;
	}
}
