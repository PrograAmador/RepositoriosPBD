package ArrayLists;

public class AbueloApp {
    public static void main(String[] args) {

        Abuelo abuelo1 = new Abuelo("Juan", 70);
        Abuelo abuelo2 = new Abuelo("Pedro", 75);
        Abuelo abuelo3 = new Abuelo("Luis", 80);

        AutobusImserso autobus = new AutobusImserso("1234ABC", "Madrid");

        autobus.insertarAbuelo(abuelo1);
        autobus.insertarAbuelo(abuelo2);
        autobus.insertarAbuelo(abuelo3);

        autobus.borrarAbuelo(abuelo2);

        System.out.println("Lista de pasajeros:");
        autobus.mostrarPasajeros();

        System.out.println("\nAbuelos mayores de 80 años:");
        autobus.mostarMayores(80);
    }
}
