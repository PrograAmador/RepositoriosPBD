package Excepciones;

public class Prueba {

    public static void main(String[] args) {

        int edad = 15;

        if(edad >= 18) {
            throw new EdadValida();
        }
    }
}
