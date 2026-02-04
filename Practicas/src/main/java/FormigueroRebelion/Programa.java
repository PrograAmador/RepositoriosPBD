package FormigueroRebelion;

import java.time.LocalDate;
import java.util.ArrayList;

public class Programa {

    private String nombre;
    private int temporadas = 0;
    private Cadena cadena;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Invitado> listaInvitados;
    private Empleado director;

    public Programa(String nombre, Cadena cadena, Empleado director) {
        this.nombre = nombre;
        this.cadena = cadena;
        this.listaEmpleados = new ArrayList<>();
        this.listaInvitados = new ArrayList<>();
        this.director = director;
    }
    public void invitadosTemporada(int temporada) {
        int contador = 0;
        for(Invitado c : listaInvitados) {
            if(c.getTemporada() == temporada) {
                contador++;
                System.out.println(c.getNombre() + " - " + c.getProfesion());
            }
        }
        System.out.println("Total de invitados en la temporada " + temporada + ": " + contador);
    }
    public int vecesInvitado(String nombre) {
        int contador = 0;
        for(Invitado c : listaInvitados) {
            if(c.getNombre().equals(nombre)) {
                contador++;
            }
        }
        return contador;
    }
    public void rastrearInvitado(String nombre) {

        for(Invitado c : listaInvitados) {
            if(c.getNombre().equals(nombre)) {
                System.out.println("Veces invitado: " + vecesInvitado(nombre)+" \n - Fecha de visita: " + c.getFecha_visita() + "\n - Temporada: " + c.getTemporada());
            }
        }
    }
    public boolean buscarInvitado(String nombre) {
        for(Invitado c : listaInvitados) {
            if(c.getNombre().equals(nombre)) {
                return true;
            }
        }
        return false;
    }
    public void invitadoAntes(String nombre){ // buscar en que programa fue invitado primero

        if(buscarInvitado(nombre)){
            LocalDate fechaMasAntigua = null;
            for(Invitado c : listaInvitados) {
                if(c.getNombre().equals(nombre)) {
                    if(fechaMasAntigua == null || c.getFecha_visita().isBefore(fechaMasAntigua)) {
                        fechaMasAntigua = c.getFecha_visita();
                    }
                }
            }
            System.out.println("El invitado " + nombre + " fue invitado primero el: " + fechaMasAntigua+ " al programa " + getNombre());
        }
    }


    public void insertarEmpleado(Empleado empleado) {
        this.listaEmpleados.add(empleado);
    }
    public void insertarInvitado(Invitado invitado) {
        this.listaInvitados.add(invitado);
    }
    public void eliminarEmpleado(Empleado empleado) {
        this.listaEmpleados.remove(empleado);
    }
    public void eliminarInvitado(Invitado invitado) {
        this.listaInvitados.remove(invitado);
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getTemporadas() {
        return temporadas;
    }
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    public Cadena getCadena() {
        return cadena;
    }
    public void setCadena(Cadena cadena) {
        this.cadena = cadena;
    }
    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }
    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }
    public ArrayList<Invitado> getListaInvitados() {
        return listaInvitados;
    }
    public void setListaInvitados(ArrayList<Invitado> listaInvitados) {
        this.listaInvitados = listaInvitados;
    }
    public Empleado getDirector() {
        return director;
    }
    public void setDirector(Empleado director) {
        this.director = director;
    }

    @Override
    public String toString() {
        return "Programa [nombre=" + nombre + ", temporadas=" + temporadas + ", cadena=" + cadena.getNombre()
                + ", listaEmpleados=" + listaEmpleados + ", listaInvitados=" + listaInvitados + ", director="
                + director + "]";
    }

}
