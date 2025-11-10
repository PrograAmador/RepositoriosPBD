package BateriaPreExamenT2;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);
        System.out.println("**MEDIA MARKT DEBT CALCULATOR**");
        System.out.println("Cuantos meses es tu financiacion?: ");
        int meses = entrada.nextInt();
        System.out.println("Cuanto pagaste el primer mes?: ");
        double pago = entrada.nextDouble();
        System.out.println("Financiación a " + meses + " meses.");
        double total= pago;
        System.out.println("Mes 1:" + pago+ "€" );
        for(int i = 2; i <= meses; i++){
            System.out.println("Mes " + (i) + ":" + (pago *= 2) + "€" );
            total += pago;
        }
        System.out.println("El total a pagar es: " + total);
    }
}
