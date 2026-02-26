import java.io.*;
import java.util.*;
public class SumaNumeros {

	public static void main(String args[]) throws IOException {
		Scanner bufEntrada = new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		System.out.println("Hola Alberto Programer");
		System.out.println("Introduce dos numeros: ");
		num1 = bufEntrada.nextInt();
		num2 = bufEntrada.nextInt();
		num3 = num1+num2;
		System.out.println("La suma es: " + num3);
	}


}