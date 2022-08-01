package List;

import java.util.ArrayList;
import java.util.List;

public class OrdenacaoList {
    public static void main(String[] args) {
     /*  List<Gato> meusGatos=new ArrayList<>(){{
           add(new Gato(nome: "Jon", idade:18, cor:"branco"));
       }};*/

    }
}

class Gato {
    private  String nome;
    private Integer idade;
    private String cor;

    public Gato(String nome, Integer idade, String cor) {
        this.nome = nome;
        this.idade = idade;
        this.cor = cor;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }


}
