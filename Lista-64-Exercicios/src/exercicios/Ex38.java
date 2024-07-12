package exercicios;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int c, n;
		String menu = "";

		do {
			System.out.print("Digite o código do operário: ");
			c = in.nextInt();
			System.out.print("Horas trabalhadas: ");
			n = in.nextInt();
			
			if (n > 50) {
				System.out.println("Salário Total: " 
						+ ((50 * 10) + ((n - 50) * 20)));
				System.out.println("Salário Excedente: " 
						+ ((n - 50) * 20));	
			}
			else {
				System.out.println("Salário Total: " 
						+ (n * 10));
			}
			
			System.out.print("\nDeseja encerrar o programa? ");
			menu = in.next();
			System.out.println("");
			
		}while (!menu.equals("s") && !menu.equals("S"));
			
	}
}
