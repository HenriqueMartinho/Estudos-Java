package exercicios;

import java.util.Scanner;

public class Ex41 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);

		System.out.print("Idade do nadador: ");
		int age = in.nextInt();
		
		if (age >= 5 && age <= 7)
			System.out.println("Infantil A");
		if (age >= 8 && age <= 11)
			System.out.println("Infantil B");
		if (age >= 12 && age <= 13)
			System.out.println("Juvenil A");
		if (age >= 14 && age <= 17)
			System.out.println("Juvenil B");
		if (age >= 18)
			System.out.println("Adultos");
	}
}
