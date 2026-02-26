/**
 * Clase Acompañante que representa a un acompañante de un jugador del Mutxamel FC. Hereda de MutxamelFC e implementa la interfaz AccionesDeportivas.
 */

public class Acompañante extends MutxamelFC{

    private Jugador integrante;
    private String parentesco;

    /**
     * Constructor de la clase Acompañante.
     * @param nombre
     * @param edad
     * @param integrante
     * @param parentesco
     */
    public Acompañante(String nombre, int edad, Jugador integrante, String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    private void animarEquipo() {
    }

    public Jugador getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public void concentrarse() {
        System.out.println("El acompañante " + super.getNombre() + " se está concentrando para apoyar a su equipo...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El acompañante " + super.getNombre() + " está viajando a " + ciudad );
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOL!!!!!!!!!!GOLGOLGOLGOLGOLGOLGOLGOL! " + super.getNombre() + " celebra el gol de su equipo");
    }

    @Override
    public String toString() {
        return "[" +
                "nombre='" + super.getNombre() + '\'' +
                ", edad=" + super.getEdad() +
                ", integrante=" + integrante.getNombre() +
                ", parentesco='" + parentesco + '\'' +
                ']';
    }
}

