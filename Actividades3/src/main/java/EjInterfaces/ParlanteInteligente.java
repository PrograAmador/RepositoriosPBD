package EjInterfaces;

public class ParlanteInteligente extends Dispositivo  {

    public ParlanteInteligente(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        if (!super.estado) {
            System.out.println("Activando parlante con comando de voz...");
            estado = true;
        } else {
            System.out.println("El parlante ya está encendido.");
        }
    }

}
