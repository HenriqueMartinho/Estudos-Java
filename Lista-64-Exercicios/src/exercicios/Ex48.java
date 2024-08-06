package exercicios;

import java.util.Scanner;

public class Ex48 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String[] models = new String [3];
		int[] ages = new int[3];
		
		for (int i = 0; i < 3; i++) {
			System.out.print("Digite o nome da " + (i + 1) + "ª candidata: ");
			models[i] = in.next();
			in.nextLine();
			System.out.print("Idade da " + (i + 1) + "ª candidata: ");
			ages[i] = in.nextInt();
		}
		
		System.out.println("\nCANDIDATAS APTAS");
		
		for (int i = 0; i < 3; i++) {
			if(ages[i] >= 18 && ages[i] <= 20) {
				System.out.println(models[i] + ", " + ages[i] + " anos");
			}
		}
	}
}