package BateriaMetodos;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

    }
    public static void INPUT() {
        System.out.print("Introduce la recaudacion de la semana: ");
        String recaudacion;
        String[] partes;
        do {
            recaudacion = entrada.nextLine();
            partes = recaudacion.split("\\.");

        } while (!recaudacion.equals("-1"));

        System.out.println(Arrays.toString(partes));
    }
    public static String MasVentas(String[] partes) {
        int max = 0;
        int dia = 0;
        for (int i = 0; i < partes.length; i++) {
            int valor = Integer.parseInt(partes[i]);
            if (valor > max) {
                max = valor;
                dia = i + 1;
            }
        }
        String diaSemana = "";
        if(dia == 1){
            diaSemana = "LUNES";
        }else if(dia == 2) {
            diaSemana = "MARTES";
        }else if(dia == 3) {
            diaSemana = "MIERCOLES";
        }else if(dia == 4) {
            diaSemana = "JUEVES";
        }else if(dia == 5) {
            diaSemana = "VIERNES";
        }else if(dia == 6) {
            diaSemana = "SABADO";
        }
        return diaSemana;
    }
    public static String MenosVentas(String[] partes) {
        int min = 0;
        int dia = 0;
        for (int i = 0; i < partes.length; i++) {
            int valor = Integer.parseInt(partes[i]);
            if (valor < min) {
                min = valor;
                dia = i + 1;
            }
        }
        String diaSemana = "";
        if(dia == 1){
            diaSemana = "LUNES";
        }else if(dia == 2) {
            diaSemana = "MARTES";
        }else if(dia == 3) {
            diaSemana = "MIERCOLES";
        }else if(dia == 4) {
            diaSemana = "JUEVES";
        }else if(dia == 5) {
            diaSemana = "VIERNES";
        }else if(dia == 6) {
            diaSemana = "SABADO";
        }
        return diaSemana;
    }
    public static int MediaSemanal(String[] partes) {
        int suma = 0;
        for (int i = 0; i < partes.length; i++) {
            int valor = Integer.parseInt(partes[i]);
            suma += valor;
        }
        int media = suma / partes.length;
        return media;
    }
    public static String RecaudacionDomingo(String[] partes) {
        int valor1 = Integer.parseInt(partes[12]);
        int valor2 = Integer.parseInt(partes[13]);
        double mediaDomingo = (double) valor1 /valor2;
        if(mediaDomingo > MediaSemanal(partes)){
            return "SI";
        }else{
            return "NO";
        }
    }
}
