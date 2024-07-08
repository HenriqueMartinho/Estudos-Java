package exercicios;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Digite dois valores inteiros: ");
		int a = in.nextInt();
		int b = in.nextInt();
		
		int c = b;
		b = a;
		a = c;
		
		System.out.println("A = " + a);
		System.out.println("B = " + b);
	}

}
