package exercicio;

public class Calculadora {
    public static void soma(double n1, double n2){
        double result=n1+n2;

        System.out.println("A soma de " + n1 + "+" + n2 + " e igual a : " + result);
    }

    public static void sub(double n1, double n2){
        double result=n1-n2;

        System.out.println("A soma de " + n1 + "-" + n2 + " e igual a : " + result);
    }
    public static void mult(double n1, double n2){
        double result=n1*n2;

        System.out.println("A soma de " + n1 + "*" + n2 + " e igual a : " + result);
    }
    public static void div(double n1, double n2){
        double result=n1/n2;

        System.out.println("A soma de " + n1 + "/" + n2 + " e igual a : " + result);
    }
}
