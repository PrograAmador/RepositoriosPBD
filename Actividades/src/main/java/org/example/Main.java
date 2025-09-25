package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Como te llamas?");
        String nombre = entrada.nextLine();
        System.out.println("¿A que curso vas?");
        String curso = entrada.nextLine();
        System.out.println("Hola " + nombre + ", bienvenido a " + curso);
        System.out.println("Introduce un numero");
        int numero1 = entrada.nextInt();
        System.out.println("Introduce otro numero");
        int numero2 = entrada.nextInt();
        int suma = numero1 + numero2;
        System.out.println("El resultado de sumar " + numero1 + " y " + numero2 + " es " + suma);
    }
}