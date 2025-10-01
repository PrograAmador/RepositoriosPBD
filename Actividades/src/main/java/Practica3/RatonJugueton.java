package Practica3;

import java.util.Scanner;

public class RatonJugueton {
    static Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("**BIENVENIDO AL RATON JUGUETÓN**");
        System.out.println("Leyendo altura (cm)...");
        int altura;
        try{
            altura = entrada.nextInt();
            if(altura < 0 || altura > 230){
                throw new Exception(); //lanzo una excepcion por si la altura es negativa o mayor de 230
            }
        } catch (Exception e){
            System.out.println("ERROR DE LECTURA. BAJA DE LA BÁSCULA Y VUELVE A SUBIR..."); //Aqui tambien salta si no le pones un numero entero
            return;
        }
        if(altura < 140) { //Si la altura es menor de 140 no puede montar en la atraccion
            int faltura = 140 - altura; //Calculo cuanto le falta para poder montar
            System.out.println("LO SIENTO, NO PUEDES MONTAR EN LA ATRACCIÓN. Te faltan " + faltura + " cm de altura");
            return;
        }

        System.out.println("Leeyendo peso (kg)...");
        int peso;
        int pesomin;
        try {
            peso = entrada.nextInt();
            pesomin = altura * 2 / 8; //Calculo el peso minimo segun la altura
            if (peso < pesomin) {
                throw new Exception("LO SIENTO. Te faltan " + (pesomin - peso) + "kgs para subir a la atraccion."); //lanzo una excepcion si el peso es menor que el peso minimo y por cuanto lo es.
            }else if(peso > 120){
                throw new Exception("LO SIENTO. Pesas " + (peso - 120) + "Kgs por encima de lo permitido."); //lanzo una excepcion si el peso es mayor que 120 y por cuanto lo es
        }else{
                System.out.println("Pesas " + peso + " kg. Peso mínimo calculado: " + pesomin + " kg.");
                System.out.println("¡¡SUBE A LA ATRACCION!!");
            }
        } catch (Exception e){
            System.out.println("Error: " + e.getMessage()); //Esta excepcion tambien salta si la entrada no es un numero entero
        }
    }
}
