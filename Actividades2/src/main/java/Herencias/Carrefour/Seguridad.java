package Herencias.Carrefour;

import java.util.ArrayList;

public class Seguridad extends Persona {

    private String empresa;
    private ArrayList<String> armas;

    public Seguridad(int codigo, String nombre, double sueldo, String empresa) {
        super(codigo, nombre, sueldo);
        this.empresa = empresa;
        armas = new ArrayList<>();
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public ArrayList<String> getArmas() {
        return armas;
    }
    public void setArmas(ArrayList<String> armas) {
        this.armas = armas;
    }

    public void agregarArma(String arma) {
        armas.add(arma);
    }

    public void eliminarArma(String arma) {
        armas.remove(arma);
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Empresa: " + empresa);
        System.out.println("Armas: " + armas);
    }


    @Override
    public String toString() {
        return "Seguridad{" +
                "turno='" + empresa + '\'' +
                 ", armas=" + armas +
                '}';
    }


}
