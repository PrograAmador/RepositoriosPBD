package RuletaCasino;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ajugaar {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random random = new Random();

        final String[] colores = {"rojo", "negro"};
        final Integer[] numeros = new Integer[37];
        for (int i = 0; i < 37; i++) {
            numeros[i] = i ;
        }
        final String[] valores = {"par", "impar"};
        System.out.println("Bienvenido, introduzca un numero (0-36): ");

        Integer numeroApostado = entrada.nextInt();

        boolean num_encontrado = Arrays.asList(numeros).contains(numeroApostado);
        if(!num_encontrado){
            System.out.println("Error. Número no encontrado.");
            return;
        }

        String colorApostado = "";
        String valorApostado = "";
        if(numeroApostado != 0) {
            System.out.println("Introduzca un color: ");
            colorApostado = entrada.next().toLowerCase();
            System.out.println("Introduzca un valor (par/impar): ");
            valorApostado = entrada.next().toLowerCase();
            boolean color_encontrado = Arrays.asList(colores).contains(colorApostado);
            if(!color_encontrado){
                System.out.println("Error. Color no encontrado.");
                return;
            }
            boolean valor_encontrado = Arrays.asList(valores).contains(valorApostado);
            if(!valor_encontrado){
                System.out.println("Error. Valor no encontrado.");
                return;
            }
        }
        int numeroGanador = random.nextInt(0, 37);
        int colorGanadorIndex = random.nextInt(0, 2);
        String valorGanador;
        if(numeroGanador % 2 == 0){
            valorGanador = "par";
        }else{
            valorGanador = "impar";
        }
        System.out.println("Ha salido el numero: " + numeroGanador);
        System.out.println("El color: " + colores[colorGanadorIndex]);
        System.out.println("Con el valor: " + valorGanador);

        if(numeroApostado.equals(numeroGanador) && colores[colorGanadorIndex].equals(colorApostado) && valorApostado.equals(valorGanador)){
            System.out.println("¡¡¡¡HAS GANADO EL JACKPOT!!!!");
        }else if(colores[colorGanadorIndex].equals(colorApostado)) {
            System.out.println("¡Felicidades! Has ganado por color acertado.");
        }else if(valorApostado.equals(valorGanador)) {
            System.out.println("¡Felicidades! Has ganado por valor acertado.");
        }else if (numeroApostado.equals(numeroGanador)) {
            System.out.println("¡Felicidades! Has ganado por número acertado.");
        }else if (numeroGanador == 0) {
            System.out.println("HAS GANADO Y TODOS PIERDEN");
        }else{
            System.out.println("Lo siento, vuelve a intentarlo!.");
        }

    }
}
