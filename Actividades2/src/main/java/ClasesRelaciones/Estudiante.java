package ClasesRelaciones;

import java.util.ArrayList;

public class Estudiante {

    private static int contadorEstudiantes = 0;
    private static String CORREO_FORMAT= "^[A-Za-z0-9+_.-]+@alu.edu.gva.es$";

    private String nombre;
    private String curso;
    private int NIA;
    private String email;
    private Libro libro;
    private ArrayList<Libro> listaLibrosPrestados;

    public Estudiante(String nombre, String curso, String email, Libro libro) {
        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        NIA = contadorEstudiantes + 1;
        this.libro = libro;
        listaLibrosPrestados = new ArrayList<>();
    }
    public Estudiante(String nombre){
        this.nombre = nombre;
    }
    public void anyadirLibro(Libro libro){
        listaLibrosPrestados.add(libro);
    }
    public void borrarLibro(Libro libro){
        listaLibrosPrestados.remove(libro);
    }

    private static int obtenerTotalEstudiantes(){
        return contadorEstudiantes;
    }
    private static boolean validarCorreo(String email){
        if (email.matches(CORREO_FORMAT)){
            return true;
        }else{
            return false;
        }
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public int getNIA() {
        return NIA;
    }
    public void setNIA(int NIA) {
        this.NIA = NIA;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public ArrayList<Libro> getListaLibrosPrestados() {
        return listaLibrosPrestados;
    }

    public void setListaLibrosPrestados(ArrayList<Libro> listaLibrosPrestados) {
        this.listaLibrosPrestados = listaLibrosPrestados;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", curso='" + curso + '\'' +
                ", NIA=" + NIA +
                ", email='" + email + '\'' +
                ", libro=" + libro.getTitulo() +
                '}';
    }
}
