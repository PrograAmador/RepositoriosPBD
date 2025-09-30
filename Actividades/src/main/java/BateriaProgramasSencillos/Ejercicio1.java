package BateriaProgramasSencillos;

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        double horas = 0;
        double euros = 0;
        System.out.println("Introduce tus horas trabajadas y lo que cobras por hora y calculare tu sueldo");
        System.out.println("Horas trabajadas: ");
        try {
            horas = entrada.nextDouble();
            System.out.println("Lo que cobras por hora: ");
            euros = entrada.nextDouble();
        }catch (Exception e) {
            System.out.println("ERROR: Debes introducir un numero valido");
            return;
        }
        double sueldo = horas * euros;
        System.out.println("Tu sueldo es: " + sueldo + " euros");
    }
}
