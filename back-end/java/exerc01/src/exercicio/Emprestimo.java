package exercicio;

import javax.swing.text.Style;

public class Emprestimo {
    public static int getDuasParcelas(){
        return 2;
    }
    public static int getTresParcelas(){
        return 3;
    }
    public static  double getTaxaDuasParcelas(){
        return 0.3;
    }
    public static  double getTaxaTresParcelas(){
        return 0.45;
    }

    public static void calcular(double valor,int parcelas){
        if(parcelas ==2){
            double valorF=valor+(valor +getTaxaDuasParcelas());
            System.out.println("O valor final de emprestimo para 2 parcelas:" + valorF);

        } else if (parcelas==3)
        {
            double valorF=valor+(valor + getTaxaDuasParcelas());
            System.out.println("O valor final de emprestimo para 2 parcelas:" + valorF);

        }
        else {
            System.out.println("Quantidade de parcelas n/ aceita");

        }
    }

}
