package Herencias.PlataformaStreaming;

public class PlanGratis extends Subscripcion{
    public PlanGratis(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso limitado con anuncios.");
    }

    @Override
    public void obtenerPeriodoPrueba() {
System.out.println("Periodo de prueba: Sin periodo de prueba");
    }
}
