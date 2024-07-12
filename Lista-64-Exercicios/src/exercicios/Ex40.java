package exercicios;

import java.util.Scanner;

public class Ex40 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		String menu = "";
		
		do {
			System.out.print("Qual o índice de poluição? ");
			double index = in.nextDouble();
			
			if (index >= 0.05 && index <= 0.25) 
				System.out.println("Índice de poluição aceitavel");
			if (index >= 0.3 && index < 0.4)
				System.out.println("1º grupo deve suspender suas atividades");
			if (index >= 0.4 && index < 0.5)
				System.out.println("1º e 2º grupo devem suspender suas atividades");
			if (index >= 0.5)
				System.out.println("Todos os grupo devem suspender suas atividades");
			
			System.out.print("Deseja encerrar o programa? ");
			menu = in.next();
			System.out.println("");
			
		} while(!menu.equalsIgnoreCase("s"));
		
		
		
		
	}

}
