package exercicios;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Digite dois números: ");
		int x = in.nextInt();
		int y = in.nextInt();
		
		if(x == y) System.out.println(x + " e " + y + " são iguais");
		else System.out.println(x + " e " + y + " não são iguais");
				
		if(x < y) System.out.println(x + " é menor que " + y);
		if(x > y) System.out.println(x + " é maior que " + y);
		if(y < x) System.out.println(y + " é menor que " + x);
		if(y > x) System.out.println(y + " é maior que " + x);
		
		if(x <= y || y <= x) {
			if(x <= y) System.out.println(x + " é menor ou igual a " + y);
			else System.out.println(y + " é menor ou igual a " + x);
		}
		if(x <= y || y <= x) {
			if(x >= y) System.out.println(x + " é maior ou igual a " + y);
			else System.out.println(y + " é maior ou igual a " + x);
		}
	}
}
