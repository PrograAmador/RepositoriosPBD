package BateriaProgramasSencillos;

import java.util.Scanner;

public class Ejercicio4 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce tres numeros y te dire cual es el mas pequeño: ");
        System.out.println("Numero 1: ");
        int numero1 = entrada.nextInt();
        System.out.println("Numero 2: ");
        int numero2 = entrada.nextInt();
        System.out.println("Numero 3: ");
        int numero3 = entrada.nextInt();
        if(numero1 == numero2 && numero1 == numero3 ) {
            System.out.println("ERROR: hay numeros introducidos que son iguales");
        }
        if(numero1 <= numero2 && numero1 <= numero3) {
            System.out.println("El numero mas pequeño es: " + numero1);
        } else if (numero2 <= numero1 && numero2 <= numero3) {
            System.out.println("El numero mas pequeño es: " + numero2);
        } else {
            System.out.println("El numero mas pequeño es: " + numero3);
        }
    }
}
