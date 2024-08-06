package exercicios;

import java.util.Scanner;

public class Ex62 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.print("Digite a base do triangulo: ");
		double b = in.nextDouble();
		System.out.print("Digite a altura do triangulo: ");
		double h = in.nextDouble();
		
		System.out.println("O valor da hipotenusa é: " 
				+ String.format("%.2f", hypotenuse(b, h)));
		
	}

	public static double hypotenuse(double b, double h) {
		return Math.sqrt((b * b) + (h * h));
	}
	
}
