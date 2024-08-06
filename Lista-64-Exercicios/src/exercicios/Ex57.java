package exercicios;

import java.util.Scanner;

public class Ex57 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite um frase");
		String frase = in.nextLine();
		
		for (int i = 0; i < frase.length(); i++) {	
			if(String.valueOf(frase.charAt(i)).equalsIgnoreCase("a") 
					|| String.valueOf(frase.charAt(i)).equalsIgnoreCase("e")
					|| String.valueOf(frase.charAt(i)).equalsIgnoreCase("i")
					|| String.valueOf(frase.charAt(i)).equalsIgnoreCase("o")
					|| String.valueOf(frase.charAt(i)).equalsIgnoreCase("u")) {
				
				System.out.print(String.valueOf(frase.charAt(i)));
				
			}
		}
	}
}
