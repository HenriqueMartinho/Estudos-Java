package exercicios;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		double average = 0;

		System.out.print("Quantidade de alunos: ");
		int qty = in.nextInt();
		
		for (int i = 1; i <= qty; i++) {
			System.out.print("Matricula do aluno: ");
			int id = in.nextInt();
			System.out.print("Nota: ");
			average += in.nextDouble();
		}
		
		System.out.println("\nMédia dos alunos: " 
				+ String.format("%.1f", (average / qty)));
		
	}
}
