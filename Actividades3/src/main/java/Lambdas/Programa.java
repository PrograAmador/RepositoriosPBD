package Lambdas;

public class Programa {
    public static void main(String[] args) {

        Prueba anonima = new Prueba() {
            @Override
            public String aprobar(int nota) {
                System.out.println("Aprobando progrmaacion con un " + nota);
                if (nota >= 5){
                    return "APROBADO";
                }else{
                    return "SUSPENSO";
                }
            }
        };

        Prueba lambda = (int nota) -> {
            System.out.println("Aprobando programas de acion con nota " + nota);
            if (nota >= 5){
                return "APROBADO";
            }else{
                return "SUSPENSO";
            }
        };


        System.out.println(anonima.aprobar(9));
        System.out.println( lambda.aprobar(9));

    }

}
