package exercicios;

public class Ex43 {

	public static void main(String[] args) {
		long seeds = 1, squares = 1;
		
		for (int i = 1; i <= 62; i++) {
			squares = squares * 2;
			seeds += squares;
		}

		System.out.println ("Total de sementes: " + seeds);
		
	}

}
