package Herencias.PlataformaStreaming;

public class PlanBasico extends Subscripcion{
    public PlanBasico(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso a todo el contenido en calidad estándar sin anuncios.");
    }

    @Override
    public void obtenerPeriodoPrueba() {
System.out.println("Periodo de prueba: 30 dias de periodo de prueba.");
    }
}
