package exercicios;

import java.util.Random;
import java.util.Scanner;

public class Ex49 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		Random random = new Random();
		
		System.out.println("Quantos componentes serão usados? (0 - 50)");
		int components = in.nextInt();
		
		int[] v1 = new int[components];
		int[] v2 = new int[components];
		
		int equals = 0;
		
		for(int i = 0; i < components; i++) {
			v1[i] = random.nextInt(components + 1);
			v2[i] = random.nextInt(components + 1);
			
			if (v1[i] == v2[i]) equals++;
			
		}
	
		System.out.println("Os vetores criados tem " 
				+ equals + " número(s) iguais");
		
	}
}
