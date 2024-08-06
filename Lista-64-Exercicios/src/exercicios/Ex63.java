package exercicios;

import java.util.Scanner;

public class Ex63 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.print("Digite um número: ");
		int n = in.nextInt();
		
		System.out.print(verify(n));
	}

	public static String verify(int n) {
		if(n % 2 == 0) return "PAR";
		return "ÍMPAR";
	}
	
}
