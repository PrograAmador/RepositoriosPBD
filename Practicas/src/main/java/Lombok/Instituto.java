package Lombok;

import lombok.*;

import java.util.ArrayList;
import java.util.Objects;


@Getter
@AllArgsConstructor
@ToString
public class Instituto {

    private final String nombre;
    @Setter
    private String poblacion;
    @NonNull
    @Setter
    private ArrayList<Estudiante> ListaEstudiantes = new ArrayList<>();
    @NonNull
    @Setter
    private ArrayList<Curso> ListaCursos = new ArrayList<>();


    public Instituto(String nombre) {
        this.nombre = Objects.requireNonNullElse(nombre, "Instituto sin nombre");

    }
    public void agregarCurso(Curso curso) {
        if(curso == null) {
            System.out.println("No se puede agregar un curso nulo.");
            return;
        }
        for(Curso c : ListaCursos) {
            if(c.getNombre().equalsIgnoreCase(curso.getNombre()) && c.getHoras() == curso.getHoras()) {
                System.out.println("El curso ya existe en el instituto");
                return;
            }
        }
        ListaCursos.add(curso);
    }
    public void eliminarCurso(Curso curso) {
        ListaCursos.remove(curso);
    }
    public void agregarEstudiante(Estudiante estudiante) {
        if(estudiante == null) {
            System.out.println("No se puede agregar un estudiante nulo.");
            return;
        }
        for(Estudiante e : ListaEstudiantes) {
            if(e.getNombre().equalsIgnoreCase(estudiante.getNombre()) && e.getEdad() == estudiante.getEdad() && e.getCurso().equals(estudiante.getCurso())) {
                System.out.println("El estudiante ya existe en el instituto");
            }
        }
        ListaEstudiantes.add(estudiante);
    }
    public void eliminarEstudiante(Estudiante estudiante) {
            ListaEstudiantes.remove(estudiante);
    }
}
