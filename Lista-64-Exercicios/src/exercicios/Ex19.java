package exercicios;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Digite três medidas de um triângulo: ");
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		
		if (a < b + c && b < a + c && c < a + b) {
			if(a == b && b == c) 
				System.out.println("Triangulo Equilátero");
			if(a == b || a == c || b == c) 
				System.out.println("Triangulo Isóceles");
			else System.out.println("Triangulo Escaleno");
		}
		else System.out.println("Os lados fornecidos não caracterizam um triângulo");
	}
}
