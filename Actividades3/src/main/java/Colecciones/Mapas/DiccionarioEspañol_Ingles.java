package Colecciones.Mapas;

import java.util.*;

public class DiccionarioEspañol_Ingles {
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, String> listaPalabros = new HashMap<>();
    public static void main(String[] args) {
        meterPalabras();

        while(true) {
            System.out.println("*** DICCIONARIO INGLÉS-ESPAÑOL ***");
            System.out.println("1-.Introducir nuevo par");
            System.out.println("2-.Traducir ");
            System.out.println("3-.Palabra español Aleatoria");
            System.out.println("4-.Juego primera letra ");
            System.out.println("X-.Salir");
            System.out.println("Selecciona una opcion: ");
            String opcion = sc.nextLine().toLowerCase();
            switch (opcion) {
                case "1":
                    nuevoPar();
                    break;
                case "2":
                    System.out.println("Introduce la palabra en español: ");
                    String palabra = sc.nextLine().toLowerCase();
                    System.out.println(traduce(palabra));
                    System.out.println("_____________________");
                    break;
                case "3":
                    System.out.println(palabraAleatoria());
                    System.out.println("_____________________");
                    break;
                case "4":
                    primeraLetraTraduccion();
                    System.out.println("_____________________");
                    break;
                case "x":
                    System.out.println("Saliendo del programa...");
                    return;

            }
        }
    }
    public static void nuevoPar(){
        System.out.println("Introduce la palabra en español que quieres introducir: ");
        String espanyol = sc.nextLine().toLowerCase();
        System.out.println("Introduce la palabra en inglés que quieres introducir: ");
        String ingles = sc.nextLine().toLowerCase();
        listaPalabros.put(espanyol,ingles);
    }
    public static String traduce(String palabro){
        if(listaPalabros.containsKey(palabro)){
            return listaPalabros.get(palabro);
        }else {
            System.out.println("Palabra no encontrada en el diccionario");
            return null;
        }

    }
    public static String palabraAleatoria(){
        List<String> espanyolWords = new ArrayList<>(listaPalabros.keySet());
        String palabro = espanyolWords.get(random.nextInt(listaPalabros.size()));
        return palabro;
    }
    public static void primeraLetraTraduccion(){
        int contador1= 0;
        int contador2= 0;
        int contador3= 0;
        while(true) {
                contador1++;
                String randomWord = palabraAleatoria();
                System.out.println(randomWord + ":" + listaPalabros.get(randomWord).toUpperCase().toCharArray()[0] + "...");
                System.out.println("Indique la respuesta: ");
                String respuesta = sc.nextLine().toLowerCase();
                if (respuesta.equals(listaPalabros.get(randomWord))) {
                    System.out.println("¡CORRECTO!");
                    System.out.println("__________________");
                    contador2++;
                } else if(!respuesta.equals("fin")){
                    System.out.println("¡NO! La respuesta correcta es " + listaPalabros.get(randomWord));
                    System.out.println("___________________");
                    contador3++;
                }
                if(respuesta.equals("fin")){
                    contador1--;
                    double porcentaje = (contador2 * 100.0) / contador1;
                    System.out.println("FIN DEL PROGRAMA");
                    System.out.println("Total preguntas: " + contador1);
                    System.out.println("Total aciertos: "+contador2);
                    System.out.println("Total errores: "+ contador3);
                    System.out.println("Aciertos: " + porcentaje +"%");
                    break;
                }

        }
    }
    public static void meterPalabras(){
        listaPalabros.put("perro", "dog");
        listaPalabros.put("gato", "cat");
        listaPalabros.put("casa", "house");
        listaPalabros.put("agua", "water");
        listaPalabros.put("comida", "food");
        listaPalabros.put("libro", "book");
        listaPalabros.put("coche", "car");
        listaPalabros.put("escuela", "school");
        listaPalabros.put("maestro", "teacher");
        listaPalabros.put("amigo", "friend");
        listaPalabros.put("puerta", "door");
        listaPalabros.put("ventana", "window");
        listaPalabros.put("ciudad", "city");
        listaPalabros.put("camino", "road");
        listaPalabros.put("sol", "sun");
        listaPalabros.put("luna", "moon");
        listaPalabros.put("estrella", "star");
        listaPalabros.put("cielo", "sky");
        listaPalabros.put("mar", "sea");
        listaPalabros.put("montaña", "mountain");
        listaPalabros.put("río", "river");
        listaPalabros.put("bosque", "forest");
        listaPalabros.put("arbol", "tree");
        listaPalabros.put("flor", "flower");
        listaPalabros.put("fruta", "fruit");
        listaPalabros.put("pan", "bread");
        listaPalabros.put("leche", "milk");
        listaPalabros.put("queso", "cheese");
        listaPalabros.put("carne", "meat");
        listaPalabros.put("pescado", "fish");
        listaPalabros.put("niño", "child");
        listaPalabros.put("mujer", "woman");
        listaPalabros.put("hombre", "man");
        listaPalabros.put("familia", "family");
        listaPalabros.put("trabajo", "work");
        listaPalabros.put("tiempo", "time");
        listaPalabros.put("día", "day");
        listaPalabros.put("noche", "night");
        listaPalabros.put("mañana", "morning");
        listaPalabros.put("tarde", "afternoon");
        listaPalabros.put("semana", "week");
        listaPalabros.put("mes", "month");
        listaPalabros.put("año", "year");
        listaPalabros.put("dinero", "money");
        listaPalabros.put("juego", "game");
        listaPalabros.put("ordenador", "computer");
        listaPalabros.put("telefono", "phone");
        listaPalabros.put("mesa", "table");
        listaPalabros.put("silla", "chair");
        listaPalabros.put("cama", "bed");
        listaPalabros.put("pared", "wall");
        listaPalabros.put("techo", "ceiling");
        listaPalabros.put("suelo", "floor");
        listaPalabros.put("llave", "key");
        listaPalabros.put("reloj", "clock");
        listaPalabros.put("bolsa", "bag");
        listaPalabros.put("zapato", "shoe");
        listaPalabros.put("camisa", "shirt");
        listaPalabros.put("pantalon", "pants");
        listaPalabros.put("sombrero", "hat");
        listaPalabros.put("gafas", "glasses");
        listaPalabros.put("playa", "beach");
        listaPalabros.put("isla", "island");
        listaPalabros.put("lago", "lake");
        listaPalabros.put("desierto", "desert");
        listaPalabros.put("viento", "wind");
        listaPalabros.put("lluvia", "rain");
        listaPalabros.put("nieve", "snow");
        listaPalabros.put("tormenta", "storm");
        listaPalabros.put("trueno", "thunder");
        listaPalabros.put("relampago", "lightning");
        listaPalabros.put("fuego", "fire");
        listaPalabros.put("humo", "smoke");
        listaPalabros.put("ceniza", "ash");
        listaPalabros.put("energia", "energy");
        listaPalabros.put("historia", "history");
        listaPalabros.put("musica", "music");
        listaPalabros.put("arte", "art");
        listaPalabros.put("pelicula", "movie");
        listaPalabros.put("serie", "series");
        listaPalabros.put("cancion", "song");
        listaPalabros.put("idioma", "language");
        listaPalabros.put("palabra", "word");
        listaPalabros.put("frase", "sentence");
        listaPalabros.put("pregunta", "question");
        listaPalabros.put("respuesta", "answer");
        listaPalabros.put("problema", "problem");
        listaPalabros.put("solucion", "solution");
        listaPalabros.put("idea", "idea");
        listaPalabros.put("plan", "plan");
        listaPalabros.put("viaje", "trip");
        listaPalabros.put("avion", "plane");
        listaPalabros.put("tren", "train");
        listaPalabros.put("barco", "ship");
        listaPalabros.put("bicicleta", "bicycle");

    }
}
