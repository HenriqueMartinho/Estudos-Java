package exercicios;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		System.out.print("Tempo da viagem: ");
		double time = in.nextDouble();
		System.out.print("Velocidade média: ");
		int velocity = in.nextInt();
		
		double distance = time * velocity;
		
		System.out.println("\nVelocidade média: " + velocity + " Km/h");
		System.out.println("Tempo da viagem: " 
				+ String.format("%.0f", time) + " h");
		System.out.println("Distância percorrida: " + distance + " Km");
		System.out.println("Litros utilizados: " + distance / 12 + " L");
	}
}
