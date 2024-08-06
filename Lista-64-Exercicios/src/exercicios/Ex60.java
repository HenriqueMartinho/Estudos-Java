package exercicios;

import java.util.Scanner;

public class Ex60 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Digite um valor para X: ");
		int x = in.nextInt();
		System.out.print("Digite um valor para Y: ");
		int y = in.nextInt();
		
		System.out.print("Quadrante " + verificar_quadrante(x, y));

	}
	
	public static int verificar_quadrante(int x, int y) {
		if(x > 0 && y > 0) return 1;
		if(x > 0 && y < 0) return 2;
		if(x < 0 && y < 0) return 3;
		if(x < 0 && y > 0) return 4;
		
		return 0;
	}

}
