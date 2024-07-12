package exercicios;

import java.util.Scanner;

public class Ex34 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int n = 0, min = 9999, maj = 0;

		while(n >= 0) {
			if (n > maj) maj = n;
			if (n < min) min = n;
			
			System.out.print("Digite um número (Negativo p/ sair): ");
			n = in.nextInt();
		}
		
		System.out.println("Maior nº: " + maj 
				+ "\nMenor nº: " + min);
		
	}
}
