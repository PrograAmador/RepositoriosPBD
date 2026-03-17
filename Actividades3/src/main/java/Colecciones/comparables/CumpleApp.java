package Colecciones.comparables;

import java.util.*;

public class CumpleApp {
    public static void main(String[] args) {

        List<Invitado> invitados = new ArrayList<>();

        invitados.add(new Invitado(15,"Jacobo"));
        invitados.add(new Invitado(18,"Angel"));
        invitados.add(new Invitado(19,"Pedro"));
        invitados.add(new Invitado(15,"Loco"));

        Collections.sort(invitados, new OrdEdadNombreHora());

        System.out.println(invitados);


        TreeSet<Invitado, String > mapa = new TreeMap<>()
    }
}
