package Excepciones;

import java.awt.*;
import java.util.Scanner;

public class AppBanco {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        CuentaBancaria cuenta = new CuentaBancaria(500);

        Menu();
        String opcion = Opcion();

        do {
            switcher(opcion, cuenta);
            opcion = Opcion();

        }while(!opcion.equals("x"));

        System.out.println("Gracias por usar el cajero automático. ¡Hasta luego!");

    }
    public static void switcher(String opcion, CuentaBancaria cuenta) {
        switch (opcion) {
            case "1":
                System.out.println(cuenta.consultarSaldo());
                break;
            case "2":
                System.out.println("Ingrese la cantidad a depositar: ");
                double deposito = sc.nextDouble();
                sc.nextLine();
                cuenta.ingresarSaldo(deposito);
                break;
            case "3":
                System.out.println("Ingrese la cantidad a retirar: ");
                double retiro = sc.nextDouble();
                sc.nextLine();
                cuenta.sacarSaldo(retiro);
                break;
            default:
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                break;
        }
        Menu();

    }
    public static void Menu() {
        System.out.println("=== Cajero Automático ===");
        System.out.println("\n [1]. Consultar saldo");
        System.out.println(" [2]. Ingresar dinero");
        System.out.println(" [3]. Sacar dinero");
        System.out.println(" [X]. Salir");
        System.out.println();


    }
    public static String Opcion(){
        System.out.println("Selecciona una opción: ");
        return sc.nextLine().toLowerCase();
    }
}
