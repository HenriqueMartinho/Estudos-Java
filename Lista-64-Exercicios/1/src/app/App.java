package App;

import java.util.Scanner;

public class app {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Quantidade mínima em estoque: ");
		double min = in.nextInt();
		System.out.print("Quantidade máxima em estoque: ");
		double max = in.nextInt();
		
		System.out.println("Estoque médio = " 
				+ String.format("%.1f", (min + max) / 2));

	}
}