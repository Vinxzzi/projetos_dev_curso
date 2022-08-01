package Polimorfismo;

public class RodarAp {
    public static void main(String[] args) {
        ClasseMae[] classes = new ClasseMae[]{
                new ClassFilha1(),new ClasseFilha2(),new ClasseMae()
        };

        for (ClasseMae classe:classes){
            classe.metodo1();
        }
    }
}
