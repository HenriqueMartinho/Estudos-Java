package exercicios;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.print("Digite três números inteiros: ");
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		
		if(x > y && x > z) {
			System.out.println(x);
			if (y > z) System.out.println(y + "\n" + z);
			if (z > y) System.out.println(z + "\n" + y);
		}
		if(y > x && y > z) {
			System.out.println(y);
			if (x > z) System.out.println(x + "\n" + z);
			if (z > x) System.out.println(z + "\n" + x);
		}
		if(z > x && z > y) {
			System.out.println(z);
			if (x > y) System.out.println(x + "\n" + y);
			if (y > x) System.out.println(y + "\n" + x);
		}
	}
}
