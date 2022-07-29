package exerc;

import java.util.Scanner;

public class Exerc2_Nota {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        int nota=-0;

        System.out.println("Digite a nota");
        nota =scan.nextInt();
        while (nota<0 || nota>10){
            System.out.println("Nota Invalida, digite novamente:");
            nota =scan.nextInt();

        }

    }
}
