/**
 * Excepción personalizada que se lanza cuando un dorsal seleccionado no está disponible.
 */

public class DorsalNoDisponible extends RuntimeException {
    public DorsalNoDisponible() {
        super("El dorsal seleccionado no está disponible. Por favor, elige otro número.");
    }
}
