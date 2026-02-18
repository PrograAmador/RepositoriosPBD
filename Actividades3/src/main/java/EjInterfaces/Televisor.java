package EjInterfaces;

public class Televisor extends Dispositivo implements ControlRemoto {

    public Televisor(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        if (!super.estado) {
            System.out.println("Encendiendo televisor...");
            estado = true;
        } else {
            System.out.println("El televisor ya está encendido.");
        }
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando televisor con control remoto...");
    }
}
