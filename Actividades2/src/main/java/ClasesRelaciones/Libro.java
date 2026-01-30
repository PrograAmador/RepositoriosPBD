package ClasesRelaciones;

public class Libro {

    private static int cantidadLibros = 0;
    private static int librosDisponibles = 0;
    private static final String PREFIJO_ID = "LIB";

    private String titulo;
    private String autor;
    private String id;
    private boolean disponible;
    private Estudiante estudiantePrestado;
    private Editorial editorial;


    public Libro(String titulo, String autor, Editorial editorial) {
        this.titulo = titulo;
        this.autor = autor;
        disponible = true;
        cantidadLibros++;
        librosDisponibles++;
        id = calcularId();
        estudiantePrestado = null;
        this.editorial = editorial;
        editorial.anyadirLibro(this);
    }
    private String calcularId() {
        return PREFIJO_ID + cantidadLibros ;
    }
    public Prestamo prestar(Estudiante estudiante) {
        Prestamo prestamo = null;
        if (disponible ) {

            disponible = false;
            librosDisponibles--;
            estudiantePrestado = estudiante;
            estudiante.anyadirLibro(this);
            prestamo = new Prestamo(this, estudiante);
            System.out.println("El libro ha sido prestado con éxito.");
            return prestamo;
        } else if(estudiantePrestado != null) {
            System.out.println( "El libro " + titulo + " ya está prestado a " + estudiantePrestado.getNombre() + ".");
        }else{
            System.out.println( titulo + " no está disponible para préstamo.");
        }
        return prestamo;
    }
    public String devolver() {
        if (!disponible) {
            disponible = true;
            librosDisponibles++;
            estudiantePrestado.borrarLibro(this);
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

    public Estudiante getEstudiantePrestado() {
        return estudiantePrestado;
    }
    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }

    public void setEstudiantePrestado(Estudiante estudiantePrestado) {
        this.estudiantePrestado = estudiantePrestado;
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
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", id='" + id + '\'' +
                ", disponible=" + disponible +
                ", estdudiante= " + estudiantePrestado+
                ", editorial= " + editorial +
                '}';
    }
}
