package exercicios;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.println("Digite 4 notas escolares (0 - 10): ");
		double n1 = in.nextDouble();
		double n2 = in.nextDouble();
		double n3 = in.nextDouble();
		double n4 = in.nextDouble();
		
		double media = (n1 + n2 + n3 + n4) / 4;
		
		if(media >= 7) System.out.println("Aluno aprovado");
		if(media < 7) {
			System.out.print("Digite a nota de recuperação: ");
			media += in.nextDouble();
			
			if(media / 2 >= 7) System.out.println("Aluno aprovado");
			else System.out.println("Aluno reprovado\nMédia: " 
					+ String.format("%.2f", media / 2));			
		};
	}
}
