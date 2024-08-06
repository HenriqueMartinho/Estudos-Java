package exercicios;

import java.util.Random;

public class Ex54 {

	public static void main(String[] args) {
		Random random = new Random();
		
		int[] a = new int[5];
		int[] b = new int[8];
		
		for (int i = 0; i < b.length; i++) b[i] = random.nextInt(21);
		for(int j = 0; j < a.length; j++) a[j] = random.nextInt(21);
		
		for(int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if(a[i] == b[j]) 
					System.out.print((i + 1) + "ª posição de A é igual a " 
							+ (j + 1) + "ª de B\n");
			}
		}
		
		System.out.println();
		
		for(int i = 0; i < b.length; i++) {
			for (int j = 0; j < a.length; j++) {
				if(b[i] == a[j]) 
					System.out.print((i + 1) + "ª posição de B é igual a " 
							+ (j + 1) + "ª de A\n");
			}
		}
		
	}

}
