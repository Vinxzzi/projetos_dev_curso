package Padroes.Strategy;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Comportamento normal= new M_Normal();
        Comportamento defens=new M_defensivo();
        Comportamento agres=new M_Agressivo();


        Robo robo=new Robo();

        System.out.println("Como o robo se move?"+'\n');

        System.out.println("Primeiro:");
        robo.setComportamento(normal);
        robo.mover();
        System.out.println('\n');

        System.out.println("Segundo:");
        robo.setComportamento(defens);
        robo.mover();
        System.out.println('\n');


        System.out.println("Terceiro:");
        robo.setComportamento(agres);
        robo.mover();



    }
}
