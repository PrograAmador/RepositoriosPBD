package BatallaSamurais;

import java.util.Random;
import java.util.Scanner;

public class BatallaSamurais {
    public void iniciarCombate() {
        Scanner entrada = new Scanner(System.in);
        Random azar = new Random();

        int cantidadEquipos = 2;
        int[] fuerzaEquipoA = new int[7];
        int[] fuerzaEquipoB = new int[7];
        int totalPotencia;
        boolean entradaValida;
        // Bucle para registrar la potencia de ambos equipos
        for (int equipo = 1; equipo <= cantidadEquipos; equipo++) {
            System.out.println("Configurando Equipo " + equipo);


            do {
                System.out.println("Introduce las fuerzas de los 7 samuráis (separadas por espacio): ");
                String linea = entrada.nextLine();
                String[] valores = linea.trim().split(" ");
                totalPotencia = 0;
                entradaValida = true;
                if (valores.length != 7) {
                    System.out.println("Debes introducir exactamente 7 valores.");
                    continue; // vuelve a pedir la entrada
                }

                try {
                    for (int i = 0; i < 7; i++) {
                        int poder = Integer.parseInt(valores[i]);
                        totalPotencia += poder;

                        if (equipo == 1) {
                            fuerzaEquipoA[i] = poder;
                        } else {
                            fuerzaEquipoB[i] = poder;
                        }
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Debes introducir solo números válidos.");
                    entradaValida = false;
                    break;
                }

                if(!entradaValida) continue; // Si hubo texto no numérico, vuelve a pedir toda la línea

                if (totalPotencia != 30) {
                    System.out.println("Error: reparte exactamente 30 puntos entre tus 7 samuráis.");
                }

            } while (totalPotencia != 30);

            System.out.println("Equipo " + equipo + " configurado correctamente.");
        }

        // Determinar el primer enfrentamiento de forma aleatoria
        int inicio = azar.nextInt(7);
        System.out.println("¡La batalla comienza!");
        System.out.println("El primer combate será con el Samurái número " + (inicio + 1));

        int derrotasA = 0;
        int derrotasB = 0;

        // Ronda de combates
        for (int ronda = 0; ronda < 7; ronda++) {
            int turnoActual = (inicio + ronda) % 7;
            System.out.println("Combate " + (ronda + 1) + ": Samurai " + (turnoActual + 1) + " -> " + fuerzaEquipoA[turnoActual] + " vs " + fuerzaEquipoB[turnoActual]);

            if (fuerzaEquipoA[turnoActual] > fuerzaEquipoB[turnoActual]) {
                System.out.println("Gana el Equipo 1");
                fuerzaEquipoB[turnoActual] = 0;
                derrotasB++;
            } else if (fuerzaEquipoA[turnoActual] < fuerzaEquipoB[turnoActual]) {
                System.out.println("Gana el Equipo 2");
                fuerzaEquipoA[turnoActual] = 0;
                derrotasA++;
            } else {
                System.out.println("Empate entre ambos samuráis.");
                fuerzaEquipoA[turnoActual] = 0;
                fuerzaEquipoB[turnoActual] = 0;
                derrotasA++;
                derrotasB++;
            }
            if (derrotasB >= 4 || derrotasA >= 4) {
                break;
            }
        }

        // Resultado final
        if (derrotasB >= 4) {
            System.out.println("¡Equipo 1 gana! El Equipo 2 sufrió 4 bajas.");
        } else if (derrotasA >= 4) {
            System.out.println("¡Equipo 2 gana! El Equipo 1 sufrió 4 bajas.");
        } else {
            System.out.println("La batalla termina en empate.");
        }
    }
}