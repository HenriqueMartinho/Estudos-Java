package exercicios;

import java.util.Scanner;

public class Ex37 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		String menu = "";
		
		do {
			int x, y;
			
			System.out.println("1-Adição\n2-Subtração"
					+"\n3-Multiplicação\n4-Divisão");
			
			switch(in.nextInt()) {
				case 1:
					System.out.print("\nDigite dois números: ");
					x = in.nextInt();
					y = in.nextInt();
					
					System.out.println(x + " + " + y + " = " + (x + y));
					break;
				case 2:
					System.out.print("\nDigite dois números: ");
					x = in.nextInt();
					y = in.nextInt();
					
					System.out.println(x + " - " + y + " = " + (x - y));
					break;
				case 3:
					System.out.print("\nDigite dois números: ");
					x = in.nextInt();
					y = in.nextInt();
					
					System.out.println(x + " * " + y + " = " + (x * y));
					break;
				case 4:
					System.out.print("\nDigite dois números: ");
					x = in.nextInt();
					y = in.nextInt();
					
					System.out.println(x + " / " + y + " = " + (x / y));
					break;
			}
			
			System.out.print("Voltar ao menu? (S / N) ");
			menu = in.next();
			System.out.println("");
			
		}while(menu.equals("s") || menu.equals("S"));
	}
}
