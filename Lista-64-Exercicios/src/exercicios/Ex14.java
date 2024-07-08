package exercicios;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Digite dois números inteiros: ");
		int x = in.nextInt();
		int y = in.nextInt();
		
		if(x > y) System.out.println(x - y);
		else System.out.println(y - x);
	}

}
