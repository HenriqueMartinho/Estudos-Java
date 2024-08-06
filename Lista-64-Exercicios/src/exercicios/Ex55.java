package exercicios;

import java.util.Scanner;

public class Ex55 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite uma frase de até 50 caracteres.");
		String[] frase = in.nextLine().split("\s");
		
		for (int i = 0; i < frase.length; i++) {
			frase[i].replace(" ", "");
			System.out.print(frase[i]);
		}
		
		System.out.println("\n" + (frase.length - 1) 
				+ " espaços em branco na frase digitada.");
		
	}

}
