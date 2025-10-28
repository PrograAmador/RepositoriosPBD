package ActivClaseRandom;

import java.util.Random;

public class Ejercicio2 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("***RANDOM PASSWORD GENERATOR***");
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contrasenya = "";
        for(int i = 0; i < 12; i++){
            contrasenya += caracteres.charAt(random.nextInt(caracteres.length()-1));
        }
        System.out.println(contrasenya);
    }
}
