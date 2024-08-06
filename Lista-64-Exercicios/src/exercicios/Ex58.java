package exercicios;

import java.util.Scanner;

public class Ex58 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.print("Quantos números serão digitados? ");
		int[] n = new int [in.nextInt()];
		
		double avarage = 0; 
		int major = 0;
		
		for (int i = 0; i < n.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			n[i] = in.nextInt();
			
			avarage += n[i];
			
			if(n[i] > major) major = n[i];
		}
		
		System.out.print("Média dos números: " + String.format("%.2f", (avarage / n.length))
				+	"\nMaior número: " + major);
		
	}
}
