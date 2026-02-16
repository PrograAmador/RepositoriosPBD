package Herencias.PlataformaStreaming;

public class PlanFamiliar extends Subscripcion {

    public PlanFamiliar(String nombre, double precio) {
        super(nombre, precio);
    }

    @Override
    public void obtenerBeneficios() {
        System.out.println("Acceso para varios perfiles simultáneamente en alta definición.");
    }

    @Override
    public void obtenerPeriodoPrueba() {
System.out.println("Periodo de prueba: 7 dias de prueba para cuentas nuevas");
    }
}
