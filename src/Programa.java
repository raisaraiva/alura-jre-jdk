import test.*;

public class Programa {
    public static void main(String[] args) {
        System.out.println("Olá, mundo!");

        System.out.println("--------------------------");
        System.out.println("Fatorial");
        System.out.println("--------------------------");
        Fatorial.test(5);
        System.out.println("--------------------------");
        System.out.println("MultiplosAteCem");
        System.out.println("--------------------------");
        MultiplosAteCem.test(5);
        System.out.println("--------------------------");
        System.out.println("Caracteres");
        System.out.println("--------------------------");
        Caracteres.test();
        System.out.println("--------------------------");
        System.out.println("Condicional");
        System.out.println("--------------------------");
        Condicional.test(18, 3);
        System.out.println("--------------------------");
        System.out.println("Condicional 2");
        System.out.println("--------------------------");
        Condicional2.test(16, 3);
        System.out.println("--------------------------");
        System.out.println("Conversao");
        System.out.println("--------------------------");
        Conversao.test();
    }
}
