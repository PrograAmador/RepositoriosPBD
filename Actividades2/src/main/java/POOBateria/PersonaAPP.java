package POOBateria;

import java.util.Scanner;

import static POOBateria.Persona.mostrarResultados;

public class PersonaAPP {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Edad: ");
        int edad = sc.nextInt();

        System.out.print("Sexo (H/M): ");
        char sexo = sc.next().charAt(0);

        System.out.print("Peso: ");
        double peso = sc.nextDouble();

        System.out.print("Altura: ");
        double altura = sc.nextDouble();

        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);

        Persona persona2 = new Persona(nombre, edad, sexo);

        Persona persona3 = new Persona(peso, altura);
        mostrarResultados(persona3);
        mostrarResultados(persona2);
        mostrarResultados(persona1);



    }

}
