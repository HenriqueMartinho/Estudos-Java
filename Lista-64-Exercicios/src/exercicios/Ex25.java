package exercicios;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Digite a altura da pessoa: ");
		double height = in.nextDouble();
		System.out.print("O sexo (H / M): ");
		String gender = in.next();
		
		if(gender.equals("H") || gender.equals("h")) {
			System.out.println("Peso ideal: " 
					+ String.format("%.2f", (72.7 * height) - 58));
		}
		if(gender.equals("M") || gender.equals("m")) {
			System.out.println("Peso ideal: " 
					+ String.format("%.2f", (62.1 * height) - 44.7));
		}	
	}
}
