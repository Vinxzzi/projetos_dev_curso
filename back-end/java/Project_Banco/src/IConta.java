public interface IConta {
    void sacar(double valor);

    void depositar( double valor);

     void transferir(double valor, Contas ContaDestino);

     void imprimirExtrato();
}
