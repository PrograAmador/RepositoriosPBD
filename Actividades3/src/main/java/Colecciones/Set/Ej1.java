package Colecciones.Set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class Ej1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        LinkedHashSet<String> palabrasUnicas = new LinkedHashSet<>();

        System.out.println("Ingrese una frase: ");
        String frase = sc.nextLine().toLowerCase();

        String[] partes = frase.split(" ");

        for(int i = 0; i<partes.length;i++){
            palabrasUnicas.add(partes[i]);
        }

        System.out.println("Palabras unicas: " +palabrasUnicas);

    }
}
