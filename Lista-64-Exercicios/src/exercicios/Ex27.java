package exercicios;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int factorial = 1;

		System.out.print("Quantidade de números: ");
		int qtt = in.nextInt();
		
		for (int i = 1; i <= qtt; i++) {
			System.out.print("\n" + i + "º número: ");
			factorial *= in.nextInt();
			System.out.println("Fatorial = " + factorial);
		}
	}
}