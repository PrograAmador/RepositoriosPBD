package Practica3_ZXSPectrum;

import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("******* VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM *******");
        System.out.println("Introduce la resolución de tu pantalla (ancho x alto): ");
        System.out.println("Ancho: ");
        int ancho = entrada.nextInt();
        System.out.println("Alto: ");
        int alto = entrada.nextInt();
        entrada.nextLine(); // Limpio el buffer

        if (!(ancho < 48 && alto < 48 && ancho % 8 == 0 && alto % 8 == 0)) {// Compruebo que los valores son correctos
            System.out.println("Los números introducidos no son correctos.");
            return;
        }

        String matriz[][] = new String[alto][ancho];

        System.out.println("Introduce los colores de tu imagen (línea a línea):");

        for (int i = 0; i < alto; i++) {
            while (true) {
                String linea = entrada.nextLine().trim();
                String[] vector = linea.split("");// Divido la línea en caracteres individuales

                if (vector.length != ancho) {
                    System.out.println("Longitud de línea incorrecta.");
                    continue;
                }

                boolean valida = true; // Variable para comprobar si la línea es válida
                for (int j = 0; j < ancho; j++) {
                    if (!vector[j].matches("[a-oA-O]")) {// Compruebo que cada carácter es válido
                        System.out.println("Has introducido un valor de pixel incorrecto (A-O).");
                        valida = false;
                        break;// Salgo del for si encuentro un carácter inválido
                    }
                }

                if (!valida) { //Si la línea no es válida, pido otra vez
                    continue;
                }

                for (int j = 0; j < ancho; j++) { // Guardo la línea en la matriz
                    matriz[i][j] = vector[j].toUpperCase();
                }

                break; //Cuando la linea es valida salgo del while
            }
        }

        for (String[] fila : matriz) { // Imprimo la matriz
            for (String color : fila) {
                System.out.print(color + " ");
            }
            System.out.println();
        }
        boolean compatible = true;

        for (int fil = 0; fil < alto; fil += 8) { // Recorro la matriz de 8 en 8
            for (int col = 0; col < ancho; col += 8) {

                String c1 = matriz[fil][col]; // Primer color del bloque
                String c2 = null; // Segundo color del bloque

                for (int i = fil; i < fil + 8; i++) { // Recorro el bloque de 8x8
                    for (int j = col; j < col + 8; j++) {
                        String px = matriz[i][j];// Color del pixel actual

                        if (!px.equals(c1)) { // Si el color del pixel no es igual al primer color
                            if (c2 == null) {
                                c2 = px;// Si el segundo color es nulo, lo asigno

                            } else if (!px.equals(c2)) { // Si el color del pixel no es igual al segundo color
                                compatible = false;
                                break;// Salgo del for si encuentro un tercer color
                            }
                        }
                    }
                    if (!compatible) {
                        break; // Salgo del for si el bloque no es compatible
                    }
                }
                if (!compatible) {
                    break;
                }
            }
            if (!compatible) {
                break;
            }
        }

        if (compatible) {
            System.out.println("Es compatible con un ZX Spectrum");
        } else {
            System.out.println("No es compatible con un ZX Spectrum");
        }

    }
}
