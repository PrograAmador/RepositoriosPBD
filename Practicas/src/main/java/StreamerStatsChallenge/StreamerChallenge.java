package StreamerStatsChallenge;

import java.util.Arrays;
import java.util.Scanner;

public class StreamerChallenge {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("*** ESTADISTICAS PREMIOS ESLAND ***");
        System.out.println("---------------------------------");
        System.out.print("Inserta streamer a analizar: ");
        String streamer = entrada.nextLine();
        System.out.println("Inserta los espectadores medidos separados por un espacio: ");
        String espectadoresitos = entrada.nextLine();

        String[] espectadorsotes = espectadoresitos.split(" "); // Divide por espacios
        int[] espectadores = new int[espectadorsotes.length];

        for (int i = 0; i < espectadorsotes.length; i++) {
            try{
                espectadores[i] = Integer.parseInt(espectadorsotes[i]); // Convierte cada parte a int
            }catch (NumberFormatException e){
                System.out.println("Error: Entrada no válida. Saliendo del programa.");
                return;
            }
        }
        if (espectadores.length == 0) {
            System.out.println("Error. No se han introducido espectadores.");
            return;
        }


        // Inicializar mayor y menor
        int mayor = espectadores[0];
        int menor = espectadores[0];
        for (int i = 1; i < espectadores.length; i++) {
            if (espectadores[i] > mayor) {
                mayor = espectadores[i];
            }
            if (espectadores[i] < menor) {
                menor = espectadores[i];
            }
        }

        System.out.println("Inserta el número de comentarios separados por un espacio: ");
        String comentaritos = entrada.nextLine();

        String[] comentarotes = comentaritos.split(" "); // Divide por espacios
        int[] comentarios = new int[comentarotes.length];

        if (comentarios.length == 0) {
            System.out.println("Error. No se han introducido comentarios.");
            return;
        }

        for (int i = 0; i < comentarotes.length; i++) {
            try{
                comentarios[i] = Integer.parseInt(comentarotes[i]); // Convierte cada parte a int
            }catch (NumberFormatException e){
                System.out.println("Error: Entrada no válida. Saliendo del programa.");
                return;
            }
        }

        if (comentarios.length != espectadores.length) {
            System.out.println("Error. El número de comentarios y espectadores no coinciden.");
            return;
        }


        // Calcular el ratio más alto del HYPE
        double mayor2 = 0;
        if (espectadores[0] != 0) {
            mayor2 = (double) comentarios[0] / espectadores[0]; //Calculo el primero para ir comparandolo con los demas y compruebo que no sea 0
        }
        int hype = 0;
        for (int j = 1; j < espectadores.length; j++) {
            if (espectadores[j] == 0) {
                System.out.println("Error. Lo espectadores no pueden ser 0. Saliendo del programa.");
                return;
            }
            double ratio =  (double) comentarios[j] / espectadores[j];
            hype = j + 1; // Día actual
            if (ratio > mayor2) {
                mayor2 = ratio;
            }
        }

        double racha = ((double) ((mayor - menor) * 100) / mayor);

        System.out.println("---------------------------------------------------");
        System.out.println("Resultados para el streamer: ");
        System.out.println("@" + streamer);
        System.out.println("MAX=" + mayor);
        System.out.println("HYPE= día " + hype + " (" + mayor2 + ")");
        System.out.println("RACHA=" + racha + "%");
    }
}