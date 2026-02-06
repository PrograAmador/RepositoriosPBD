package FormigueroRebelion;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaProgramas;


    public Cadena(String nombre) {
        this.nombre = nombre;
        this.listaProgramas = null;
    }

    public void agregarPrograma(Programa programa) {
        if (programa != null && !listaProgramas.contains(programa)) {
            listaProgramas.add(programa);
        } else {
            System.out.println("Programa inválido o ya existente en la cadena.");
        }
    }
    public void eliminarPrograma(Programa programa) {
        if (listaProgramas.remove(programa)) {
            System.out.println(programa.getNombre() + " ha sido eliminado de la cadena " + nombre);
        } else {
            System.out.println("Programa no encontrado en la cadena.");
        }
    }


    @Override
    public String toString() {
        return "Cadena [nombre=" + nombre + ", listaProgramas=" + listaProgramas + "]";
    }
}
