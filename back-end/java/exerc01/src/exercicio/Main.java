package exercicio;

public class Main {

    public static void main(String[] args){
        System.out.println("Exercicios Calculadora:");
        Calculadora.soma(3,6);
        Calculadora.sub(9,1.8);
        Calculadora.div(5,2.5);
        Calculadora.mult(7,8);

        System.out.println("Exercicios Mensagem:");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);

        System.out.println("Exercicios Emprestimo:");
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000,Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);
    }

}
