package BateriaArrays;

import java.util.Arrays;
import java.util.Random;

public class Ejercicio1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numeros = new int[8];
        int suma  = 0;
        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(500) + 1;
            suma += numeros[i];
        }
        System.out.println("La suma de los elementos es: " + suma);
    }
}
