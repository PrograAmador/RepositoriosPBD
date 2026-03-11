package Colecciones.Mapas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ej3 {
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, Double> temperatura = new HashMap<>();
    public static void main(String[] args) {
        System.out.println("*** REGISTRO DE TEMPERATURAS ***");

        while(true){
            System.out.println("Elige una opción [insertas, actualizar, consultar, ver todas, salir]:");
            String opcion = sc.nextLine().toLowerCase();


            switch (opcion){
                case "insertar":
                    insertar();
                    break;
                case "actualizar":
                    actualizar();
                    break;
                case "consultar":
                    consultar();
                    break;
                case "ver todas":
                    verTodas();
                    break;
                case "salir":
                    return;
                default:
                    System.out.println("Error, vuelve a elegir una opcion");
                    break;
            }
//            System.out.println("***mapita temporal***");
//            for(Map.Entry<String, Double> mapita : temperatura.entrySet()){
//                System.out.println(mapita.getKey() + " - "+ mapita.getValue());
//            }
        }


    }
    public static void insertar(){
        System.out.println("Introduce los nuevos datos (ciudad-temperatura): ");
        String[] nuevosDatos = sc.nextLine().split("-");
        temperatura.put(nuevosDatos[0], Double.valueOf(nuevosDatos[1]));
    }
    public static void actualizar(){
        System.out.println("Introduce que ciudad quieres actualizar: ");
        String actualizador = sc.nextLine();
        if(temperatura.containsKey(actualizador)){
            System.out.println("Ciudad encontrada, introduce los nuevos datos: ");
            Double nuevosDatos = Double.valueOf(sc.nextLine());
            temperatura.replace(actualizador, nuevosDatos);
        }else{
            System.out.println("Ciudad no encontrada.");
        }

    }
    public static void consultar(){
        System.out.println("Que ciudad quieres consultar?:");
        String ciudad = sc.nextLine();
        if(temperatura.containsKey(ciudad)){
            System.out.println("Temperatura en " + ciudad + ":" + temperatura.get(ciudad)+ "º");
        }else{
            System.out.println("Ciudad no encontrada");
        }

    }
    public static void verTodas(){
        System.out.println("Registro de temperaturas: ");
        for(Map.Entry<String, Double> mapita : temperatura.entrySet()){
            System.out.println(mapita.getKey() + ": "+ mapita.getValue()+"º");
        }
    }


}
