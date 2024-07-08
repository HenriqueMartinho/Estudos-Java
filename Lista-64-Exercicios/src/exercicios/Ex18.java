package exercicios;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.print("Digite um número inteiro: ");
		int codigo = in.nextInt();
		
		if(codigo == 1 || codigo == 2 || codigo == 3) {
			switch (codigo) {
				case 1:
					System.out.println("Um");
					break;
				case 2:
					System.out.println("Dois");
					break;
				case 3:
					System.out.println("Três");
					break;	
			}
		}
		else System.out.println("Código inválido");
	}
}
