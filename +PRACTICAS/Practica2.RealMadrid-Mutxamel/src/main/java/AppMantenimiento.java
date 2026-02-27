import java.util.ArrayList;
import java.util.Scanner;

/**
 * App de mantenimiento del MUTXAMEL FC. En esta aplicación se podrá añadir jugadores, modificar sus datos y crear acompañantes (solo para jugadores senior).
 *
 */
public class AppMantenimiento {

    static Scanner sc = new Scanner(System.in);
    static ArrayList<Jugador> jugadores = new ArrayList<>(10);
    static ArrayList<Acompañante> acompañantes = new ArrayList<>(5);
    /**
     * Metodo principal de la aplicación. Aquí se muestra el menú principal para realizar las diferentes acciones de mantenimiento.
     * @param args
     */
    public static void main(String[] args) {


        jugadores.add(new Jugador("Juan", 25, Equipos.SENIOR, 12, Posiciones.DELANTERO));
        jugadores.add(new Jugador("Pedro", 14, Equipos.JUVENIL, 8, Posiciones.CENTROCAMPISTA));
        jugadores.add(new Jugador("Luis", 12, Equipos.CADETE, 5, Posiciones.DEFENSA));

        String opcion;

        do {
            menu();
            opcion = pedirOpcion();
            if (opcion.equals("1")) {
                mantenimientoJugadores();
                switch (pedirOpcion()) {
                    case "1":
                        Jugador nuevoJugador = anyadirJugador();
                        jugadores.add(nuevoJugador);
                        System.out.println("Estos son los jugadores: --> " );
                        jugadores.forEach(System.out::println); //Queria imprimir las listas para que se viesen los cambios realizados, pero no se veian bien, asi que al final le pregunte al chatgpt y me ha dicho esta opcion que esta bastente chula pa imprimir los Arraylist
                        break;
                    case "2":
                        System.out.println("===Mantenimiento de jugadores. Modificar datos de jugador existente ===");
                        System.out.println("¿De que jugador quieres hacer cambios?");
                        for (int i = 0; i < jugadores.size(); i++) {
                            System.out.println("[" + i + ", " + jugadores.get(i) + "]. ");
                        }
                        modificarJugador(Integer.parseInt(pedirOpcion()));
                        System.out.println("Estos son los jugadores modificados: --> ");
                        jugadores.forEach(System.out::println);
                        break;
                    case "3":
                        Acompañante nuevoAcompañante = crearAcompanyante(jugadores);
                        acompañantes.add(nuevoAcompañante);
                        System.out.println("Estos son los acompañantes: --> ");
                        jugadores.forEach(System.out::println);
                        break;
                    case "X":
                        menu();
                        break;
                    default:
                        System.out.println("Opción no válida. Volviendo al menú principal.");
                        menu();
                }
            } else {
                System.out.println("Funcion no disponible por el momento.");
            }
        } while (!opcion.equalsIgnoreCase("X"));

        System.out.println("Gracias por usar la aplicación de mantenimiento del MUTXAMEL FC. ¡Hasta pronto!");

    }

    /**
     * Metodo para mostrar el menú principal de la aplicación, donde se pueden elegir las diferentes opciones de mantenimiento para jugadores, entrenadores y masajistas, así como consultar los equipos del club o salir de la aplicación.
     *
     */
    public static void menu() {
        System.out.println("                                         ");
        System.out.println("===App de Mantenimiento del MUTXAMEL FC===");

        System.out.println("[1]. Mantenimiento de jugadores");
        System.out.println("            Dentro podremos añadir jugadores, modicar datos y añadir acompañantes (solo seniors)");
        System.out.println("[2]. Mantenimiento de entrenadores (añadir-modificar-salir)");
        System.out.println("            Dentro podremos añadir entrenadores y modifcar sus datos");
        System.out.println("[3]. Mantenimiento masajistas (añadir-modificar datos-salir)");
        System.out.println("            Dentro podremos añadir masajists y modifcar sus datos");
        System.out.println("[4]. Consultar equipos");
        System.out.println("            Dentro podremos consultar los equipos del club y elegir uno");
        System.out.println("[X]. Salir");
        System.out.println();

    }

    /**
     * Metodo para pedir al usuario que introduzca una opción del menú.
     * @return La opción introducida por el usuario.
     */
    public static String pedirOpcion() {
        System.out.println("===========================================");
        System.out.println();
        System.out.println("Introduce una opción ---> ");
        return sc.nextLine();
    }

    /**
     * Metodo para mostrar el menú de mantenimiento de jugadores, donde se pueden elegir las diferentes opciones para añadir un nuevo jugador, modificar los datos de un jugador existente o crear acompañantes.
     */
    public static void mantenimientoJugadores() {
        System.out.println("===Mantenimiento de jugadores===");
        System.out.println("[1]. Añadir nuevo jugador");
        System.out.println("[2]. Modificar datos de un jugador existente");
        System.out.println("[3]. Crear acompañantes (sólo seniors)");
        System.out.println("[X]. Volver al menú principal");
    }

    /**
     * Metodo para añadir un nuevo jugador al equipo. Se pide al usuario que introduzca los datos del jugador, como su nombre, edad, categoría, dorsal y posición, y se crea un nuevo objeto Jugador con esos datos.
     * @return El nuevo jugador creado con los datos introducidos por el usuario.
     */
    public static Jugador anyadirJugador() {
        System.out.println("===Mantenimiento de jugadores. Añadir jugador ===");
        System.out.println("Introduce a continuacion los datos del jugador: ");
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        System.out.println("Categoría (INFANTIL, CADETE, JUVENIL, SENIOR): ");
        String categoriaStr = sc.nextLine();
        Equipos categoria = Equipos.valueOf(categoriaStr.toUpperCase());
        System.out.println("Dorsal: ");
        int dorsal = sc.nextInt();
        sc.nextLine(); // Limpiar el buffer
        comprobadorDorsales(dorsal, categoriaStr);
        System.out.println("Posición (PORTERO, DEFENSOR, CENTROCAMPISTA, DELANTERO): ");
        String posicionStr = sc.nextLine();
        Posiciones posicion = Posiciones.valueOf(posicionStr.toUpperCase());
        Jugador nuevoJugador = new Jugador(nombre, edad, categoria, dorsal, posicion);
        System.out.println("Jugador añadido con éxito!." + nuevoJugador);
        return nuevoJugador;
    }

    /**
     * Metodo para modificar los datos de un jugador existente. Se muestra una lista de los jugadores disponibles y se pide al usuario que elija uno para modificar. Luego se pregunta qué dato quiere modificar (nombre, edad, categoría, dorsal o posición) y se actualiza el jugador con el nuevo dato introducido por el usuario.
     * @param opcion La opción elegida por el usuario para modificar un jugador específico.
     */
    public static void modificarJugador(int opcion) {
        if (opcion < 0 || opcion >= jugadores.size()) {
            System.out.println("Opcion no válida.");
            return;
        }
        System.out.println("===Mantenimiento de jugadores. Modificar datos de jugador existente ===");
        System.out.println("Modificando jugador: " + jugadores.get(opcion));
        System.out.println("¿Que quieres modificar? [nombre, edad, categoria, dorsal, posicion]");

        Jugador j = jugadores.get(opcion);

            switch (pedirOpcion().toLowerCase()) {
                case "nombre":
                    System.out.println("Nuevo nombre: ");
                    j.setNombre(sc.nextLine());
                    break;
                case "edad":
                    System.out.println("Nueva edad --->  ");
                    j.setEdad(sc.nextInt());
                    sc.nextLine(); // Limpiar el buffer
                    break;
                case "categoria":
                    System.out.println("Nueva categoría (INFANTIL, CADETE, JUVENIL, SENIOR) --->  ");
                    String categoriaStr = sc.nextLine();
                    Equipos categoria = Equipos.valueOf(categoriaStr.toUpperCase());
                    j.setCategoria(categoria);
                    break;
                case "dorsal":
                    System.out.println("Nuevo dorsal --->  ");
                    int dorsal = sc.nextInt();
                    sc.nextLine(); // Limpiar el buffer
                    comprobadorDorsales(dorsal, j.getCategoria().toString());
                    j.setDorsal(dorsal);
                    sc.nextLine(); // Limpiar el buffer
                    break;
                case "posicion":
                    System.out.println("Nueva posición (PORTERO, DEFENSOR, CENTROCAMPISTA, DELANTERO) --->  ");
                    String posicionStr = sc.nextLine();
                    Posiciones posicion = Posiciones.valueOf(posicionStr.toUpperCase());
                    j.setPosicion(posicion);
                    break;
                default:
                    System.out.println("Opción no válida. No se han realizado cambios.");
                    break;
                }
        System.out.println("Jugador modificado con éxito! -->" + j);


    }

    /**
     * Metodo para crear un nuevo acompañante para un jugador senior. Se pide al usuario que introduzca los datos del acompañante, como su nombre, edad, el jugador al que acompaña y el parentesco con ese jugador. Luego se crea un nuevo objeto Acompañante con esos datos y se devuelve.
     * @param jugadores La lista de jugadores disponibles para elegir al jugador al que se va a acompañar.
     * @return El nuevo acompañante creado con los datos introducidos por el usuario, o null si no se ha encontrado un jugador senior con el nombre introducido.
     */
    public static Acompañante crearAcompanyante(ArrayList<Jugador> jugadores) {
        System.out.println("===Mantenimiento de jugadores. Crear acompañantes (sólo seniors) ===");
        System.out.println("Introduce a continuacion los datos del acompañante: ");
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Jugador al que acompaña: ");
        String jugadorStr = sc.nextLine();
        Jugador jugador = null;
        for(Jugador j : jugadores) {
            if(j.getNombre().equalsIgnoreCase(jugadorStr) && j.getCategoria() == Equipos.SENIOR) {
                jugador = j;
                break;
            }
        }
        if(jugador == null) {
            System.out.println("No se ha encontrado un jugador senior con ese nombre. No se puede crear el acompañante.");
            return null;
        }
        System.out.println("Parentesco: ");
        String parentesco = sc.nextLine();

        Acompañante acompañante = new Acompañante(nombre, edad, jugador, parentesco);
        System.out.println("Acompañante creado con éxito! --> " + acompañante);
        return acompañante;
    }
    public static void comprobadorDorsales(int dorsal, String categoria) {
        for(Jugador jugador : jugadores) {
            if(jugador.getDorsal() == dorsal && jugador.getCategoria().toString().equalsIgnoreCase(categoria)) {
                throw new DorsalNoDisponible();
            }
        }
    }


}
