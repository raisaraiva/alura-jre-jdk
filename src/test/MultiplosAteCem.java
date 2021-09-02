package test;

public class MultiplosAteCem {

	public static void test(int numero) {
		System.out.println("Os multipos de " + numero + " até 100 são:");

		for (int i = numero; i < 100; i += numero) {
			System.out.println(i);
		}
	}
}