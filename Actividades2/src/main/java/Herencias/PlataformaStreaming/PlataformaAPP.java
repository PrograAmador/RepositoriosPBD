package Herencias.PlataformaStreaming;

import java.util.ArrayList;

public class PlataformaAPP {

    public static void main(String[] args) {

        ArrayList<Subscripcion> planes = new ArrayList<>();
        planes.add(new PlanGratis("Plan Gratis", 0.0));
        planes.add(new PlanBasico("Plan Básico", 9.99));
        planes.add(new PlanFamiliar("Plan Familiar", 14.99));
        planes.add(new PlanPremium("Plan Premium", 19.99));

        for(Subscripcion plan : planes){
            plan.mostrarInfo();
            plan.obtenerBeneficios();
            plan.obtenerPeriodoPrueba();
        }

    }
}
