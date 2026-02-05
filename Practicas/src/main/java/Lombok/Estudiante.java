package Lombok;


import lombok.*;

import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Estudiante {

    private final String nombre;
    private int edad;
    private Curso curso;

    public Estudiante(String nombre) {
        this.nombre = Objects.requireNonNull(nombre,"");
    }
}
