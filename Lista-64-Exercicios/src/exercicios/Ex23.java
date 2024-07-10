package exercicios;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int x, y;
		
		System.out.println("Selecione uma opção abaixo\n"
				+ "1-Adição\n2-Subtração\n3-Multiplicação\n4-Divisão");
		
		switch (in.nextInt()) {
			case 1:
				System.out.print("\nDigite o primeiro número: ");
				x = in.nextInt();
				System.out.print("Digite o segundo número: ");
				y = in.nextInt();
				
				System.out.println(x + " + " + y + " = " + (x + y));
				break;
			case 2:
				System.out.print("\nDigite o primeiro número: ");
				x = in.nextInt();
				System.out.print("Digite o segundo número: ");
				y = in.nextInt();
				
				System.out.println(x + " - " + y + " = " + (x - y));
				break;
			case 3:
				System.out.print("\nDigite o primeiro número: ");
				x = in.nextInt();
				System.out.print("Digite o segundo número: ");
				y = in.nextInt();
				
				System.out.println(x + " * " + y + " = " + (x * y));
				break;
			case 4:
				System.out.print("\nDigite o primeiro número: ");
				x = in.nextInt();
				System.out.print("Digite o segundo número: ");
				y = in.nextInt();
				
				System.out.println(x + " / " + y + " = " + (x / y));
				break;
		}
	}
}
