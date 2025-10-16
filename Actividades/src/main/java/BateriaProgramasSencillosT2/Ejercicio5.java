package BateriaProgramasSencillosT2;

import java.util.Scanner;

public class Ejercicio5 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        double numero1 = 0;
        double numero2 = 0;
        try{
            System.out.println("Introduce dos numeros y los dividiré: ");
            System.out.println("Numero 1: ");
            numero1 = entrada.nextDouble();
            System.out.println("Numero 2: ");
            numero2 = entrada.nextDouble();
        } catch (Exception e) {
            System.out.println("ERROR: Debes introducir un numero valido");
        }

        if(numero2 == 0) {
                System.out.println("ERROR: No se puede dividir entre 0");
            } else {
                double solucion = numero1 / numero2;
                System.out.println("LA solucion de la division es: " + solucion);
            }
    }
}
