package ArrayLists;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class listaCompra {
    public static void main(String[] args) {

        ArrayList<String> listaCompra = new ArrayList<>();

        if(listaCompra.isEmpty()){
            System.out.println("La lista de la compra está vacía");
        }else{
            System.out.println("La lista de la compra tiene elementos");
        }
        listaCompra.add("Leche");
        if (listaCompra.isEmpty()){
            System.out.println("La lista de la compra está vacía");
        }else{
            System.out.println("La lista de la compra tiene elementos");
        }

        listaCompra.addAll(Arrays.asList("Pan", "Huevos", "Azúcar", "Café", "Arroz"));
        System.out.println("Lista de la compra: " + listaCompra);

        System.out.println("Tercer elemento de la lista: " + listaCompra.get(2));

        listaCompra.add(2, "Queso");

        System.out.println(listaCompra.contains("Leche"));
        String elemento = "Leche";
            if(listaCompra.contains(elemento) ){
                System.out.println("Elemento ya en la lista");
            }else{
                listaCompra.add(elemento);
                System.out.println("Elemento añadido a la lista");
            }

        System.out.println("Numero de elementos: " + listaCompra.size());

        ArrayList<String> clonLista = new ArrayList<>(listaCompra);

        clonLista.clear();
        System.out.println("Lista clon: " + clonLista);

        boolean sonIguales = listaCompra.equals(clonLista);

        if(sonIguales){
            System.out.println("Las listas son iguales");
        }else{
            System.out.println("Las listas son diferentes");
        }

        clonLista.add("Leche");
        clonLista.add("Pan");

        ArrayList<String> faltantes = new ArrayList<>(listaCompra);

        faltantes.removeAll(clonLista);

        ArrayList<Integer> precios = new ArrayList<>(listaCompra.size());

        precios.addAll(Arrays.asList(10, 13, 25, 39, 49, 5));

        System.out.println(listaCompra);
        System.out.println(precios);



    }

}
