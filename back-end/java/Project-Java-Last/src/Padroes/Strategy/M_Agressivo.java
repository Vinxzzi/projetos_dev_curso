package Padroes.Strategy;

public class M_Agressivo implements Comportamento{


    @Override
    public void mover() {
        System.out.println("Move-se de forma agressiva");
    }
}
