package ArrayLists;

import java.util.ArrayList;
import java.util.Arrays;

public class Prueba {
    public static void main(String[] args) {

        ArrayList<Integer> listaNumeros = new ArrayList<>();
        listaNumeros.add(10);
        listaNumeros.add(20);
        Object copia_mala = listaNumeros.clone();
        ArrayList<Integer> copia_buena = new ArrayList<>(listaNumeros);

        System.out.println(listaNumeros.contains(10));

        listaNumeros.clear();
        System.out.println("Lista vacia: " + listaNumeros.isEmpty());

        listaNumeros.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(listaNumeros);


    }
}
