package BateriaProgramasSencillos;

import java.util.Scanner;

public class Ejercicio3 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce un numero y te dire si es negativo o positivo: ");
        int numero = entrada.nextInt();
        if(numero < 0) {
            System.out.println("El numero es negativo");
        } else if (numero == 0) {
            System.out.println("El numero es cero bribon");
        }else {
            System.out.println("El numero es positivo");
        }
    }
}

