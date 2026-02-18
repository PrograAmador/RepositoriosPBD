package EjInterfaces;

public abstract class Dispositivo {

    protected String nombre;
    protected boolean estado;

    public Dispositivo(String nombre) {
        this.nombre = nombre;
        this.estado = false;
    }

    public abstract void encender();

    public boolean apagar(){
        if (estado) {
            estado = false;
            System.out.println("Apagando " + nombre + "...");
            return true;
        } else {
            System.out.println(nombre + " ya está apagado.");
            return false;
        }
    }
    public boolean mostrarEstado(){
        if (estado) {
            System.out.println("Encendido.");
            return true;
        } else {
            System.out.println("Apagado.");
            return false;
        }
    }
    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
