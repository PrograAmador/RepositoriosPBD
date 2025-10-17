package Practica01;
import java.util.Scanner;
public class Multiplicar3Num {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        int num1= 0;
        int num2 = 0;
        try {
            do {
                System.out.println("Introduce el multiplicando (3 cifras): ");
                num1 = entrada.nextInt();

                if (!((num1 >= 100 && num1 <= 999) || (num1 <= -100 && num1 >= -999))) { //controlo que no me pongan un umero que no tenga 3 cifras ya sea positivo o negativo
                    System.out.println("Error: El número debe tener 3 cifras.");
                }
            } while (!((num1 >= 100 && num1 <= 999) || (num1 <= -100 && num1 >= -999))); //te vuelve a preguntar si no lo has puesto bien
            do {
                System.out.println("Introduce el multiplicador (3 cifras): ");
                num2 = entrada.nextInt();
                if (!((num2 >= 100 && num2 <= 999) || (num2 <= -100 && num2 >= -999))) {
                    System.out.println("Error: El número debe tener 3 cifras.");
                }
            } while (!((num2 >= 100 && num2 <= 999) || (num2 <= -100 && num2 >= -999)));

        } catch (Exception e) {
            System.out.println("Error: Debes introducir un número válido."); //controla que no pongas letras
        }

        int resultado = num1 * num2; //hago trampas y hago ya la operacion para tenerla pronto


        System.out.println("El resultado de la multiplicacion es: " + resultado);
        System.out.println("El proceso es: ");
        System.out.println("       " + num1);
        System.out.println("     x " + num2);
        System.out.println("     -------");

        String num2str = Integer.toString(num2); //Transformo el segundo numero a String

        if( num2 < 0){ //si es negativo sigue este camino de operacion, 1 mas en la posicion de los substring
            String num2multi = num2str.substring(3, 4); //cojo la ultima cifra del numero
            int num2int = Integer.parseInt(num2multi); //la transformo a entero
            String num2multi2 = num2str.substring(2, 3);
            int num2int2 = Integer.parseInt(num2multi2);
            String num2multi3 = num2str.substring(1, 2);
            int num2int3 = Integer.parseInt(num2multi3);

            System.out.println("       " + (num2int * num1)); //Hago la operacion y lo imprimo

            System.out.println("      " + (num2int2 * num1) + "x");

            System.out.println("     " + (num2int3 * num1) + "xx");
            System.out.println("     -------");
            System.out.println("     " + resultado);
        }else { //si es positivo sigue este camino de operacion

            String num2multi = num2str.substring(2, 3);
            int num2int = Integer.parseInt(num2multi);
            String num2multi2 = num2str.substring(1, 2);
            int num2int2 = Integer.parseInt(num2multi2);
            String num2multi3 = num2str.substring(0, 1);
            int num2int3 = Integer.parseInt(num2multi3);

            System.out.println("       " + (num2int * num1)); //Hago la operacion y lo imprimo

            System.out.println("      " + (num2int2 * num1) + "x");

            System.out.println("     " + (num2int3 * num1) + "xx");
            System.out.println("     -------");
            System.out.println("     " + resultado);
        }
    }
}
