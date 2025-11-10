package BateriaArrays;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int [] array = {1,2,3,5};
        int [] array2 = new int[array.length + 1];

        System.out.println("Inserta el numero:" );
        int numero = entrada.nextInt();
        System.out.print("En la posicion: ");
        int posicion = entrada.nextInt();
        for(int i = 0; i < array2.length; i++) {
            if(i < posicion) {
                array2[i] = array[i];
            } else if(i == posicion) {
                array2[i] = numero;
            } else {
                array2[i] = array[i - 1];
            }
        }
        System.out.println("Array resultante: " + java.util.Arrays.toString(array2));


    }
}
