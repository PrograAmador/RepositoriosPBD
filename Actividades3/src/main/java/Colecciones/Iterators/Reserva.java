package Colecciones.Iterators;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Objects;


@Getter
@Setter

public class Reserva extends HashSet<Reserva> {

    private Usuario usuario;
    private Pistas pista;
    private LocalDateTime fecha_hora;

    public Reserva(Usuario usuario, Pistas pista){
        this.usuario = usuario;
        this.pista = pista;
        this.fecha_hora = LocalDateTime.now();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return Objects.equals(pista, reserva.pista) && Objects.equals(fecha_hora, reserva.fecha_hora);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pista, fecha_hora);
    }
}

