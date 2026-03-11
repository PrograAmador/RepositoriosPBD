package AceptaElReto;

import java.util.ArrayList;
import java.util.Stack;

// Asume fichero llamado solution.java
public class Parentesis_Balanceados {

    static java.util.Scanner in;

    public static boolean casoDePrueba() {
        if (!in.hasNext())
            return false;
        else {
            String cadena = in.nextLine();
            ArrayList<Character> lista = new ArrayList<>();
            for (int i = 0; i < cadena.length(); i++) {
                char c = cadena.charAt(i);
                if (c == '(' || c == '{' || c == '[') {
                    lista.add(c);
                } else if (c == ')' || c == '}' || c == ']') {
                    if (lista.isEmpty()) {
                        System.out.println("NO");
                        return true;
                    }
                }
                if(lista.size() % 2 == 0){
                    System.out.println("YES");
                    return true;
                }else{
                    System.out.println("NO");
                    return true;
                }
            }
            return true;
        }
    } // casoDePrueba

    public static void main(String[] args) {
        in = new java.util.Scanner(System.in);
        while (casoDePrueba()) {
        }
    } // main

} // class solution
