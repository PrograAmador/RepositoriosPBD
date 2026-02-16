package Herencias.PlataformaStreaming;

public abstract class Subscripcion {

    private String nombre;
    private double precio;

    public Subscripcion(String nombre, double precio){
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarInfo(){
        System.out.println("Plan: " + nombre + ", Precio: " + precio + "€");

    }

    public abstract void obtenerBeneficios();

    public abstract void obtenerPeriodoPrueba();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
