import java.util.ArrayList;

/**
 * Clase principal para ejecutar la aplicación del equipo de fútbol Mutxamel FC.
 * En esta clase se crean los integrantes del equipo, se realizan las acciones correspondientes y se muestra el funcionamiento de la aplicación.
 */
public class AppMutxamelFC {

    public static void main(String[] args) {
        ArrayList<MutxamelFC> integrantesEquipo = new ArrayList<>();

        Jugador jugador1 = new Jugador("Juan", 25, Equipos.SENIOR, 12, Posiciones.DELANTERO);
        Jugador jugador2 = new Jugador("Pedro", 20, Equipos.SENIOR, 8, Posiciones.CENTROCAMPISTA);
        Jugador jugador3 = new Jugador("Luis", 18, Equipos.SENIOR, 5, Posiciones.DEFENSA);
        Jugador jugador4 = new Jugador("Carlos", 22, Equipos.SENIOR, 1, Posiciones.PORTERO);
        Jugador jugador5 = new Jugador("Miguel", 19, Equipos.SENIOR, 10, Posiciones.DELANTERO);

        integrantesEquipo.add(jugador1);
        integrantesEquipo.add(jugador2);
        integrantesEquipo.add(jugador3);
        integrantesEquipo.add(jugador4);
        integrantesEquipo.add(jugador5);

        Entrenador entrenador = new Entrenador("Sergio", 45, Equipos.SENIOR, "4-3-3N");
        integrantesEquipo.add(entrenador);

        Masajista masajista1 = new Masajista("Ana", 35, "Fisioterapia Deportiva", 10);
        Masajista masajista2 = new Masajista("Laura", 30, "Fisioterapia Deportiva", 5);
        integrantesEquipo.add(masajista1);
        integrantesEquipo.add(masajista2);

        Acompañante acompañante1 = new Acompañante("María", 40, jugador1, "Madre");
        Acompañante acompañante2 = new Acompañante("José", 42, jugador2, "Padre");
        integrantesEquipo.add(acompañante1);
        integrantesEquipo.add(acompañante2);


        for (MutxamelFC integrante : integrantesEquipo) {
            integrante.concentrarse();

            if (integrante instanceof AccionesDeportivas a) {
                a.entrenar();
            }

            if (integrante instanceof Masajista m) {
                m.darMasaje(jugador1);
            }
        }
        for (MutxamelFC integrante : integrantesEquipo) {
            integrante.viajar("Madrid");

            if (integrante instanceof Entrenador e) {
                e.planificarEntrenamiento();
                e.entrenar();
            }

            if (integrante instanceof Jugador j) {
                j.entrenar();
                j.descansar();
                j.calentar();
            }
        }
        for (MutxamelFC integrante : integrantesEquipo) {

            if (integrante instanceof Jugador j) {
                j.marcarGol();
            }

            integrante.celebrarGol();


        }
        for(MutxamelFC integrante : integrantesEquipo) {
            if (integrante instanceof Masajista m) {
                m.darMasaje(jugador2);
                m.darMasaje(jugador3);
                m.darMasaje(jugador4);
                m.darMasaje(jugador5);
            }
        }
        for(MutxamelFC integrante : integrantesEquipo) {
            integrante.viajar("Mutxamel");
            if(integrante instanceof Jugador) {
                ((Jugador) integrante).descansar();
            }
        }


    }
}
