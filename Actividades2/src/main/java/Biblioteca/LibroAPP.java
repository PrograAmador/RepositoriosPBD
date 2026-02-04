package Biblioteca;

public class LibroAPP {

    public static void main(String[] args) {
        Editorial millenium = new Editorial("Millenium", "Argentina");
        Libro CienAnos = new Libro("Cien Años de Soledad", "Gabriel García Márquez", millenium);
        Estudiante Paco = new Estudiante("Paco", "DAM","apm209@alu.gva.es", CienAnos);

        Prestamo p1 = CienAnos.prestar(Paco);

        System.out.println("Fecha de préstamo: " + p1.getFecha());


    }
}
