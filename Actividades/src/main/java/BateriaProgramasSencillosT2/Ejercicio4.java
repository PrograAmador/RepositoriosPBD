package BateriaProgramasSencillosT2;

import java.util.Scanner;

public class Ejercicio4 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int numero1 = 0;
        int numero2 = 0;
        int numero3 = 0;

        try{
            System.out.println("Introduce tres numeros y te dire cual es el mas pequeño: ");
            System.out.println("Numero 1: ");
            numero1 = entrada.nextInt();
            System.out.println("Numero 2: ");
            numero2 = entrada.nextInt();
            System.out.println("Numero 3: ");
            numero3 = entrada.nextInt();
                if(numero1 == numero2 && numero1 == numero3 ) {
                    System.out.println("ERROR: hay numeros introducidos que son iguales");
                }
        } catch (Exception e) {
            System.out.println("ERROR: Debes introducir un numero valido");
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
