package recursividad;

import java.util.Scanner;

public class Recursitivities {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        menu();
        int opcion = 0;
        try{
            opcion = sc.nextInt();
        } catch (Exception e){
            System.out.println("Opcion no valida, por favor seleccione una opcion entre 1 y 7");
            menu();

        }
        if(opcion < 1 || opcion > 7){
            System.out.println("Opcion no valida, por favor seleccione una opcion entre 1 y 7");
            menu();
        } else {
            switch (opcion) {
                case 1:
                    System.out.println("Introduce un numero para contar sus digitos:");
                    int numero = sc.nextInt();
                    System.out.println("El numero de digitos es: " + Digitos(numero));
                    break;
                case 2:
                    System.out.println("Introduce la base:");
                    int base = sc.nextInt();
                    System.out.println("Introduce el exponente:");
                    int exponente = sc.nextInt();
                    System.out.println("El resultado es: " + Potencias(base, exponente));
                    break;
                case 3:
                    System.out.println("Introduce un numero o una cadena para mostrarlo del revés:");
                    if (sc.hasNextInt()) {
                        int numeroRev = sc.nextInt();
                        System.out.print("El numero del revés es: ");
                        DelRevesnumero(numeroRev);
                    } else {
                        String cadenaRev = sc.next();
                        char[] caracteres = cadenaRev.toCharArray();
                        System.out.print("La cadena del revés es: ");
                        DelRevesCadena(caracteres, caracteres.length - 1);
                    }
                    break;
                case 4:
                    System.out.println("Introduce un numero para comprobar si es binario:");
                    int numeroBin = sc.nextInt();
                    if (Binario(numeroBin)) {
                        System.out.println("El numero es binario");
                    } else {
                        System.out.println("El numero no es binario");
                    }
                    break;
                case 5:
                    System.out.println("Introduce un numero decimal para convertirlo a binario:");
                    int numeroDec = sc.nextInt();
                    System.out.println("El numero en binario es: " + ABinario(numeroDec));
                    break;
                case 6:
                    System.out.println("Introduce una palabra para comprobar si sus letras estan en orden alfabetico:");
                    String palabra = sc.next();
                    if (OrdenAlfabetico(palabra)) {
                        System.out.println("Las letras de la palabra estan en orden alfabetico");
                    } else {
                        System.out.println("Las letras de la palabra no estan en orden alfabetico");
                    }
                    break;
                case 7:
                    System.out.println("Introduce un numero para mostrar la suma desde ese numero hasta 0:");
                    int numeroSuma = sc.nextInt();
                    System.out.println("= "+ MostrarSuma(numeroSuma));
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }
        menuSalida();
    }
    public static void menu(){
        System.out.println("*** Bateria de ejercicios sobre recursividad ***");
        System.out.println("Selecciona a continuacion el modo que qiueres ejectuar:");
        System.out.println("1 - Digitos");
        System.out.println("2 - Potencias");
        System.out.println("3 - Del Revés");
        System.out.println("4 - Binario");
        System.out.println("5 - A binario");
        System.out.println("6 - Orden alfabetico");
        System.out.println("7 - Mostrar suma");
        System.out.print("Opcion: ");

    }
    public static void menuSalida(){
        System.out.println();
        System.out.println("Elige una opción:");
        System.out.println("[M] - Volver al menú principal");
        System.out.println("[X] - Salir");
        if(sc.next().equalsIgnoreCase("M")){
            main(new String[]{});
        } else {
            System.out.println("Saliendo...");
            System.exit(0);
        }
    }
    public static int Digitos(int numero){
      if(numero < 10){
          return 1;
      } else {
          return 1 + Digitos(numero / 10);
      }
    }
    public static int Potencias(int base, int exponente){
        if (exponente == 0){
            return 1;
        } else if(base <0 || exponente <0){
            System.out.println("Error: base o exponente negativos");
            return -1;
        }else {
            return base * Potencias(base, exponente - 1);
        }
    }
    public static int DelRevesnumero(int numero) {
        System.out.print(numero % 10);
        if (numero < 10) {
            return numero;
        } else {
            return DelRevesnumero(numero / 10);
        }
    }
    public static String DelRevesCadena(char[] caracteres, int indice) {

        if(indice < 0){
            return "";
        } else {
            System.out.print(caracteres[indice]);
            return DelRevesCadena(caracteres, indice - 1);
        }
    }
    public static boolean Binario(int numero){
        if(numero ==0 || numero ==1){
            return true;
        } else if (numero % 10 >1){
            return false;
        } else {
            return Binario(numero /10);
        }
    }
    public static int ABinario(int numero){
        if(numero ==0){
            return 0;
        } else {
            return numero % 2 + 10 * ABinario(numero /2);
        }
    }
    public static Boolean OrdenAlfabetico(String palabra){

        if(palabra.length() <=1){
            return true;
        } else {
            if(palabra.charAt(0) <= palabra.charAt(1)){
                return OrdenAlfabetico(palabra.substring(1));
            } else {
                return false;
            }
        }
    }
    public static int MostrarSuma(int numero){
        if(numero > 0){
            System.out.print(numero + " + ");
            return numero + MostrarSuma(numero -1);
        } else {
            return 0;
        }
    }
}
