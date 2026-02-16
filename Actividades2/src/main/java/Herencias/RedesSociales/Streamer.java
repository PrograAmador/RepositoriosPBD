package Herencias.RedesSociales;

public class Streamer extends Usuario{

    private int numeroTransmisiones;
    private int horas_directo;

    public Streamer(String nombre, int edad, String nombreUsuario, int seguidores, int numeroTransmisiones, int horas_directo) {
        super(nombre, edad, nombreUsuario, seguidores);
        this.numeroTransmisiones = numeroTransmisiones;
        this.horas_directo = horas_directo;
    }

    public int getNumeroTransmisiones() {
        return numeroTransmisiones;
    }
    public void setNumeroTransmisiones(int numeroTransmisiones) {
        this.numeroTransmisiones = numeroTransmisiones;
    }

    public int getHoras_directo() {
        return horas_directo;
    }
    public void setHoras_directo(int horas_directo) {
        this.horas_directo = horas_directo;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de Transmisiones: " + numeroTransmisiones);
        System.out.println("Horas en Directo: " + horas_directo);
    }
}
