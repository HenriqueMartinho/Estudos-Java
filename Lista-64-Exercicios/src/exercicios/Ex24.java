package exercicios;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Digite dois números inteiros: ");
		int x = in.nextInt();
		int y = in.nextInt();
		
		System.out.println("Selecione uma opção abaixo"
				+ "\n1-Verificar se um dos números lidos é ou não multiplo do outro"
				+ "\n2-Verificar se dois números lidos são pares"
				+ "\n3-Verificar se a mérida dos dois números é maior ou igual a 7"
				+ "\n4-Sair");
		
		switch(in.nextInt()) {
			case 1:
				if(x % y == 0 || y % x == 0)
					System.out.println(x + " e " + y + " são multiplos");
				else System.out.println(x + " e " + y + " não são multiplos");
				break;
			case 2:
				if(x % 2 == 0 && y % 2 == 0)
					System.out.println(x + " e " + y + " são números pares");
				else System.out.println("Apenas um número é par");
				break;
			case 3:
				if((x + y) / 2 >= 7)
					System.out.println("A média dos números é maior ou igual a 7");
				else System.out.println("A média dos números é menor que 7");
				break;
			case 4:
				break;
		}
	}
}
