package BateriaT2;

import java.util.Scanner;

public class Ejercicio2 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("**PALABRA COMPARATOR**");
        System.out.println("Palabra 1: ");
        String palabra1 = entrada.nextLine();
        System.out.println("Palabra 2: ");
        String palabra2 = entrada.nextLine();

        if (palabra1.length() > palabra2.length()) {
            System.out.println("La palabra 1 es mayor que la palabra 2");
        } else if (palabra1.length() < palabra2.length()) {
            System.out.println("La palabra 2 es mayor que la palabra 1");
        } else {
            System.out.println("Las dos palabras miden lo mismo");
        }

    }
}
