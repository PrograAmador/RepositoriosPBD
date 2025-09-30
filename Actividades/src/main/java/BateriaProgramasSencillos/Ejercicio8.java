package BateriaProgramasSencillos;

import java.util.Scanner;

public class Ejercicio8 {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce los lados del triángulo:");
        int lado1 = 0;
        int lado2 = 0;
        int lado3 = 0;
        try {
            System.out.print("Lado1: ");
            lado1 = entrada.nextInt();

            System.out.print("Lado2: ");
            lado2 = entrada.nextInt();

            System.out.print("Lado3: ");
            lado3 = entrada.nextInt();
        }catch (Exception e) {
            System.out.println("ERROR: Debes introducir un numero valido");
            return;
        }

        if (lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("El triángulo es equilátero");
            } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
                System.out.println("El triángulo es isósceles");
            } else {
                System.out.println("El triángulo es escaleno");
            }
        } else {
            System.out.println("Los lados introducidos no forman un triángulo válido.");
        }
    }
}
