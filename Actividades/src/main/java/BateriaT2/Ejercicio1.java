package BateriaT2;

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce una frase: ");
        String frase = entrada.nextLine();
        System.out.println("Esta es la frase que has introducido: " + frase); //a)

        System.out.println("Esta es la longitud de la frase: " + frase.length()); //b)

        System.out.println("Esta es la frase sin espacios: " + frase.trim().replace(" ", "")); //c)

        String mitad1 = frase.substring(0, frase.length()/2);
        String mitad2 = frase.substring(frase.length()/2);
        System.out.println("Primera mitad del texto es: " + mitad1 + ", y la segunda mitad del texto es " + mitad2 + ", en total hacen " + mitad1.concat(mitad2));//d)

        System.out.println("La frase en mayusculas es: " + frase.toUpperCase()); //e)

    }
}
