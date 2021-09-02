package test;

public class Condicional {

    public static void test(int idade, int quantidade) {
        System.out.println("Idade = " + idade);
        System.out.println("Quantidade = " + quantidade);

        if (idade >= 18) {
            System.out.println("Você tem pelo menos 18 anos. Seja bem vindo.");
        } else {
            if (quantidade >= 2) {
                System.out.println("Você tem menos de 18 anos, mas pode entrar, pois está acompanhado");
            } else {
                System.out.println("Infelizmente, você não pode entrar.");
            }
        }
    }
}