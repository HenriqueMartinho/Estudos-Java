package exercicios;

import java.util.Scanner;

public class Ex21 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Digite um número inteiro (0 para sair): ");
		int x = in.nextInt();
		
		while(x != 0) {
			if(x > 0) System.out.println(x + " é um número positivo\n");
			if(x < 0) System.out.println(x + " é um número negativo\n");
			
			System.out.println("Digite um número inteiro (0 para sair): ");
			x = in.nextInt();
		}
	}
}
