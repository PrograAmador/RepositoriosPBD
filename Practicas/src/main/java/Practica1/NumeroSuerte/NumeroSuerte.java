package Practica1.NumeroSuerte;

import java.util.Scanner;

public class NumeroSuerte {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce tu fecha de nacimiento (dd/mm/aaaa): ");
        String fecha = entrada.nextLine();
        int dia, mes, anio;

        if (fecha.charAt(2) != '/' | fecha.charAt(5) != '/' | fecha.length() != 10) { // Validación del formato
            System.out.println("Error: El formato debe ser dd/mm/aaaa.");
            return;
        }

        try {
            // Aquí pueden saltar errores si hay letras o el formato no es numérico
            dia = Integer.parseInt(fecha.substring(0, 2));
            mes = Integer.parseInt(fecha.substring(3, 5));
            anio = Integer.parseInt(fecha.substring(6, 10));
        } catch (Exception e) {
            System.out.println("Error: La fecha debe contener solo números válidos.");
            return;
        }


        if (dia < 1 || dia > 31 || mes < 1 || mes > 12 || anio < 1900 || anio > 2025) { // Validación de rangos
            System.out.println("Error: Fecha no válida.");
        } else { // si todo es correcto, calculamos el número de la suerte
            int suma = dia + mes + anio;
            String digitos = Integer.toString(suma);
            int digito1 = Integer.parseInt(digitos.substring(0, 1));
            int digito2 = Integer.parseInt(digitos.substring(1, 2));
            int digito3 = Integer.parseInt(digitos.substring(2, 3));
            int digito4 = Integer.parseInt(digitos.substring(3, 4));
            int numeroSuerte = digito1 + digito2 + digito3 + digito4;
            System.out.println(fecha);
            System.out.println(dia + "+" + mes + "+" + anio + " = " + suma);
            System.out.println(digito1 + "+" + digito2 + "+" + digito3 + "+" + digito4 + " = " + numeroSuerte);
            System.out.println("Tu numero de la suerte es " + numeroSuerte);
        }
    }

}
