package ActivClaseRandom;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();
        System.out.println("***RANDOM NUMBER GENERATOR***");
        System.out.print("Ingrese el valor mínimo: ");
        int min = entrada.nextInt();
        System.out.print("Ingrese el valor máximo: ");
        int max = entrada.nextInt();
        int numeros = 0;
        if(min > max){
            System.out.println("ERROR. El valor mínimo no puede ser mayor que el valor máximo.");
        } else {
            System.out.println("Cuantos numeros quieres? :");
            numeros = entrada.nextInt();
        }
        for(int i = 0; i < numeros; i++){
            int numeroAleatorio = random.nextInt(max- min + 1) + min;
            System.out.println("Número aleatorio " + (i + 1) + ": " + numeroAleatorio);
        }




    }
}
