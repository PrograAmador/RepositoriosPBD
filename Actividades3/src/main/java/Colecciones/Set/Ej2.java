package Colecciones.Set;

import java.util.Scanner;
import java.util.TreeSet;

public class Ej2 {
    static Scanner sc = new Scanner(System.in);
    static TreeSet<String> agenda = new TreeSet<>();
    public static void main(String[] args) {

        String opcion;
        do {
            opcion = menu().toLowerCase();
            switch (opcion) {
                case "1":
                    System.out.println("Nombre del nuevo contacto: ");
                    String contacto = sc.nextLine();
                    agenda.add(contacto);
                    break;
                case "2":
                    System.out.println(agenda);
                    break;
                case "3":
                    System.out.println("Que contacto quieres buscar: ");
                    String buscar = sc.nextLine().toLowerCase();
                    if (agenda.contains(buscar)) {
                        System.out.println("El contacto esta en la agenda!: " + agenda);
                    } else {
                        System.out.println("El contacto no aparece en la agenda.");
                    }
                    break;
                case "4":
                    System.out.println("Que contacto quiere eliminar: ");
                    String eliminar = sc.nextLine().toLowerCase();
                    if (agenda.contains(eliminar)) {
                        agenda.remove(eliminar);
                    } else {
                        System.out.println("Contacto no encontrado");
                    }
                    break;
                case "x":
                    System.out.println("Saliendo de la aplicacion...");
                    break;


            }
        }while (!opcion.equals("x"));

    }
    public static String menu(){
        System.out.println("-------AGENDA-------");
        System.out.println("1. Añadir contacto");
        System.out.println("2. Mostrar contactos");
        System.out.println("3. Buscar contacto");
        System.out.println("4. Eliminar contacto");
        System.out.println("X. Salir");
        System.out.println(" ");
        System.out.println("Elige una opcion: ");
        String opcion = sc.nextLine();
        System.out.println("-------------------");
        return opcion;
    }

}

