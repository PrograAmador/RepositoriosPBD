package BateriaT2;

import java.util.Scanner;

public class Ejercicio3 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("**NUMERO REMOVER**");
        System.out.println("Introduce un numero: ");
        String numero = entrada.nextLine();
        System.out.println("Introduce un numero de digitos a remover: ");
        int remover = entrada.nextInt();
        System.out.println("El numero resultante es: " + numero.substring(0, numero.length() - remover));

    }
}
