package BateriaArrays;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("Array original: " + java.util.Arrays.toString(numeros));
        System.out.println("Ingrese una posicion a eliminar en el array:");
        int posicionAEliminar = scanner.nextInt();
        int aux = 0;
        aux = numeros[numeros.length -1];
        for(int i = numeros.length - 1; i >=1; i--){
            if (i == numeros.length -1){
                aux = numeros[i];
                numeros[i] = numeros[i -1];
            }else{
                numeros[i] = numeros[i -1];
            }
        }
        numeros[0] = aux;
        System.out.println("Array resultante: " + java.util.Arrays.toString(numeros));



    }
}
