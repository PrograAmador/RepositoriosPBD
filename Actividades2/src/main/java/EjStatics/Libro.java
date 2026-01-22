package EjStatics;

public class Libro {

    private static int cantidadLibros = 0;
    private static int librosDisponibles = 0;
    private static final String PREFIJO_ID = "LIB";

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;


    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        disponible = true;
        cantidadLibros++;
        librosDisponibles++;
        id = calcularId();
    }
    private String calcularId() {
        return PREFIJO_ID + cantidadLibros ;
    }
    public String prestar() {
        if (disponible) {
            disponible = false;
            librosDisponibles--;
            return "El libro ha sido prestado con éxito.";
        } else {
            return "El libro " + titulo + " no está disponible para préstamo.";
        }
    }
    public String devolver() {
        if (!disponible) {
            disponible = true;
            librosDisponibles++;
            return "El libro ha sido devuelto con éxito.";
        } else {
            return "El libro " + titulo + " ya estaba disponible.";
        }
    }
    public boolean estaDisponible() {
        return disponible;
    }
    public static int getTotalLibros() {
        return cantidadLibros;
    }
    public static int getLibrosDisponibles() {
        return librosDisponibles;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    @Override
    public String toString() {
        return " Total de libros creados: " + cantidadLibros + "\n Libros disponibles: " + librosDisponibles
                + "\n " + prestar() + "\n Libros disponibles despues del prestamo:" + librosDisponibles  + "\n "+ devolver() + "\n Libros disponibles después de la devolución: " +librosDisponibles;
    }
}
