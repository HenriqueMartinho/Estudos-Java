package exercicios;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Temperatura em °F: ");
		double fahrenheit = in.nextDouble();
		
		System.out.println("Temperatura em Celsius: " 
				+ (((fahrenheit - 32) * 5) / 9) + " °C");

	}

}
