package exercicios;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int n = -1, min = 999, maj = 0;
		double average = 0;
		
		for (int i = 1; i <= 10; i++) {
			
			System.out.print("Digite o " + i + "º número: ");
			n = in.nextInt();
			
			while (n < 0) {
				System.out.print("O valor dever ser positivo: ");
				n = in.nextInt();
			}
			
			if(n > maj) maj = n;
			if(n < min) min = n;
			average += n;
			
		}
		
		System.out.print("Maior valor: " + maj
				+ "\nMenor valor: " + min
				+ "\nMédia dos valores: " 
				+ String.format("%.1f", (average / 10)));
		
	}
}
