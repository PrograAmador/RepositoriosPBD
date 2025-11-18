package PracticaPrimitiva;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Primitiva {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner entrada = new Scanner(System.in);

        // Generar los números del sorteo
        int numeros[] = new int[6];
        for (int i = 0; i < numeros.length; i++) {
            int randomNumero;
            boolean duplicado;
            do {
                randomNumero = random.nextInt(49) + 1; // Números entre 1 y 49
                duplicado = false;
                for (int j = 0; j < i; j++) { // Comprobar duplicados
                    if (numeros[j] == randomNumero) {
                        duplicado = true;
                        break;
                    }
                }
            } while (duplicado);
            numeros[i] = randomNumero;
        }

        Arrays.sort(numeros); // Ordenar los números del sorteo

        int complementario;
        boolean duplicado;
        do {
            complementario = random.nextInt(49) + 1; // Generar complementario
            duplicado = false;
            for (int num : numeros) { // Comprobar que no esté en los números principales
                if (num == complementario) {
                    duplicado = true;
                    break;
                }
            }
        } while (duplicado);

        int reintegro = random.nextInt(10); // Reintegro entre 0 y 9

        // Pedir los números del usuario
        System.out.println("Introduce tus números (1-49) y reintegro (0-9) en formato X-X-X-X-X-X/R: ");
        String input = entrada.nextLine();
        String matches = "\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}-\\d{1,2}/\\d";
        if (!input.matches(matches) ) {
            System.out.println("Formato de numeros introducidos incorrecto. Por favor, inténtalo de nuevo.");
            return;
        }

        // Separar los números ingresados
        String[] partesInput = input.split("[-/]");
        int[] numerosInput = new int[6];
        for (int i = 0; i < 6; i++) {
            numerosInput[i] = Integer.parseInt(partesInput[i]); //Compruebo que estén en el rango correcto
            if (numerosInput[i]>49 || numerosInput[i]<1){
                System.out.println("Numeros fuera del rango. Por favor, inténtalo de nuevo.");
                return;
            }
        }
        int reintegroInput = Integer.parseInt(partesInput[6]); //Cojo el reintegro del usuario
        if (reintegroInput>9 || reintegroInput<0){ //Compruebo que esté en el rango correcto
            System.out.println("Reintegro con formato incorrecto. Por favor, inténtalo de nuevo.");
            return;
        }
        int aciertos = 0;
        boolean aciertoComplementario = false;
        boolean aciertoReintegro = false;

        if(reintegroInput == reintegro){//Comparar con el reintegro del sistema
            aciertos++;
            aciertoReintegro = true;
        }

        for (int numeroUsuario : numerosInput) {
            for (int numeroSorteo : numeros) { // Comparar con los números principales
                if (numeroUsuario == numeroSorteo) {
                    aciertos++;
                    break;
                }
            }
            if (numeroUsuario == complementario) {// Comparar con el complementario
                aciertos++;
                aciertoComplementario = true;
            }
        }

        // Mostrar resultados
        System.out.println("SORTEO: ");
        System.out.println(Arrays.toString(numeros));
        System.out.println("Complementario: " + complementario);
        System.out.println("Reintegro: " + reintegro);
        System.out.println("RESULTADOS:");
        System.out.println(aciertos + " aciertos");

        // Categorias del premio
        System.out.println("CATEGORÍA:");

        if (aciertos == 6 && aciertoReintegro) {
            System.out.println("Categoría Especial");
        }
        else if (aciertos == 6) {
            System.out.println("1ª Categoría");
        }
        else if (aciertos == 5 && aciertoComplementario) {
            System.out.println("2ª Categoría");
        }
        else if (aciertos == 5) {
            System.out.println("3ª Categoría");
        }
        else if (aciertos == 4) {
            System.out.println("4ª Categoría");
        }
        else if (aciertos == 3) {
            System.out.println("5ª Categoría");
        }
        else if (aciertoReintegro) {
            System.out.println("Reintegro");
        }
        else {
            System.out.println("No premiado");
        }

    }
}