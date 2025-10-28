package ActivClaseRandom;

import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("**VOY A TIRAR DOS DADOS**");
        int dado1 = random.nextInt(1, 7);
        int dado2 = random.nextInt(1, 7);
        System.out.println("El valor del primer dado es: " + dado1);
        System.out.println("El valor del segundo dado es: " + dado2);
        int suma = dado1 + dado2;
        System.out.println("La suma de los dos dados es: " + suma);
    }
}
