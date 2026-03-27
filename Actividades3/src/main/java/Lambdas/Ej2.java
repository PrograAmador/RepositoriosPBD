package Lambdas;

public class Ej2 {
    public static void main(String[] args) {


        VerificadorVoto lambda = (String nombre, int edad) -> {
            System.out.println("Probando "+ nombre+ " con "+edad+" años...");

            return edad >= 18;
        };

        boolean resultado = lambda.puedeVotar("Pedro", 18);

        System.out.println("¿Puede votar? " + resultado);

    }
}
