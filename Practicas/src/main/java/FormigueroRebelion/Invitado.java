package FormigueroRebelion;

import java.time.LocalDate;
import java.util.Scanner;

public class Invitado {

    Scanner scanner = new Scanner(System.in);

    private String nombre;
    private String profesion;
    private LocalDate fecha_visita;
    private int temporada;

    public Invitado(String nombre, String profesion, int temporada) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.fecha_visita = setFecha_visita();
        this.temporada = temporada;
    }


    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getProfesion() {
        return profesion;
    }
    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    public LocalDate getFecha_visita() {
        return fecha_visita;
    }
    public LocalDate setFecha_visita() {
        System.out.println("Ingrese el dia de la visita:");
        int dia = scanner.nextInt();
        System.out.println("Ingrese el mes de la visita:");
        int mes = scanner.nextInt();
        System.out.println("Ingrese el año de la visita:");
        int anio = scanner.nextInt();
        scanner.nextLine(); // Limpiar el buffer

        return LocalDate.of(anio, mes, dia);

    }
    public int getTemporada() {
        return temporada;
    }
    public void setTemporada(int temporada) {
        this.temporada = temporada;
    }

    @Override
    public String toString() {
        return "Invitado [nombre=" + nombre + ", profesion=" + profesion + ", fecha_visita=" + fecha_visita
                + ", temporada=" + temporada + "]";
    }
}
