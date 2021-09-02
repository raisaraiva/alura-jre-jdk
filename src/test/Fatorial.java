package test;

public class Fatorial {

	public static void test(int numero) {
		int fatorial = 1;

		for (int i = 1; i < numero; i++) {
			fatorial *= i;

			System.out.println("Fatorial de " + i + " = " + fatorial);
		}
	}
}