package Juego;

public class Jugador {
	private int intentos;
	
	public Jugador(int intentos) {
		this.intentos = intentos;
	}
	
	public int mostrarIntentos() {
		return intentos;
	}
	
	public boolean jugar() {
		if(intentos > 0) {
			intentos--;	
			return true;
		}
		return false;
	}
}
