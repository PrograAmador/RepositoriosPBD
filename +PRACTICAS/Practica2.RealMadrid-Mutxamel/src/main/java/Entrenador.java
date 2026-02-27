/**
 * Clase Entrenador que representa a un entrenador de fútbol. Hereda de MutxamelFC e implementa la interfaz AccionesDeportivas.
 *
 */
public class Entrenador extends MutxamelFC implements AccionesDeportivas{

    private Equipos equipo;
    private String formacionPreferida = "4-4-2";

    /**
     * Constructor de la clase Entrenador.
     * @param nombre
     * @param edad
     * @param equipo
     */
    public Entrenador(String nombre, int edad, Equipos equipo, String formacionPreferida) {
        super(nombre, edad);
        this.equipo = equipo;
        setFormacionPreferida(formacionPreferida);
    }

    /**
     * Metodo para planificar el entrenamiento del equipo.
     */
    public void planificarEntrenamiento() {
        System.out.println("El entrenador " + super.getNombre() + " está dirigiendo el entrenamiento del equipo " + equipo);
    }
    /**
     * Metodo para hacer cambios en la estrategia del equipo.
     */
    public void hacerCambios() {
            System.out.println("El entrenador " + super.getNombre() + " está planificando la estrategia para el próximo partido.");
    }

    public Equipos getEquipo() {
            return equipo;
    }

    public void setEquipo(Equipos equipo) {
            this.equipo = equipo;
    }

    public String getFormacionPreferida() {
                return formacionPreferida;
    }

    public void setFormacionPreferida(String formacionPreferida) {
        if(formacionPreferida.matches("\\d-\\d-\\d")) {
                this.formacionPreferida = formacionPreferida;
        } else {
            throw new FormatoFormacionIncorrecto();
        }
    }

    @Override
    public void entrenar() {
        System.out.println("El entrenador " + super.getNombre() + " está entrenando al equipo " + equipo);
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El equipo " + equipo+ " va a jugar contra " + rival );
    }

    @Override
    public void concentrarse() {
        System.out.println("El entrenador " + super.getNombre() + " se está concentrando para el partido.....");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El entrenador " + super.getNombre() + " está viajando a " + ciudad );
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOL!!!!!!!!!!GOLGOLGOL! El entrenador " + super.getNombre() + " celebra el gol de su equipo " + equipo);
    }
}
