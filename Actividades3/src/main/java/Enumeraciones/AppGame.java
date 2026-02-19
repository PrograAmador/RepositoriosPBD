package Enumeraciones;

import java.util.Random;
import java.util.Scanner;

public class AppGame {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Random r = new Random();

        System.out.println("Introduce la dificultad del juego: FACIL, MEDIO, DIFICIL o EXPERTO");
        String dificultad = sc.nextLine();
        int puntuacion = r.nextInt(10000);
        System.out.println("Puntuación obtenida = "+puntuacion);
        System.out.println("Puntuacon final = "+ puntuacion * Dificultad.valueOf(dificultad.toUpperCase()).getMultiplicador());
    }
}
