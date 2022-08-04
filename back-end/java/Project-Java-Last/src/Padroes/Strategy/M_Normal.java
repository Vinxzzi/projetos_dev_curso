package Padroes.Strategy;

public class M_Normal implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Move-se de forma normal");
    }
}
