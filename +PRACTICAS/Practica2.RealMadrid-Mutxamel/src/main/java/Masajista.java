/**
 * Clase Masajista que representa a un masajista del equipo de fútbol Mutxamel FC. Hereda de MutxamelFC e implementa la interfaz AccionesDeportivas.
 */

public class Masajista extends MutxamelFC{

    private String titulacion;
    private int anosExperiencia;

    /**
     * Constructor de la clase Masajista.
     * @param nombre
     * @param edad
     * @param titulacion
     * @param anosExperiencia
     */
    public Masajista(String nombre, int edad, String titulacion, int anosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    /**
     * Metodo para dar un masaje a un jugador.
     * @param jugador
     */
    public void darMasaje(Jugador jugador) {
        System.out.println("El masajista " + super.getNombre() + " da un masaje a " + jugador.getNombre());
    }

    public String getTitulacion() {
        return titulacion;
    }
    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }
    public int getAnosExperiencia() {
        return anosExperiencia;
    }
    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }


    @Override
    public void concentrarse() {
        System.out.println("El masajista " + super.getNombre() + " se está concentrando para el masaje...");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El masajista " + super.getNombre() + " está viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOL!!!!!!!!!!GOLGOLGOL! El masajista " + super.getNombre() + " celebra el gol del equipo");
    }
}
