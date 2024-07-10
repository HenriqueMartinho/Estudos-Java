package exercicios;

import java.util.Scanner;

public class Ex30 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Digite um número: ");
		int n = in.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
	}
}
