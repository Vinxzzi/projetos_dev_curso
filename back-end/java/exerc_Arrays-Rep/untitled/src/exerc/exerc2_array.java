package exerc;

import java.util.Random;

public class exerc2_array {
    public static void main(String[] args) {//psvm
        Random random=new Random();

        int[] numerosAleatorios= new int[20];

        for(int i=0; i<numerosAleatorios.length;i++){
            int numero= random.nextInt(100);
            numerosAleatorios[i]=numero;

        }
        System.out.println("Numeros Aleatoios");
        for ( int numero : numerosAleatorios ) {//lado esquerdo:cada elemento / direito: array
            System.out.println(numero+ " ");

        }
    }
}
