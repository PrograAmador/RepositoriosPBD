package SimpleRelation;

import java.util.ArrayList;

public class Habitacion {



    private String nombre;
    private double metros;
    private ArrayList<Electrodomestico> listaElectrodomesticos;

    public Habitacion(String nombre, double metros) {
        this.nombre = nombre;
        this.metros = metros;
        this.listaElectrodomesticos = new ArrayList<>();
    }

    private void agregarElectrodomestico(Electrodomestico electrodomestico){
        listaElectrodomesticos.add(electrodomestico);
    }
    private void eliminarElectrodomestico(Electrodomestico electrodomestico){
        listaElectrodomesticos.remove(electrodomestico);
    }

    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public ArrayList<Electrodomestico> getListaElectrodomesticos() {
        return listaElectrodomesticos;
    }

    public void setListaElectrodomesticos(ArrayList<Electrodomestico> listaElectrodomesticos) {
        this.listaElectrodomesticos = listaElectrodomesticos;
    }

    @Override
    public String toString() {
        return "Habitacion{" +
                "nombre='" + nombre + '\'' +
                ", metros=" + metros +
                '}';
    }
}
