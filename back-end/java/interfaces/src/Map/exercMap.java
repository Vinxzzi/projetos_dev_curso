package Map;

import java.util.HashMap;
import java.util.Map;

public class exercMap {
    public static void main(String[] args) {
        Map<String,Double> carrosPopulares=new HashMap<>(){{
           put("gol",14.4);
            put("uno",15.1);
            put("mobi",16.4);
            put("hb20",12.7);
            put("kwid",14.1);

        }};
        System.out.println(carrosPopulares);


        //Substitua o consumo por um outro valor

        carrosPopulares.put(k "gol", v 15.2);
        System.out.println();
    }
}
