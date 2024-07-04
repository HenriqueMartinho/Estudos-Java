package exercicios;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Raio da lata: ");
		double radius = in.nextDouble();
		System.out.print("Altura da lata: ");
		double height = in.nextDouble();
		
		System.out.println("Volume da lata: " 
				+ String.format("%.2f",
						3.14 * radius * radius * height)
				+ " cm³");
	}
}
