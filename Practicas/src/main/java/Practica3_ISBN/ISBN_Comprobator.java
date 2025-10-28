package Practica3_ISBN;

import java.util.Scanner;

public class ISBN_Comprobator {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("**BIENVENIDO AL ISBN COMPROBATOR 3000**");
        System.out.println("Seleccione un modo de uso (1 - 2 - 3):");
        System.out.println("-Modo 1: Introduzca un ISBN para comprobar su validez.");
        System.out.println("-Modo 2: Reparar un ISBN. ");
        System.out.println("-Modo 3: Salir. ");
        System.out.println("Modo: ");
        int modo;
        try {
            modo = entrada.nextInt();
        }catch(Exception e){
            System.out.println("Error: Entrada no válida. Saliendo del programa.");
            return;
        }
        int contador = 10;
        int operacion = 0;
        int num;

        switch (modo) {
            case 1:
                // Comprobar si un ISBN-10 es válido
                System.out.print("Introduzca el ISBN a comprobar: ");
                String ISBN = entrada.next();
                for (int i = 0; i < ISBN.length(); i++) {

                    if (ISBN.charAt(i) == 'X') {
                        num = 10; // 'X' equivale a 10
                    } else {
                        num = Integer.parseInt(String.valueOf(ISBN.charAt(i)));
                    }
                    operacion += num * contador; // multiplico por posición (10-1)
                    contador--;
                }
                if (operacion % 11 == 0) {
                    System.out.println("El ISBN es válido.");
                } else {
                    System.out.println("El ISBN no es válido.");
                }
                break;

            case 2:
                // Calcular el dígito faltante de un ISBN-10 con '?'
                int interrogante = -1;
                int operacion2 = 0;
                System.out.print("Introduzca el ISBN a reparar: ");
                String reparador = entrada.next();
                for (int i = 0; i < 10; i++) {
                    char c = reparador.charAt(i);
                    if (c == '?') {
                        interrogante = i + 1; // guardo posición del dígito desconocido
                        continue;
                    }
                    int valor = (c == 'X' && i == 9) ? 10 : Integer.parseInt(String.valueOf(reparador.charAt(i)));
                    operacion2 += valor * (i + 1); // sumo los valores conocidos
                }

                int x = -1;
                // Pruebo los posibles valores (0–10) para encontrar el válido
                for (int j = 0; j <= 10; j++) {
                    int total = operacion2 + (interrogante * j);
                    if (total % 11 == 0) {
                        x = j;
                        break;
                    }
                }

                // Muestro el resultado
                if (x == 10) {
                    System.out.println("El dígito faltante es: X ");
                } else {
                    System.out.println("El dígito faltante es: " + x);
                }
                break;
            case 3:
                // Salir del programa
                System.out.println("Saliendo del programa. ¡Hasta luego!");
                break;
            default:
                // Salida del programa
                System.out.println("Numero desconocido. Saliendo del programa.");
                break;
        }
    }
}
