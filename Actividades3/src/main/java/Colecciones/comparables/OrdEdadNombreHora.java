package Colecciones.comparables;

import java.util.Comparator;

public class OrdEdadNombreHora implements Comparator<Invitado> {


    @Override
    public int compare(Invitado inv1, Invitado inv2) {

        int comparar = inv1.getEdad().compareTo(inv2.getEdad());

        if(comparar !=0){
            return comparar;
        }



        return inv1.getNombre().compareTo(inv2.getNombre());

    }
}
