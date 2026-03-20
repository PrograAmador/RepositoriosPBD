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


        TreeMap<Invitado, String > mapaInvitados = new TreeMap<>();

        mapaInvitados.put(new Invitado(15,"Jacobo"),"Raqueta");
        mapaInvitados.put(new Invitado(17,"Angel"),"Dinero");
        mapaInvitados.put(new Invitado(18,"Pedro"),"Sexo");

        List<Map.Entry<Invitado,String>> listaMapa = new ArrayList<>(mapaInvitados.entrySet());

        listaMapa.sort(Map.Entry.comparingByValue());

        for(Map.Entry<Invitado,String> mapita : listaMapa){
            System.out.println(mapita.getKey().getNombre() + " " +mapita.getValue());
        }
    }
}
