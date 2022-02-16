package parques;

import java.util.Scanner;

public class Juego {

	public static void main(String[] args) {
		System.out.println("Parqués");
		Tablero tablero = new Tablero();
		setJuegoInicial(tablero);
		Jugador jugador1 = new Jugador(tablero, 0);
		Jugador jugador2 = new Jugador(tablero, 0);
		empezarJuego(tablero, jugador1, jugador2);

	}

	private static void empezarJuego(Tablero tablero, Jugador jugador1, Jugador jugador2) {
		boolean continuaJuego = true;
		while(continuaJuego) {
			int pasosJ1 = jugador1.arrojaDado();
			System.out.println("Dado J1: "+pasosJ1);
			jugador1.avanzar(pasosJ1);
			System.out.println("J1:"+jugador1.avance);
			int pasosJ2 = jugador2.arrojaDado();
			System.out.println("Dado J2: "+pasosJ2);
			jugador2.avanzar(pasosJ2);
			System.out.println("J2:"+jugador2.avance);
			if(jugador1.avance == tablero.getTablero().length) {
				continuaJuego = false;
				System.out.println("Jugador 1 gana!");
			}
			if(jugador2.avance == tablero.getTablero().length) {
				continuaJuego = false;
				System.out.println("Jugador 2 gana!");
			}
		}
		
	}

	private static void setJuegoInicial(Tablero tablero) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Digite el tamaño del tablero: ");
			String entry = sc.next();
			int tamanoTablero = Integer.parseInt(entry);
			if(tamanoTablero<0) {
				System.out.println("El numero debe ser positivo");
				setJuegoInicial(tablero);
			} else {
				sc.close();
				tablero.setTablero(tamanoTablero);
			}
		} catch(NumberFormatException e) {
			System.out.println("El numero digitado debe ser un entero positivo");
			setJuegoInicial(tablero);
		}
	}
}
