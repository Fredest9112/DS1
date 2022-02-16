package parques;

import java.util.Random;

public class Tablero {
	
	int[] tablero;
	int casEsp;


	public int[] getTablero() {
		return tablero;
	}

	public void setTablero(int tamanoTablero) {
		tablero = new int[tamanoTablero];
		Random rand = new Random();
		casEsp = tablero.length/10;
		tablero[0] = 1;
		tablero[tablero.length-1] = 1;
		for(int i = 0; i<tablero.length; i++) {
			if(tablero[i] != 1 && rand.nextBoolean() && casEsp>=1) {
				tablero[i] = getValidRandomNumber();
				casEsp--;
				System.out.println(tablero[i]);
			} else {
				continue;
			}
		}
		for(int i = 0; i<tablero.length; i++) {
			System.out.print(tablero[i]+", ");
		}
	}
	
	public int getValidRandomNumber() {
		Random rand = new Random();
		int num = rand.nextInt(tablero.length + tablero.length)-tablero.length;
		if(num != 0 && num != 1) {
			return num;
		} else {
			return getValidRandomNumber();
		}
	}
}
