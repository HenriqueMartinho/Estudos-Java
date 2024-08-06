package exercicios;

import java.util.Scanner;

public class Ex47 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		int[] n = new int [10];
		int major = 0, minor = 0, equal = 0;
		
		for (int i = 0; i < n.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º valor: ");
			n[i] = in.nextInt();
		}
		
		System.out.print("Digite o valor de X: ");
		int x = in.nextInt();
		
		for (int i : n) {
			if (n[i - 1] > x) major++;
			if (n[i - 1] < x) minor++;
			if (n[i - 1] == x) equal++;
		}
		
		System.out.print(major + " número(s) maior(es) que X\n"
				+ minor + " número(s) menor(es) que X\n"
				+ equal + " número(s) igual(is) a X");
	
	}
}
