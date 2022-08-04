package Padroes.Strategy;

public class M_defensivo implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Move-se de forma defensiva");
    }
}
