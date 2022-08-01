package Set;

import java.util.*;

public class exemploSet {
    public static void main(String[] args) {
        Set<Double> notas= new HashSet<>(Arrays.asList(7d,8.5,9.3,5d,7d,0d,3.6));
        System.out.println(notas);

        //confira se a nota 5 esta no conjunto
        System.out.println(notas.contains(5d));

        //exibir a menor nota
        System.out.println(Collections.min(notas));

        //exibir a maior nota
        System.out.println(Collections.max(notas));

        //exibir a soma dos valores
        Iterator<Double> iterator = notas.iterator();
        Double soma=0d;
        while(iterator.hasNext()){
            Double next= iterator.next();
            soma+=next;
        }
        System.out.println(soma);

        //media das notas
        System.out.println(soma/notas.size());

        //remover a nota zero
        notas.remove(0d);
        System.out.println(notas);

        //remova as notas menores que 7 e exiba
        Iterator<Double> iterator1 = notas.iterator();
        while(iterator1.hasNext()){
            Double next=iterator1.next();
            if (next<7) iterator1.remove();

        }
        System.out.println(notas);

        //criar um conjunto e adicione as notas
        Set<Double> notas2=new LinkedHashSet<>();
        notas2.add(7d);
        notas2.add(8.5);
        notas2.add(9.3);
        notas2.add(5d);
        notas2.add(7d);
        notas2.add(0d);
        notas2.add(3.6);
        System.out.println(notas2);

        //exibir em ordem crescente
        Set<Double> notas3=new TreeSet<>(notas2);
        System.out.println(notas3);

        //apague o conjunto
        notas.clear();
        System.out.println(notas);

    }
}
