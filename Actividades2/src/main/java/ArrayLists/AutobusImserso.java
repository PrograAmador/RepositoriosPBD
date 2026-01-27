package ArrayLists;

import java.util.ArrayList;

public class AutobusImserso {

    private String matricula;
    private String destino;
    private ArrayList<Abuelo> listaAbuelos;

    public AutobusImserso(String matricula, String destino) {
        this.matricula = matricula;
        this.destino = destino;
        listaAbuelos = new ArrayList<>();
    }

    public void insertarAbuelo(Abuelo abuelo) {
        listaAbuelos.add(abuelo);
    }

    public void mostrarPasajeros() {
        for (Abuelo abuelo : listaAbuelos) {
            System.out.println(abuelo);
        }
    }
    public void borrarAbuelo(Abuelo abuelo) {
        listaAbuelos.remove(abuelo.getNombre());
    }
    public void mostarMayores(int edad){

        for (Abuelo abuelo : listaAbuelos) {
            if(abuelo.getEdad() > edad){
                System.out.println(abuelo);
            }
        }
    }


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public ArrayList<Abuelo> getListaAbuelos() {
        return listaAbuelos;
    }

    public void setListaAbuelos(ArrayList<Abuelo> listaAbuelos) {
        this.listaAbuelos = listaAbuelos;
    }

    @Override
    public String toString() {
        return "AutobusImserso{" +
                "matricula='" + matricula + '\'' +
                ", destino='" + destino + '\'' +
                ", listaAbuelos=" + listaAbuelos +
                '}';
    }

}
