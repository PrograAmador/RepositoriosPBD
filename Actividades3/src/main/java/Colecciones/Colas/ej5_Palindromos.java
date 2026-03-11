package Colecciones.Colas;

import java.util.Deque;
import java.util.LinkedList;

public class ej5_Palindromos {
    public static void main(String[] args) {

        Deque<Character> palindromo = new LinkedList<>();

        String palabra = "abba";

        for (int i = 0; i < palabra.length(); i++) {
            palindromo.offer(palabra.charAt(i));
        }



        boolean esPalindromo = true;

        while (palindromo.size() > 1) {
            if (palindromo.pollFirst() != palindromo.pollLast()) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            System.out.println("La palabra es un palíndromo");
        } else {
            System.out.println("La palabra no es un palíndromo");
        }

    }
}
