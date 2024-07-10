package exercicios;

import java.util.Scanner;

public class Ex20 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.print("Digite três valores (acima de 0): ");
		int x = in.nextInt();
		int y = in.nextInt();
		int z = in.nextInt();
		
		while (x <= 0 || y <= 0 || z <= 0) {
			if(x <= 0) { 
				System.out.print("O primeiro valor precisa ser maior que 0:");
				x = in.nextInt();
			}
			else if(y <= 0) { 
				System.out.print("O segundo valor precisa ser maior que 0:");
				y = in.nextInt();
			}
			else if(z <= 0) { 
				System.out.print("O terceiro valor precisa ser maior que 0:");
				z = in.nextInt();
			}
		}
		
		if(x >= y && x >= z) {
			if(y > z) {
				System.out.println(z + " * " + x + " = " + (z * x));
				System.out.println(x + " / " + z + " = " + (x / z));
			}
			if(z > y) {
				System.out.println(y + " * " + x + " = " + (y * x));
				System.out.println(x + " / " + y + " = " + (x / y));
			}
		}
		if(y >= x && y >= z) {
			if(x > z) {
				System.out.println(z + " * " + y + " = " + (z * y));
				System.out.println(y + " / " + z + " = " + (y / z));
			}
			if(z > x) {
				System.out.println(x + " * " + y + " = " + (x * y));
				System.out.println(y + " / " + x + " = " + (y / x));
			}
		}
		if(z >= x && z >= y) {
			if(x > y) {
				System.out.println(y + " * " + z + " = " + (y * z));
				System.out.println(z + " / " + y + " = " + (z / y));
			}
			if(y > x) {
				System.out.println(x + " * " + z + " = " + (x * z));
				System.out.println(z + " / " + x + " = " + (z / x));
			}
		}
	}
}
