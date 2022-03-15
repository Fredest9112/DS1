package marathonProgramming;

import java.util.Scanner;

public class LuckyDivision {

	public static void main(String[] args) {
		int [] fourSevenNumbs = new int[126];
		fourSevenNumbs[0] = 4;
		fourSevenNumbs[1] = 7;
		int cont = 2;
		int min = 0;
		int max = 1;
		int mult = 10;
		int base = 2;
		int contExp = 0;
		int var = 0;
		int exp2 = 0;
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		first:
		for(int i = 0; i<=1; i++) {
			for(int j = min; j<=max; j++) {
				if(cont > 125) {
					System.out.println("NO");
					break first;
				} else {
					fourSevenNumbs[cont] = fourSevenNumbs[i]*mult+fourSevenNumbs[j];
					if(isLuckyNumber(fourSevenNumbs[cont], input)) {
						System.out.println("YES");
						break first;
					}
				}
				if(cont == var) {
					min = min+exp2;
					max = cont;
					i = 0;
					mult = mult*10;
				}
				cont++;
			}
			if(i==0) {
				contExp ++;
				exp2 = exp(base, contExp);
				var = exp(base, contExp)+cont-1;
			}
		}
		sc.close();
//		for(int i = 0; i<126; i++) {
//			System.out.println(fourSevenNumbs[i]+" ");
//		}
	}

	private static boolean isLuckyNumber(int luckyNumb, int input) {
		if(input%luckyNumb == 0 || input%4==0 || input%7==0) {
			return true;
		} else {
			return false;
		}
	}

	private static int exp(int base, int contExp) {
		int power = 1;
		for(int a = 1; a<=contExp; a++) {
			power = power*base;
		}
		return power;
	}
}
