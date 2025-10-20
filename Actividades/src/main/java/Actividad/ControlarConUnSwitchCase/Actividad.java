package Actividad.ControlarConUnSwitchCase;


import java.time.LocalDateTime;
import java.util.Scanner;


public class Actividad {
    public static void main(String[] args) {
        LocalDateTime hoy = LocalDateTime.now();
        Scanner entrada = new Scanner(System.in);

        System.out.println("Elige un modo 1 ó 2: ");

        int anyoInt = 0;
        if(entrada.hasNextInt()) {// Compruebo que la entrada es lo que quiero
            int modo = entrada.nextInt();
            switch (modo){
                case 1:
                    System.out.println("Introduce tu año de nacimiento: ");
                    if(entrada.hasNextInt()) {// Compruebo que la entrada es lo que quiero
                        anyoInt = Integer.parseInt(entrada.next());// Convierto String a Int
                    }else{
                        System.out.println("Debes introducir un número entero");
                        return;
                    }
                    if ( anyoInt >= 1900 && anyoInt <= hoy.getYear()) {
                        System.out.println("Tu año es valido");
                    } else {
                        System.out.println("Año no válido");
                    }
                    break;
                case 2:
                    System.out.println("Introduce tu edad: ");
                    if(entrada.hasNextInt()) {
                        int edad = entrada.nextInt();
                        if (edad >= 0) {
                            anyoInt = hoy.getYear() - edad;
                        } else {
                            System.out.println("Edad no válida");
                        }
                    }else{
                        System.out.println("Debes introducir un número entero");
                        return;
                    }
                    break;
                default:
                    System.out.println("Modo no válido. Debes introducir 1 ó 2");
                    return;
            }
        }else{
            System.out.println("Debes introducir un número entero.");
            return;
        }


        if(anyoInt >= 1900 && anyoInt <= 1927) { // Compruebo el rango de años
            System.out.println("Eres de la Generación bautizada ");
        }else if(anyoInt >= 1928 && anyoInt <= 1944) {
            System.out.println("Eres de la Generación Silent");
        }else if(anyoInt >= 1945 && anyoInt <= 1964) {
            System.out.println("Eres de la Generación Baby Boom");
        } else if (anyoInt >= 1965 && anyoInt <= 1981) {
            System.out.println("Eres de la Generación X");
        } else if (anyoInt >= 1982 && anyoInt <= 1994) {
            System.out.println("Eres de la Generación Millennial o Y");
        } else if (anyoInt >= 1995 && anyoInt <= hoy.getYear()) {
            System.out.println("Eres de la Generación Z o Centennial");
        }

    }
}
