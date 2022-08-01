package List;

import java.util.*;

public class exemploList {
    public static void main(String[] args) {
       // List notas= new ArrayList();//metodo antigo
      // List<Double> notas=new ArrayList<>();//interir o tipo de valores dentro da list
      //  List<Integer> notas= Arrays.asList(65,78,32,12,5,7,90);//nao podera adicionar ou remover elementos se fizer desta forma

        //Adicionando elementos
        List<Double> notas=new ArrayList<>();
        notas.add(7.0);
        notas.add(6.5);
        notas.add(7.8);
        notas.add(2.1);
        notas.add(3.6);
        notas.add(9.8);
        System.out.println(notas);


        //exibir posicao de uma nota especifica
        System.out.println("Posicao do valor 2.1: " + notas.indexOf(2.1));

        //adicinando elementos em uma determinada posicao
        notas.add(4,8d);
        System.out.println(notas);


        //substituir uma nota por outra
        notas.set(notas.indexOf(2.1), 6d);
        System.out.println(notas);

        //conferir se um valor especifico esta na lista
        System.out.println(notas.contains(8d));//true ou false

        //exibir notas na forma que forma inseridas
        /*for (Double nota: notas) {
            System.out.println();
        }*/

        //exibir a terceira nota adicionada
        System.out.println(notas.get(2));

        //exibir menor nota
        System.out.println(Collections.min(notas));

        //exibir maior nota
        System.out.println(Collections.max(notas));

        //exibir a soma dos valores
        Iterator<Double> iterator=notas.iterator();
        Double soma=0d;
        while(iterator.hasNext()){
            Double next=iterator.next();
            soma+=next;
        }
        System.out.println(soma);

        //Exibir a media das notas
        System.out.println(soma/ notas.size());

        //remova nota zero
        notas.remove(9.8);
        System.out.println(notas);

        //remova na posicao zero
        notas.remove(0);
        System.out.println(notas);

        //Remova as notas menores doque 7 e exiba
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next= iterator1.next();
            if (next<7) iterator1.remove();
        }
        System.out.println(notas);

        //apage td a lista
        notas.clear();
        System.out.println(notas);


        //


    }


}
