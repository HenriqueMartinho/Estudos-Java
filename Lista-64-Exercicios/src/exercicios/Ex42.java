package exercicios;

import java.util.Scanner;

public class Ex42 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		double n, min = 999, maj = 0;
		
		do {
			System.out.print("Digite um número (0 p/ sair): ");
			n = in.nextDouble();
			
			if(n < min && n != 0) min = n;
			if(n > maj) maj = n;
			
		} while(n != 0);
		
		System.out.println("Maior número: " + maj
				+ "\nMenor número: " + min);
		
	}

}
