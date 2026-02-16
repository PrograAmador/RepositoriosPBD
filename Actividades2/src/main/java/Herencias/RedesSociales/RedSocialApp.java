package Herencias.RedesSociales;

public class RedSocialApp {
    public static void main(String[] args) {
        Basico usuario1 = new Basico("Juan Perez", 25, "juanperez", 100);
        Influencer usuario2 = new Influencer("Maria Gomez", 30, "mariagomez", 5000);
        Streamer usuario3 = new Streamer("Carlos Lopez", 28, "carloslopez", 2000, 150, 300);

        usuario2.agregarColaboracion("Colaboración con marca X");
        usuario2.agregarColaboracion("Colaboración con marca Y");

        System.out.println("Información del Usuario Básico:");
        usuario1.mostrarInformacion();
        System.out.println();

        System.out.println("Información del Influencer:");
        usuario2.mostrarInformacion();
        System.out.println();

        System.out.println("Información del Streamer:");
        usuario3.mostrarInformacion();
    }
}
