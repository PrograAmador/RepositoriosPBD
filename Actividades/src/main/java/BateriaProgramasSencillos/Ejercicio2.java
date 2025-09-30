package BateriaProgramasSencillos;

import java.util.Scanner;

public class Ejercicio2 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        double horas;
        double euros;
        double sueldo;

        try {
            System.out.println("Introduce tus horas trabajadas y lo que cobras por hora y calculare tu sueldo");
            System.out.println("Horas trabajadas: ");
            horas = entrada.nextDouble();
            System.out.println("Lo que cobras por hora: ");
            euros = entrada.nextDouble();
        } catch (Exception e) {
            System.out.println("ERROR: Debes introducir un numero valido");
            return;
        }

        if(horas > 40) {
            System.out.println("Como has trabajado mas de 40 horas, se te pagara un extra del 50% por las horas extras");
            double horasExtra = horas - 40;
            sueldo = (40 * euros) + (horasExtra * euros * 1.5);
        }else{
            sueldo = horas * euros;
        }

        System.out.println("Tu sueldo es: " + sueldo + " euros");
    }
}