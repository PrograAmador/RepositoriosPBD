package SimpleRelation;

public class AppCasa {
    public static void main(String[] args) {


        Casa micasa = new Casa("Calle Falsa 123");

        micasa.crearHabitacion("Dormitorio", 12.5);
        micasa.crearHabitacion("Cocina", 8.0);
        micasa.crearHabitacion("Salon", 20.0);

        micasa.mostrarHabitaciones();
        System.out.println("La habitacion mas grande es: " + micasa.getHabitacionMasGrande().getNombre());


    }
}