package exercicios;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Digite 4 números: ");
		int a = in.nextInt();
		int b = in.nextInt();
		int c = in.nextInt();
		int d = in.nextInt();
		
		System.out.println("RESULTADOS:");
		System.out.print("A + B = " + (a + b)
				+ "\nA + C = " + (a + c)
				+ "\nA + D = " + (a + d)
				+ "\nB + C = " + (b + c)
				+ "\nB + D = " + (b + d)
				+ "\nC + D = " + (c + d)
				+ "\nA * B = " + (a * b)
				+ "\nA * C = " + (a * c)
				+ "\nA * D = " + (a * d)
				+ "\nB * C = " + (b * c)
				+ "\nB * D = " + (b * d)
				+ "\nC * D = " + (c * d));
	}
}
