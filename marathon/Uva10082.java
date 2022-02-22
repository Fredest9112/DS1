package marathonProgramming;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Uva10082 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<Character, Character> map = new HashMap<Character, Character>();
		String chars = "`1234567890-=QWERTYUIOP[]\\ASDFGHJKL;'ZXCVBNM,./ ";
		char[] array = chars.toCharArray();
		for(int i = 1; i<array.length; i++) {
			if(array[i]!=' ') {
				map.put(array[i], array[i-1]);
			} else {
				map.put(' ', ' ');
				break;
			}
		}
		
//		Verifying if map was correctly created
//		for(Map.Entry<Character, Character> m:map.entrySet()) {
//			System.out.println("Key "+m.getKey()+" "+"Value "+m.getValue());
//		}
		String input = sc.nextLine();
		//INPUT: O S, GOMR YPFSU/
		for(char i: input.toCharArray()) {
			System.out.print(map.get(i));
		}
		sc.close();
	}

}
