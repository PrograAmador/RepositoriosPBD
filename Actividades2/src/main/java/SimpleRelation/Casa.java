package SimpleRelation;

import java.util.ArrayList;
import java.util.Scanner;

public class Casa {
    static Scanner sc = new Scanner(System.in);


    private String direccion;
    private ArrayList<Habitacion> listaHabitaciones;
    private Propietario propietario;

    public Casa(String direccion) {
        this.direccion = direccion;
        this.listaHabitaciones = new ArrayList<>();

    }

    public void crearHabitacion( String nombre, double metros) {

        for(Habitacion habitacion : listaHabitaciones){
            if(habitacion.getNombre().equalsIgnoreCase(nombre)){
                System.out.println("La habitacion " + nombre + " ya existe en la casa.");
                return;
            }
        }
        Habitacion habitacion = new Habitacion(nombre, metros);
        listaHabitaciones.add(habitacion);
        System.out.println("Habitacion " + nombre + " creada con exito.");
    }

    public void eliminarHabitacion(String nombre){

        for(Habitacion habitacion : listaHabitaciones){
            if(habitacion.getNombre().equalsIgnoreCase(nombre)){
                listaHabitaciones.remove(habitacion);
                System.out.println("Habitacion " + nombre + " eliminada con exito.");
                return;
            }
        }
        System.out.println("La habitacion " + nombre + " no existe en la casa.");
    }

    public void mostrarHabitaciones() {
        System.out.println("Habitaciones en la casa ubicada en " + direccion + ":" ); ;
        for(Habitacion habitacion : listaHabitaciones) {
            System.out.println("-" + habitacion.getNombre() + " (" + habitacion.getMetros() + " m2)");
        }
    }
    public Habitacion getHabitacionMasGrande(){

        Habitacion mayor = listaHabitaciones.get(0);

        for(Habitacion habitacion : listaHabitaciones){
            if(habitacion.getMetros() > mayor.getMetros()){
                mayor = habitacion;
                return mayor;
            }
        }
        return mayor;
    }


    public void setPropietario() {
        System.out.print("Ingrese el nombre del propietario: ");
        String nombre = sc.next();
        System.out.print("Ingrese la edad del propietario: ");
        int edad = sc.nextInt();
        sc.nextLine();
        this.propietario = new Propietario(nombre, edad);
        System.out.println("Propietario " + nombre + " asignado a la casa.");
    }


    public Propietario getPropietario() {
        return propietario;
    }

    public ArrayList<Habitacion> getListaHabitaciones() {
        return listaHabitaciones;
    }

    public void setListaHabitaciones(ArrayList<Habitacion> listaHabitaciones) {
        this.listaHabitaciones = listaHabitaciones;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Casa{" +
                "direccion='" + direccion + '\'' +
                '}';
    }
}
