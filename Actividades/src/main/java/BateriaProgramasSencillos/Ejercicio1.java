package BateriaProgramasSencillos;

import java.util.Scanner;

public class Ejercicio1 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Introduce tus horas trabajadas y lo que cobras por hora y calculare tu sueldo");
        System.out.println("Horas trabajadas: ");
        double horas = entrada.nextDouble();
        System.out.println("Lo que cobras por hora: ");
        double euros = entrada.nextDouble();
        double sueldo = horas * euros;
        System.out.println("Tu sueldo es: " + sueldo + " euros");
    }
}
