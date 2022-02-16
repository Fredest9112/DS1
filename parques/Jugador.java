package parques;

import java.util.Random;

public class Jugador {
	
	Tablero tablero;
	int avance;
	
	public Jugador(Tablero tablero, int avanceInicial) {
		this.tablero = tablero;
		this.avance = avanceInicial;
	}
	
	public int avanzar(int pasos) {
		avance = avance + pasos;
		if(avance < tablero.getTablero().length) {
			avance = avance + tablero.getTablero()[avance-1];
			if(avance > tablero.getTablero().length) {
				avance = avance - tablero.getTablero()[avance-1];
				return avance;
			} else if(avance < 0) {
				return avance = 0;
			} else {
				return avance;
			}
		} else if(avance > tablero.getTablero().length) {
			avance = avance - pasos;
			return avance;
		} else if(avance < 1) {
			return avance = 0;
		} else {
			return avance;
		}
	}
	
	public int arrojaDado() {
		Random rand = new Random();
		int valorDado = rand.nextInt(13-1)+1;
		return valorDado;
	}
}
