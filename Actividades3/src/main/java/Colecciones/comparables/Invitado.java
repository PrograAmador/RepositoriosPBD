package Colecciones.comparables;


import lombok.*;

import java.time.LocalTime;

@Getter
@Setter
@NoArgsConstructor
public class Invitado implements Comparable<Invitado>{

    private LocalTime hora;
    private Integer edad;
    private String nombre;
    public Invitado(Integer edad,String nombre){

        this.nombre = nombre;
        this.edad = edad;
        this.hora = LocalTime.now();

    }

    @Override
    public int compareTo(Invitado o) {
        int comparar = nombre.compareTo(o.getNombre());

        if(comparar != 0){
            return comparar;
        }
        comparar = edad.compareTo(o.getEdad());

        if(comparar != 0){
            return comparar;
        }


        return hora.compareTo(o.getHora());
    }

    @Override
    public String toString() {
        return "Invitado{" +
                "hora=" + hora +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
