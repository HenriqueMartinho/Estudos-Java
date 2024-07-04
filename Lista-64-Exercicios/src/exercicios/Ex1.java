package exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Quantidade mínima: ");
		int min = in.nextInt();
		System.out.print("Quantidade máxima: ");
		int max = in.nextInt();
		
		System.out.println("Estoque médio: " 
				+ (min + max) / 2);
	}

}