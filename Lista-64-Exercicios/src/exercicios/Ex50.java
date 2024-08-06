package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex50 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Random random = new Random();
		
		int sorted = random.nextInt(101);
		int tries = 0;
		
		System.out.print("Qual o número sorteado? (0 - 100) ");
		int answer = in.nextInt();
		
		while (answer != sorted) {
			if(answer > sorted) {
				System.out.print("O número sorteado é menor que " + answer
						+ "\nTente novamente: ");
				answer = in.nextInt();
				tries++;
			}
			if(answer < sorted) {
				System.out.print("O número sorteado é maior que " + answer
						+ "\nTente novamente: ");
				answer = in.nextInt();
				tries++;
			}
		}
		
		System.out.print("Correto!\n" 
				+ "Você acertou em " + tries + " tentativas.");
		
	}
}
