package test;

public class Condicional2 {

	public static void test(int idade, int quantidade) {
		System.out.println("Idade = " + idade);
		System.out.println("Quantidade = " + quantidade);

		boolean acompanhado = quantidade >= 2;

		if (idade >= 18 && acompanhado) {
			System.out.println("Seja bem vindo.");
		} else {
			System.out.println("Infelizmente, você não pode entrar");
		}
	}
}