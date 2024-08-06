package exercicios;

import java.util.Scanner;

public class Ex64 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		int[] numbers = new int[0];
		int menu;

		do {
			System.out.println("1 - Carregar Vetor\n2 - Listar Vetor"
					+ "\n3 - Exibir apenas os números pares do vetor"
					+ "\n4 - Exibir apenas os números ímpares do vetor"
					+ "\n5 - Exibir a quantidade de números pares existem nas posições ímpares do vetor"
					+ "\n6 - Exibir a quantidade de números ímpares existem nas posições pares do vetor"
					+ "\n7 - Sair");
			
			menu = in.nextInt();
			
			switch(menu) {
				case 1:
					numbers = loadVector();
					break;
				case 2:
					listVector(numbers);
					break;
				case 3:
					evenNumbers(numbers);
					break;
				case 4:
					oddNumbers(numbers);
					break;
				case 5:
					evenNumbersIndex(numbers);
					break;
				case 6:
					oddNumbersIndex(numbers);
					break;
				case 7:
					break;
			}
			
		} while(menu != 7);
	}
	
	public static int[] loadVector() {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Quantos números serão digitados: ");
		int[] numbers = new int[in.nextInt()];
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número: ");
			numbers[i] = in.nextInt();
		}
		
		return numbers;
	}
	
	public static void listVector(int[] numbers) {
		System.out.print("Vetores Listados: ");
		
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		
		
	}

	public static void evenNumbers(int[] numbers) {
		System.out.print("Números Pares: ");
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0) System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
	}
	public static void oddNumbers(int[] numbers) {
		System.out.print("Números Ímpares: ");
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 != 0) System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
	}
	
	public static void evenNumbersIndex(int[] numbers) {
		System.out.print("Números Pares em Posições Ímpares: ");
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 == 0 && i % 2 != 0) System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
	}
	public static void oddNumbersIndex(int[] numbers) {
		System.out.print("Números Ímpares em Posições Pares: ");
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] % 2 != 0 && i % 2 == 0) System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
	}
	
}
