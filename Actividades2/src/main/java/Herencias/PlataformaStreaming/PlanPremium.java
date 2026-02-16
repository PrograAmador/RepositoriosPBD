package Herencias.PlataformaStreaming;

public class PlanPremium extends Subscripcion{
    public PlanPremium(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso a todo el contenido en alta definición y descargas offline");
    }

    @Override
    public void obtenerPeriodoPrueba() {
System.out.println("Periodo de prueba: 14 dias de prueba gratuita");
    }
}
