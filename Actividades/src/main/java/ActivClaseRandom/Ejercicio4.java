package ActivClaseRandom;

import java.util.Random;

public class Ejercicio4 {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("***RANDOM PASSWORD GENERATOR***");
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String contrasenya = "";

        for(int i = 0; i < 12; i++){
            int rangoMayus = random.nextInt(0, 25);
            int rangoLetras = random.nextInt(26, 51);
            int rangoNumeros = random.nextInt(52, 61);
            int randomator = random.nextInt(0, 3);
            if(randomator == 0){
                contrasenya += caracteres.charAt(rangoMayus);
            } else if(randomator == 1){
                contrasenya += caracteres.charAt(rangoLetras);
            } else {
                contrasenya += caracteres.charAt(rangoNumeros);
            }

        }
        System.out.println(contrasenya);
    }
}
