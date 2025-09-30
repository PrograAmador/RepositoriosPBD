package BateriaProgramasSencillos;

import java.util.Scanner;

public class Ejercicio7 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        String respuesta1 = "";
        String respuesta2 = "";
        String respuesta3 = "";
        try {
            System.out.println("Vamos a hacer un bocata de locos.");
            System.out.println("Ingredientes: ");
            System.out.println("Tenemos tomate?");
            respuesta1 = entrada.nextLine();
            System.out.println("Tenemos aceite?");
            respuesta2 = entrada.nextLine();
            System.out.println("Tenemos jamon?");
            respuesta3 = entrada.nextLine();
        }catch (Exception e) {
            System.out.println("Error: Debes introducir una respuesta valida (Si/No)");
            return;
        }
        if (respuesta1.equals("Si") && respuesta2.equals("Si") && respuesta3.equals("Si")) {
            System.out.println("¡No tenemos que ir a comprar!");
        } else {
            System.out.println("¡Tenemos que ir a comprar!");
        }

    }
}
