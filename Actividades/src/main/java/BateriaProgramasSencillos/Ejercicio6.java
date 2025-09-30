package BateriaProgramasSencillos;

import java.util.Scanner;

public class Ejercicio6 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Vamos a calcular el area de un triangulo");
        int base;
        int altura;

        try{
            do {
                System.out.println("Introduce la base: ");
                base = entrada.nextInt();
                if (base < 0) {
                    System.out.println("El valor de la base tiene que ser positivo");
                }
            }while (base < 0);
        } catch (Exception e) {
            System.out.println("Error: Debes introducir un numero entero positivo.");
            return;
        }

        try {
            do {
                System.out.println("Introduce la altura: ");
                altura = entrada.nextInt();
                if (altura < 0) {
                    System.out.println("El valor de la altura tiene que ser positivo");
                }
            } while (altura < 0);
        }catch (Exception e) {
            System.out.println("Error: Debes introducir un numero entero positivo.");
            return;
        }

        double area = (base * altura) / 2.0;
        System.out.println("El area del triangulo es: " + area);
    }
}
