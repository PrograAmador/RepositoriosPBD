/**
 * Clase Jugador que representa a un jugador de fútbol, con atributos como categoría, dorsal y posición. Hereda de MutxamelFC e implementa la interfaz AccionesDeportivas.
 */

public class Jugador extends MutxamelFC implements AccionesDeportivas{

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;

    /**
     * Constructor de la clase Jugador.
     * @param nombre
     * @param edad
     * @param categoria
     * @param dorsal
     * @param posicion
     */
    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posicion) {
        super(nombre, edad);
        this.categoria = categoria;
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    /**
     * Metodos para las acciones de un jugador, como calentar, descansar y marcar gol.
     */
    public void calentar(){
        System.out.println("El jugador " + getNombre() + " está calentando.");

    }

    public void descansar(){
        System.out.println("El jugador " + getNombre() + " está descansando.");
    }
    public void marcarGol(){
        System.out.println("El jugador " + getNombre() + " ha marcado un gol!");
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }


    @Override
    public void entrenar() {
        System.out.println("El jugador " + super.getNombre() + " está entrenando para el gran partido");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("El jugador " + super.getNombre() + " está jugando contra " + rival);
    }

    @Override
    public void concentrarse() {
        System.out.println("El jugador " + super.getNombre() + " se está concentrando para el partido.....");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("El jugador " + super.getNombre() + " está viajando a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOL!!!!!!!!!!GOLGOLGOL! El jugador " + super.getNombre() + " celebra su gol");
    }

    @Override
    public String toString() {
        return "[" + "Nombre='" + getNombre() +
                ", Edad=" + getEdad() +
                ", Categoria=" + categoria +
                ", Dorsal=" + dorsal +
                ", Posicion=" + posicion +
                ']';
    }
}
