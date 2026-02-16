package Herencias.RedesSociales;

import java.util.ArrayList;

public class Influencer extends Usuario{

    private ArrayList<String> colaboraciones;

    public Influencer(String nombre, int edad, String nombreUsuario, int seguidores) {
        super(nombre, edad, nombreUsuario, seguidores);
        this.colaboraciones = new ArrayList<>();
    }

    public ArrayList<String> getColaboraciones() {
        return colaboraciones;
    }

    public void agregarColaboracion(String colaboracion) {
        this.colaboraciones.add(colaboracion);
    }

    public void eliminarColaboracion(String colaboracion) {
        this.colaboraciones.remove(colaboracion);
    }


    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Colaboraciones: " + colaboraciones);
    }
}
