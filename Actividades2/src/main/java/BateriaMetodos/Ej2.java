package BateriaMetodos;

import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opciones = 4;
        imprimirMenu(opciones);
        System.out.println("Elige una opción:");
        int opcion = entrada.nextInt();

        if(valida(opcion)){
            System.out.println("Has elegido la opción " + opcion);
        }


    }
    public static void imprimirMenu(int opciones){
        System.out.println("Menú de opciones:");
        for(int i = 1; i <= opciones; i++){
            System.out.println(i + ". Opción " + i);
        }
    }
    public static boolean valida(int opcion){
        if(opcion < 1 || opcion > 4){
            System.out.println("Opción no válida");
            return false;
        }else{
            return true;
        }
    }
}
