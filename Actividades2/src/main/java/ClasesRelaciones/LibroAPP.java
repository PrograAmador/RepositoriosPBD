package ClasesRelaciones;

public class LibroAPP {

    public static void main(String[] args) {
        Editorial millenium = new Editorial("Millenium", "Argentina");
        Libro libro1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", millenium);
        Estudiante Paco = new Estudiante("Paco", "DAM","apm209@alu.gva.es", libro1);
        System.out.println(libro1);
        System.out.println(millenium);
        System.out.println(Paco);


    }
}
