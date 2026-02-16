package Herencias.RedesSociales;

public class Basico extends Usuario{

    public Basico(String nombre, int edad, String nombreUsuario, int seguidores) {
        super(nombre, edad, nombreUsuario, seguidores);
    }

     @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
    }

}
