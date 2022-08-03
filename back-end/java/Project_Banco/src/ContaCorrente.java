public class ContaCorrente extends Contas {

    @Override
    public void imprimirExtrato() {
        System.out.println("==Extrato Conta corrente==");
       super.imrpimirExtratoComum();

    }

}
