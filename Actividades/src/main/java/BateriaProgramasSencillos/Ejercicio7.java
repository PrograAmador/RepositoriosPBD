package BateriaProgramasSencillos;

import java.util.Scanner;

public class Ejercicio7 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Vamos a hacer un bocata de locos.");
        System.out.println("Ingredientes: ");
        System.out.println("Tenemos tomate?");
        String respuesta1 = entrada.nextLine();
        System.out.println("Tenemos aceite?");
        String respuesta2 = entrada.nextLine();
        System.out.println("Tenemos jamon?");
        String respuesta3 = entrada.nextLine();
        if (respuesta1.equals("Si") && respuesta2.equals("Si") && respuesta3.equals("Si")) {
            System.out.println("¡No tenemos que ir a comprar!");
        } else {
            System.out.println("¡Tenemos que ir a comprar!");
        }

    }
}
