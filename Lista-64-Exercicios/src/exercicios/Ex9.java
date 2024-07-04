package exercicios;

import java.util.Scanner;

public class Ex9 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Idade em anos, meses e dias:\n(Apenas números)");
		int years = in.nextInt();
		int months = in.nextInt();
		int days = in.nextInt();
		
		int ageDays = (years * 365) + (months * 30) + days;
		
		System.out.println(ageDays + " dias de idade");

	}
}
