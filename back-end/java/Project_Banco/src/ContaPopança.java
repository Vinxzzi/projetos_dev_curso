public class ContaPopança extends Contas{


    @Override
    public void imprimirExtrato() {
        System.out.println("==Extrato Conta Popança==");
        super.imrpimirExtratoComum();
    }
}
