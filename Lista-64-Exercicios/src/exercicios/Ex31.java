package exercicios;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int n, even = 0, odd = 0;
				
		do {
			System.out.print("Digite um número (Negativo p/ sair): ");
			n = in.nextInt();
			
			if (n % 2 == 0) {
				System.out.println(n + " é par");
				even += n;
			}
			if (n % 2 != 0) {
				System.out.println(n + " é impar");
				odd += n;
			}
		} while (n > 0);
		
		System.out.println("\nSoma dos pares: " + even);
		System.out.println("Soma dos ímpares: " + odd);

	}
}
