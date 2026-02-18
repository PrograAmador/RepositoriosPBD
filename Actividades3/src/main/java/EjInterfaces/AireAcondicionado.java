package EjInterfaces;

public class AireAcondicionado extends Dispositivo implements ControlRemoto {

    public AireAcondicionado(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        if (!super.estado) {
            System.out.println("Encendiendo aire acondicionado...");
            estado = true;
        } else {
            System.out.println("El aire acondicionado ya está encendido.");
        }
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando aire acondicionado con control remoto...");
    }
}
