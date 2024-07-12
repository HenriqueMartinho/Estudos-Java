package exercicios;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sum = 0;

		System.out.print("Digite um número interio (0 - 10): ");
		int n = in.nextInt();
		
		for (int i = 1; i <= 40; i++) {
			if(n % 2 != 0) {
				sum += n * n;
			}
			n++;
		}
		
		System.out.println(sum);

	}
}
