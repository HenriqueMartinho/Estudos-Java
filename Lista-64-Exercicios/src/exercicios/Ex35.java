package exercicios;

import java.util.Scanner;

public class Ex35 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		for (int i = 1; i <= 100; i++){
			System.out.print(i + ", ");
			if(i % 10 == 0) System.out.println("Multiplo de 10");
		}
	}
}
