package exercicios;

public class Ex45 {

	public static void main(String[] args) {
		int[] n = {7, 22, 14, 58, 26, 12, 21, 76, 77, 1};
				
		for (int i = 1; i <= n.length; i++) {
			System.out.println(n[n.length - i]);
		}
	}
}