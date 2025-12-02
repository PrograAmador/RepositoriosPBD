package BateriaMetodos;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = entrada.nextInt();
        System.out.println("El cubo de " + numero + " es: " + cubo(numero));
    }
    public static int cubo(int numero){
        int resultado = numero * numero * numero;
        return resultado;
    }
}
