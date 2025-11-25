package Practica3_ZXSPectrum;
import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("******* VALIDADOR DE COMPATIBILIDAD ZX SPECTRUM *******"); //Esto es un programa para comprobar la compatibilidad de una matriz introducida de colores(letras) con el SPECTRUM ZX de antes.
        System.out.println("Introduce la resolución de tu pantalla (ancho x alto): ");
        System.out.println("Ancho: ");
        int ancho = entrada.nextInt();
        System.out.println("Alto: ");
        int alto = entrada.nextInt();
        entrada.nextLine(); // Limpio el buffer

        if (!(ancho < 48 && alto < 48 && ancho % 8 == 0 && alto % 8 == 0)) {// Compruebo que los valores introducidos por el usuario sean multiples de 8 y no mayores de 48 segun el ejercicio
            System.out.println("Los números introducidos no son correctos.");
            return;
        }

        String matriz[][] = new String[alto][ancho]; //Aqui creo una matriz con las dimensiones introducidas por el usuario

        System.out.println("Introduce los colores de tu imagen (línea a línea):");

        for (int i = 0; i < alto; i++) { //Este for lo uso para repetir la pedida de entrada unas veces igual al alto de la matriz
            while (true) {
                String linea = entrada.nextLine().trim();
                String[] vector = linea.split("");// Divido la línea en caracteres individuales

                if (vector.length != ancho) { //Si la linea introducida supera lo largo de la matriz se informa y se vuelve a continuar el loop
                    System.out.println("Longitud de línea incorrecta.");
                    continue;
                }

                boolean valida = true; // Variable para comprobar si la línea es válida
                for (int j = 0; j < ancho; j++) { //Este for es para recorrer la matriz de izquierda a derecha y comprobar que los caracteres son correctos
                    if (!vector[j].matches("[a-oA-O]")) {
                        System.out.println("Has introducido un valor de pixel incorrecto (A-O).");
                        valida = false; //Si no es valida la letra introducida, esta variable lo registra
                        break;// Salgo del for si encuentro un carácter inválido
                    }
                }

                if (!valida) { //Si la línea no es válida, la pido otra vez continuando el loop
                    continue;
                }

                for (int j = 0; j < ancho; j++) { // Si la linea SI que es válida, la guardo en la matriz convertida a mayusculas
                    matriz[i][j] = vector[j].toUpperCase();
                }

                break; //Cuando la linea es valida y se llega hasta esta parte del bucle, salgo del while
            }
        }

        for (String[] fila : matriz) { // Imprimo la matriz
            for (String color : fila) {
                System.out.print(color + " ");
            }
            System.out.println();
        }
        boolean compatible = true; //Ahora para saber si es compatible con ZX Spectrum lo divido en arrays de 8 y busco en ellos 3 letras diferentes

        for (int fil = 0; fil < alto; fil += 8) { // Recorro la matriz de 8 en 8 por filas
            for (int col = 0; col < ancho; col += 8) { //Y lo recorro en 8 por 8 tambien por columnas

                String color1 = matriz[fil][col]; // Primer color del bloque
                String color2 = ""; // Segundo color del bloque

                for (int i = fil; i < fil + 8; i++) { // Recorro el bloque de 8x8
                    for (int j = col; j < col + 8; j++) {
                        String letra = matriz[i][j];// Me guardo la letra actual para poder compararla con los colores que me he guardado

                        if (!letra.equals(color1)) { // Si la letra encontrada no es igual a la del color guardado entro y asigno al segundo color ese valor
                            if (color2.isEmpty()) {
                                color2 = letra;// Si el segundo color esta vacio, le asigno el valor

                            } else if (!letra.equals(color2)) { // Si la letra que em encuentro no es igual al segundo color, el bloque no es compatible y me salgo del primer for para seguir saliendome hasta salir del programa
                                compatible = false;
                                break;// Salgo del for si encuentro un tercer color
                            }
                        }
                    }
                    if (!compatible) {
                        break; // Salgo del segudno for
                    }
                }
                if (!compatible) { // Salgo del tercer for
                    break;
                }
            }
            if (!compatible) { //salgo del cuarto for
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

