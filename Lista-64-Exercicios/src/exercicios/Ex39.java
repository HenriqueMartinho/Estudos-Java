package exercicios;

import java.util.Scanner;

public class Ex39 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String menu = "";
		
		do {
			System.out.print("Digite um número inteiro: ");
			int n = in.nextInt();
			
			if(n % 2 == 0) System.out.println(n + " é par");
			if (n % 2 != 0)System.out.println(n + " é impar");
			if (n > 0) System.out.println(n + " é positivo");
			if (n < 0) System.out.println(n + " é negativo");
			
			System.out.print("Deseja encerrar o programa? ");
			menu = in.next();
			System.out.println("");
			
		} while(!menu.equalsIgnoreCase("s"));
	}
}
