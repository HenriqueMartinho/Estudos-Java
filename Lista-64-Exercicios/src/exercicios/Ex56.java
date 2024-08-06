package exercicios;

import java.util.Random;

public class Ex56 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] n = new int[50];
		int evens = 0, multiples = 0;

		for(int i = 0; i < n.length; i++) n[i] = random.nextInt(51);
		
		for(int i = 0; i < n.length; i++) {
			if(n[i] % 2 == 0) evens++;
			else if(n[i] % 5 == 0) multiples++;
		}
		
		System.out.println(evens + " números pares\n"
				+ multiples + " múltiplos de 5");
		
	}
}
