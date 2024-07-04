package exercicios;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Cotação do Dolar: ");
		double dollarExchange = in.nextDouble();
		System.out.print("Valor em Dolar: ");
		double dollarAmmount = in.nextDouble();
		
		System.out.println("US Dollar -> Reais: R$ "
				+ String.format("%.2f", dollarExchange * dollarAmmount));
	}

}
