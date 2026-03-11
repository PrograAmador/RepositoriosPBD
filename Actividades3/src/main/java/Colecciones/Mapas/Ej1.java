package Colecciones.Mapas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Ej1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Introduce una palabra: ");
        String palabra = sc.nextLine();

        HashMap<String, Integer> palabrita = new HashMap<>();

        for(Character letra : palabra.toCharArray()){

            palabrita.put(String.valueOf(letra), palabrita.getOrDefault(letra,1)+1);
        }


    }
}
