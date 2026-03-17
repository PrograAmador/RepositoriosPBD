package Colecciones.Iterators;

public class PistaYaReservada extends RuntimeException {
    public PistaYaReservada() {

        super("La hora no esta disponible!");
    }
}
