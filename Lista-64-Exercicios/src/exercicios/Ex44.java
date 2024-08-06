package exercicios;

import java.util.Scanner;

public class Ex44 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String menu = "";
		
		while (!menu.equalsIgnoreCase("s")) {
			
			System.out.println("1 - Conversão de Graus Celsius em Fahrenheit"
					+ "\n2 - Conversão de Graus Fahrenheit em Celsius"
					+ "\n3 - Peso ideal do homem"
					+ "\n4 - Peso ideal da mulher");
			
			switch (in.nextInt()) {
				case 1:
					System.out.print("Valor em °C: ");
					double c = in.nextDouble();
					
					System.out.println(c + " °C" + " = " 
							+ ((9 * c + 160) / 5) + " °F");
					break;
			
				case 2:
					System.out.print("Valor em °C: ");
					double f = in.nextDouble();
					
					System.out.println(f + " °F" + " = " 
							+ ((f - 32) * (5 / 9)) + " °C");
					break;
					
				case 3:
					System.out.print("Digite seu peso (H): ");
					double weight = in.nextDouble();
					System.out.print("Sua Altura: ");
					double height = in.nextDouble();
					
					if (weight > ((72.7 * height) - 58)) {
						System.out.println("Está acima do peso");
					}
					if (weight < ((72.7 * height) - 58)) {
						System.out.println("Está no peso ideal");
					}
					if (weight == ((72.7 * height) - 58)) {
						System.out.println("Está no peso ideal");
					}
					break;
					
				case 4:
					System.out.print("Digite seu peso (H): ");
					weight = in.nextDouble();
					System.out.print("Sua Altura: ");
					height = in.nextDouble();
					
					if (weight > ((72.7 * height) - 58)) {
						System.out.println("Está acima do peso");
					}
					if (weight < ((72.7 * height) - 58)) {
						System.out.println("Está no peso ideal");
					}
					if (weight == ((62.1 * height) - 44.7)) {
						System.out.println("Está no peso ideal");
					}
					break;
			}
			
			System.out.println("\nDeseja encerrar o programa? (S / N)");
			menu = in.nextLine();
			System.out.println("");
			
		}
	}
}
