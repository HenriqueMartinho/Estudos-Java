package exercicios;

import java.util.Scanner;

public class Ex22 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a, b, x;
		
		do {
			System.out.print("Digite um número inteiro: ");
			x = in.nextInt();
		} while(x == 0);
		
		if(x > 0) {
			a = x;
			System.out.println(a + " foi armazenado em A");
		}
		if(x < 0) {
			b = x;
			System.out.println(b + " foi armazenado em B");
		}
	}
}
