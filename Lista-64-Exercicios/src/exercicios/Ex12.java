package exercicios;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Digite um número inteiro: ");
		int x = in.nextInt();
		
		if(x >= 0) System.out.println("O módulo de " + x + " é " + x);
		else System.out.println("O módulo de " + x + " é " + x * (-1));
	}

}
