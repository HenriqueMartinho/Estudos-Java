package exercicios;

import java.util.Scanner;

public class Ex52 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int receiver = 0, counter = 0;
		int[] n;
		
		do {
			System.out.print("Quantos números serão digitados? (3 - 100) ");
			n = new int[in.nextInt()];
			
			System.out.println("(-1 P/ SAIR)\n");
			
			for (int i = 0; i < n.length; i++) {
				System.out.print("Digite o " + (i + 1) + "º número: ");
				receiver = in.nextInt();
				
				n[i] = receiver; 
				
				if(receiver == -1) i = n.length;
			}
			
			for (int i = 0; i < n.length; i++) {
				if(n[i] == 1 && n[i + 1] == 3 && n[i + 2] == 4) counter++;
			}
			
			if(counter >= 1) System.out.println("A sequência 1, 3 e 4 aparecem " 
						+ counter + " vezes no vetor.\n");
			else System.out.println("A sequência 1, 3 e 4 não está no vetor.\n");	
			
		} while(receiver != -1);	
	}
}
