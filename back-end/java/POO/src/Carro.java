//Classe criada
public class Carro {


    //criando atributos
    String cor;
    String modelo;
    int capacidadeTanque;


    //Construtores

    Carro(){

    }

    Carro(String cor, String modelo, int capacidadeTanque){
        this.cor=cor;
        this.modelo=modelo;
        this.capacidadeTanque=capacidadeTanque;
    }



    //get e set / coloca e pega valor nos atributos

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getCor() {
        return cor;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }


    public String getModelo() {
        return modelo;
    }

    void setCapacidadeTanque(int capacidadeTanque){
        this.capacidadeTanque=capacidadeTanque;
    }

    public int getCapacidadeTanque() {
        return capacidadeTanque;
    }

    //criando metodos

    double totalValorTanque(double valorCombustivel){
        return capacidadeTanque * valorCombustivel;

    }

}
