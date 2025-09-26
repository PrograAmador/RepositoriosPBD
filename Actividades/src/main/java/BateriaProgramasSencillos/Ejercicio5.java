package BateriaProgramasSencillos;

import java.util.Scanner;

public class Ejercicio5 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce dos numeros y los dividiré: ");
        System.out.println("Numero 1: ");
        double numero1 = entrada.nextDouble();
        System.out.println("Numero 2: ");
        double numero2 = entrada.nextDouble();
        if(numero2 == 0) {
            System.out.println("ERROR: No se puede dividir entre 0");
        } else {
            double solucion = numero1 / numero2;
            System.out.println("LA solucion de la division es: " + solucion);
        }
    }
}
