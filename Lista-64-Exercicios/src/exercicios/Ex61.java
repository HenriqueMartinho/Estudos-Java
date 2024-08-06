package exercicios;

import java.util.Scanner;

public class Ex61 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Digite o salário: R$ ");
		double salary = in.nextDouble();
		System.out.print("Índice de reajuste (%): ");
		double readjustment = in.nextDouble();
		
		System.out.print("Salário com reajuste: R$ " 
				+ readjustment(salary, readjustment));
		
	}

	public static double readjustment (double salary, double readjustment) {
		return salary + (salary * (readjustment / 100));
	}
	
}
