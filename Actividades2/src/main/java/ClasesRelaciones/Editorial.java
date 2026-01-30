package ClasesRelaciones;

import java.util.ArrayList;


public class Editorial {

    private String nombre;
    private String pais;
    private ArrayList<Libro> listaLibrosPublicados;

    public Editorial(String nombre, String pais) {
        this.nombre = nombre;
        this.pais = pais;
        this.listaLibrosPublicados = new ArrayList<>();
    }

    public void anyadirLibro(Libro libro){
        for(Libro l : listaLibrosPublicados){
            if(l.getTitulo().equalsIgnoreCase(libro.getTitulo())){
                System.out.println("El libro " + libro.getTitulo() + " ya existe en la editorial.");
                return;
            }else {
                listaLibrosPublicados.add(libro);
            }
        }
    }
    public void borrarLibro(Libro libro){
        listaLibrosPublicados.remove(libro);
    }

    public ArrayList<Libro> getListaLibrosPublicados() {
        return listaLibrosPublicados;
    }
    public void setListaLibrosPublicados(ArrayList<Libro> listaLibrosPublicados) {
        this.listaLibrosPublicados = listaLibrosPublicados;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Editorial{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", listaLibrosEditorial=" + listaLibrosPublicados +
                '}';
    }


}
