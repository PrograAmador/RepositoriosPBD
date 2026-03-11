package Colecciones.Colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ej4_ListaCompra {

    static Scanner sc = new Scanner(System.in);
    static Deque<String> listaCompra = new LinkedList<>();

    public static void main(String[] args) {
        listaCompra.offerLast("Leche");
        listaCompra.offerLast("Pan");
        listaCompra.offerLast("Huevos");
        listaCompra.offerLast("Fruta");

        menu();
        switch (seleccionarOpcion().toLowerCase()) {
            case "1":
                System.out.println("Producto a añadir: ");
                String producto = sc.nextLine();
                listaCompra.offerLast(producto);
                System.out.println("Producto añadido " +listaCompra);
                break;
            case "2":
                emptyComprobator();
                System.out.println("Eliminando primer producto: " + listaCompra.pollFirst());
                break;
            case "3":
                emptyComprobator();
                System.out.println("Eliminando producto con nombre: ");
                String productoEliminar = sc.nextLine();
                if(listaCompra.contains(productoEliminar)) {
                    listaCompra.remove(productoEliminar);
                    System.out.println("Producto eliminado " +listaCompra);
                }else {
                    System.out.println("Producto no encontrado");
                }
                break;
            case "4":
                emptyComprobator();
                System.out.println("Primer producto: " + listaCompra.peekFirst());
                break;
            case "5":
                System.out.println("Producto a buscar: ");
                String productoBuscar = sc.nextLine();
                emptyComprobator();

                if(listaCompra.contains(productoBuscar)) {
                    System.out.println("Producto encontrado " +listaCompra);
                }else {
                    System.out.println("Producto no encontrado");
                }
                break;
            case "6":
                System.out.println("Mostrando lista de compra...");
                for( int i = 0; i< listaCompra.size();i++){

                }
                break;
            case "x":
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("Opción no válida");
        }


    }
    public static void menu(){
        System.out.println("--- LISTA DE COMPRA ---");
        System.out.println("1. Agregar producto al final");
        System.out.println("2. Eliminar primer producto");
        System.out.println("3. Eliminar producto por nombre");
        System.out.println("4. Ver primer producto");
        System.out.println("5. Buscar producto");
        System.out.println("6. Mostrar lista de compra");
        System.out.println("X. Salir");
    }
    public static String seleccionarOpcion(){
        System.out.print("Seleccione una opción: ");
        return sc.nextLine();
    }
    public static void emptyComprobator() {
        if(listaCompra.isEmpty()) {
            System.out.println("La lista de compra está vacía");
        }
    }
}
