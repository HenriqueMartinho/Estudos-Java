package exercicios;

import java.util.Scanner;

public class Ex53 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		double laps[];
		double times[] = {99, 0, 0};
		
		System.out.print("Quantas voltas o piloto correu? ");
		laps = new double[in.nextInt()];
		
		for (int i = 0; i < laps.length; i++) {
			System.out.print("Tempo da " + (i + 1) + "ª volta: ");
			laps[i] = in.nextDouble();
			
			if(laps[i] < times[0]) {
				times[0] = laps[i];
				times[1] = i + 1;
			}

			times[2] += laps[i];

		}
		
		System.out.print("\nMelhor tempo: " + String.format("%.2f", times[0])
				+ "\nMelhor volta: " + String.format("%.0f", times[1]) + "ª"
				+ "\nTempo médio: " 
				+ String.format("%.2f", (times[2] / laps.length)));		
		
	}
}
