package BateriaPreExamenT2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        System.out.println("Introduce 10 numeros: ");
        int numero = 0;
        for(int i = 0; i <10;i++){
            System.out.println("Numero " + (i+1) + ": ");
            numero = entrada.nextInt();
        }
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;
        if(numero>0){
            contadorPositivos++;
        }else if(numero<0){
            contadorNegativos++;
        }else{
            contadorCeros++;
        }
        System.out.println("Cantidad de numeros positivos: " + contadorPositivos);
        System.out.println("Cantidad de numeros negativos: " + contadorNegativos);
        System.out.println("Cantidad de ceros: " + contadorCeros);
    }
}
