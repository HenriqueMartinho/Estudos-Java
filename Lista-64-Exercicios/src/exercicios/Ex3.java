package exercicios;

import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Indentificação do Vendedor: ");
		int workerId = in.nextInt();
		System.out.print("Código da peça: ");
		int productId = in.nextInt();
		System.out.print("Preço unitário: ");
		double unitPrice = in.nextDouble();
		System.out.print("Quantidade: ");
		int units = in.nextInt();
		
		System.out.print("Comissão: R$ "
				+ String.format("%.2f", unitPrice * units));
	}
}
