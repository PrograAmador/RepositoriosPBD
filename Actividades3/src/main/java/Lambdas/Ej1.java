package Lambdas;


public class Ej1 {


    public static void main(String[] args) {

        Ejecutor ej = new Ejecutor() {
            @Override
            public boolean ejecutar(int param1) {

                if (param1 > 10) {
                    return true;
                } else {
                    return false;
                }
            }

        };

        int num = 15;
        System.out.println("Comprobando para " + num+":");

        Prueba lambda = (int nota) -> {
            System.out.println("comparando para " + num);
            if (nota > 10){
                return "true";
            }else{
                return "false";
            }
        };
        System.out.println(ej.ejecutar(num));
        System.out.println(lambda.aprobar(15));
    }
}
