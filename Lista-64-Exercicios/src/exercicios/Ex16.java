package exercicios;

import java.util.Scanner;

public class Ex16 {
	public static void main (String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Digite dois números inteiros: ");
		int x = in.nextInt();
		int y = in.nextInt();
		
		if(x == y) System.out.println(x + " e " + y + " são iguais.");
		if(x > y) System.out.println("Maior número: " + x
				+ "\nMenor número: " + y);
		if(x < y) System.out.println("Maior número: " + y
				+ "\nMenor número: " + x);
	}
}
