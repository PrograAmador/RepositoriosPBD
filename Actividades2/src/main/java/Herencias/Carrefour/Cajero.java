package Herencias.Carrefour;

import java.util.Scanner;

public class Cajero extends Persona {

    static Scanner scanner = new Scanner(System.in);

    private int caja;

    public Cajero(int codigo, String nombre, double sueldo) {
        super(codigo, nombre, sueldo);
        setCaja();
    }

    public int getCaja() {
        return caja;
    }

    public void setCaja() {
        System.out.println("Ingrese el numero de caja asignada al cajero: ");
       this.caja = scanner.nextInt();
       scanner.nextLine();
    }
    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Caja: " + caja);
    }

    @Override
    public String toString() {
        return "Cajero{" +
                "caja=" + caja +
                '}';
    }
}
