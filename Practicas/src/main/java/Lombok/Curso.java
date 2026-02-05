package Lombok;

import lombok.*;

import java.util.Objects;


@Getter
@Setter
@AllArgsConstructor
@ToString
public class Curso {

    private final String nombre;
    private int horas;

        public Curso(String nombre) {
            this.nombre = Objects.requireNonNull(nombre,"");
        }
}
