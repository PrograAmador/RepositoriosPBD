package Practica2_Calculadora;

import java.util.Scanner;

public class CalculadoraSimple {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("***BIENVENIDO A LA CALCULADORA SIMPLE***");
        System.out.print("> Introduce operando: \n");
        double operando1;

        try { //comprueba de que la entrada es valida
            operando1 = entrada.nextDouble();
        }catch (Exception e){
            System.out.println("Error: Entrada de operando 1 no valida.");
            return;
        }
        System.out.print("-------------------------------\n");
        System.out.print("[+} -> sumar\n");
        System.out.print("[-] -> restar\n");
        System.out.print("[x] -> multiplicar\n");
        System.out.print("[/] -> dividir\n");
        System.out.print("[R] -> raiz cuadrada\n");
        System.out.print("-------------------------------\n");
        System.out.print("Elige una operacion: \n");
        String operacion;

        try { //comprueba de que la entrada es valida
            operacion = entrada.next();
        }catch (Exception e){
            System.out.println("Error: Entrada no valida.");
            return;
        }

        double operando2 = 0;
        if (!operacion.equalsIgnoreCase("R")) { //si la operacion no es raiz cuadrada, pide el segundo operando
            System.out.print("> Introduce el segundo operando: \n");
            try {
                operando2 = entrada.nextDouble();

            } catch (Exception e) {
                System.out.println("Error: Entrada segundo operando no valida.");
                return;
            }
        }

        double solucion;
        switch (operacion.toUpperCase()) { //realiza la operacion segun la entrada y la convierte a mayusculas
            case "+":
                solucion = operando1 + operando2;
                break;
            case "-":
                solucion = operando1 - operando2;
                break;
            case "X":
                solucion = operando1 * operando2;
                break;
            case "/":
                if (operando2 != 0) {
                    solucion = operando1 / operando2;
                } else {
                    System.out.println("Error: Division por cero.");
                    return;
                }
                break;
            case "R":
                if (operando1 >= 0) {
                    solucion = Math.sqrt(operando1);
                } else {
                    System.out.println("Error: Raiz cuadrada de numero negativo.");
                    return;
                }
                break;
            default:
                System.out.println("Operacion no valida.");
                return;
        }


        if (operacion.equalsIgnoreCase("R")) { //si la operacion es raiz cuadrada da una salida y sino otra
            System.out.println("El resultado de la raiz cuadrada de " + operando1 + " es: " + solucion);
        } else
            System.out.println("El resultado de " + operando1 + " " + operacion + " " + operando2 + " es: " + solucion);
        }
    }

