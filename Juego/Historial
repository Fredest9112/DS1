package Juego;

public class Historial {
	private int [] intentos;
	private int cont;
	
	public Historial(int numIntentos) {
			this.cont = 0;
			this.intentos = new int[numIntentos];
		
	}
	
	public boolean guardarIntento(int valor) {
		if(cont < intentos.length) {
			intentos[cont] = valor;
			cont++;
			return true;
		}
		return false;
		
	}
	
	public int[] mostrarIntentos() {
		return intentos;
	}
	
	public int mostrarUnIntento(int posicion) {
		if(posicion >= 0 && posicion < cont) {
			return intentos[posicion];
		}
		return -1;
	}
}
