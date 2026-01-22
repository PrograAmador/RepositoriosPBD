package EjStatics;

public class LibroAPP {

    public static void main(String[] args) {

        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez");

        System.out.println(libro1);
        libro1.prestar();
        System.out.println(libro1.estaDisponible());
        libro1.devolver();
        System.out.println(libro1.estaDisponible());


    }
}
