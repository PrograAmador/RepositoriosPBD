package ActividadSplit;

import java.util.Scanner;

public class Navidad {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introudce la palabra a imprimir: ");
        String palabra = entrada.nextLine();

        String[] letras = palabra.split("");

        System.out.println("Introduce cuantas letras quieres en tu palabra separados por espacio: " );
        String numeros = entrada.nextLine();
        String[] cantidades = numeros.split(" ");

        if(cantidades.length == letras.length) {
            for(int i = 0; i < letras.length; i++) {
                int cantidad = Integer.parseInt(cantidades[i]);
                for(int j = 0; j < cantidad; j++) {
                    System.out.print(letras[i]);
                }
            }
        }else {
            System.out.println("Error: El número de cantidades no coincide con el número de letras.");

        }


    }
}
