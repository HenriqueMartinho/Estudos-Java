package exercicios;

import java.util.Scanner;

public class Ex59 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		String[] alphabet = 
			{"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k",
					"l", "m", "n", "o", "p", "q", "r", "s", "t", "u",
					"v", "w", "x", "y", "z"};
		String[] letters = new String[2];
		int[] index = new int[2]; 
		
		System.out.print("Digite duas letras (Ordem alfabética): ");
		letters[0] = in.next();
		letters[1] = in.next();
		
		for(int i = 0; i < letters.length; i++) {
			for(int j = 0; j < alphabet.length; j++) {
				if(alphabet[j].equalsIgnoreCase(letters[i])){
					index[i] = j + 1;
				}
			}
		}

		System.out.println("O número de caracteres entre eles é " 
				+ ((index[1] - index[0]) - 1));
		
	}
}