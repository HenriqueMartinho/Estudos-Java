package exercicios;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Temperatura em °C: ");
		double celsius = in.nextDouble();
		
		System.out.println("Temperatura em Fahrenheit: " 
				+ ((9 * celsius + 160)/ 5) + " °F");
	}
}
