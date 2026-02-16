package Herencias.Carrefour;

public class Reponedor extends Persona {


    private String pasillo;

    public Reponedor(int codigo, String nombre, double sueldo, String pasillo) {
        super(codigo, nombre, sueldo);
        this.pasillo = pasillo;
    }

    public String getPasillo() {
        return pasillo;
    }

    public void setPasillo(String pasillo) {
        this.pasillo = pasillo;
    }
    @Override
    public String toString() {
        return "Reponedor{" +
                "pasillo='" + pasillo + '\'' +
                '}';
    }
}
