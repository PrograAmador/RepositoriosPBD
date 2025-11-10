package BateriaArrays;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);
        int[] numeros = new int[25];

        for(int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }
        System.out.println("Ingresa un número a buscar (1-100):");
        int numeroBuscado = entrada.nextInt();
        int contador = 0;
        for(int i = 0; i < numeros.length; i++) {
            if(numeros[i] == numeroBuscado) {
                contador++;
            }
        }
        System.out.println("El número " + numeroBuscado + " aparece " + contador + " veces en el array.");

    }
}
