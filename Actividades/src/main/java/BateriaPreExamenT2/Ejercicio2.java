package BateriaPreExamenT2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        System.out.println("Introduce un numero base: ");
        int numeroBase = entrada.nextInt();
        System.out.println("Introduce un exponente: ");
        int exponente = entrada.nextInt();
        if(exponente<0){
            System.out.println("El exponente no puede ser negativo.");
        }else{
            int resultado = 1;
            for(int i = 0; i < exponente; i++){
                resultado *= numeroBase;
            }
            System.out.println(numeroBase + " elevado a la " + exponente + " es: " + resultado);
        }
    }
}
