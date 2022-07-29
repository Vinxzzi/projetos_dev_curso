package exerc;

import java.util.Scanner;

public class Exc1_NomeIdade {
    public  static void main(String[] args){
        Scanner scan= new Scanner(System.in);

        String nome = null;
        int idade = 0;
        
         while (true){
            System.out.println("Digite o nome e a idade:");
            System.out.println("Nome:");
            nome =scan.next();
            if (nome.equals("0")){
                System.out.println("Nome Invalido!");
                break;

            }
            System.out.println("Idade:");
            idade =scan.nextInt();
            
        }
       
    }

}
