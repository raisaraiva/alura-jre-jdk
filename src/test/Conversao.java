package test;

public class Conversao {

    public static void test() {
        double vd = 1270.50;

        System.out.println("Valor em double: " + vd);

        int vi = (int) vd;

        System.out.println("Valor em int: " + vi);

        double divisao = 5.0 / 2;

        System.out.println("Divisão de double: " + divisao);

        double a = 0.2;
        double b = 0.1;

        double c = a + b;

        System.out.println("Soma de double: " + a + " + " + b + " = " + c);
    }
}