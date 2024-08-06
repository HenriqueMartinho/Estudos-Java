package exercicios;

import java.util.Scanner;

public class Ex51 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.print("Quantos alunos serão avaliados? ");
		int students = in.nextInt();
		
		double[] grades = new double[students];
		double avarage = 0;
		int aboveAvarage = 0, belowAvarage = 0;
		
		for (int i = 0; i < students; i++) {
			System.out.print("Nota do " + (i + 1) + "º aluno: " );
			grades[i] = in.nextDouble();
			
			avarage += grades[i];
			
			if(grades[i] >= 7) aboveAvarage ++;
			if(grades[i] <= 5) belowAvarage++;
		}
		
		System.out.println("Média dos " + students + " alunos: " 
				+ String.format("%.2f", avarage / students));
		if (belowAvarage == students) 
			System.out.print("Não há nenhum aluno com nota acima de 5");
		else System.out.print(aboveAvarage + " aluno(s) com nota acima de 7.0");
	}
}
