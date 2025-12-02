package BateriaMetodos;

import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String cadena = entrada.nextLine();
        System.out.println(mayusculator(cadena));
        System.out.println(cuentavocaletor(mayusculator(cadena)));

    }
    public static String mayusculator(String cadena){
        String resultado = cadena.toUpperCase();
        return resultado;
    }
    public static String cuentavocaletor(String cadena){
        int contador = 0;
        for(int i = 0; i < cadena.length(); i++){
            char letra = cadena.charAt(i);
            if(letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U'){
                contador++;
            }
        }
        return contador + " vocales";
    }
}
