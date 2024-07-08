package exercicios;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Digite um número inteiro: ");
		int n = in.nextInt();
		
		if(n >= 0 && n <= 9) System.out.println("Valor válido");
		else System.out.println("Valor inválido");
	}
}
