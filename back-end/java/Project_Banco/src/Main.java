public class Main {

    public static void main(String[] args) {
        Contas cc =new ContaCorrente();
        Contas pop =new ContaPopança();

        cc.depositar(100);

        cc.transferir(50, pop);

        cc.imprimirExtrato();
        pop.imprimirExtrato();
    }
}
