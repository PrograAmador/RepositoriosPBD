package EjStatics;

public class EstudianteAPP {
    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("jorge", "DAM", "apm209@alu.gva.es");
        System.out.println(estudiante1.getNIA());
        System.out.println(estudiante1);

        Estudiante estudiante2 = new Estudiante("Paco");

    }
}
