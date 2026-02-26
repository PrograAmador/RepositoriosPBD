public abstract class MutxamelFC implements FuncionesIntegrantes {

    private String nombre;
    private int edad;

    public MutxamelFC(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }

    @Override
    public void concentrarse() {
        System.out.println("El jugador " + getNombre() + " se está concentrando para el partido.....");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Viajando a " + ciudad + "...");
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOL!!!!!!!!!!GOLGOLGOL!");
    }
}
