package application;

public class Jugador {
	private int intentos;
	
	public Jugador(int intentos) {
		this.intentos = intentos;
	}
	
	public int mostrarIntentos() {
		return intentos;
	}
	
	public boolean jugar() {
		intentos--;
		if(intentos > 0) {
			return true;
		}
		return false;
	}
}
