package BateriaArrays;

public class Ejercicio2 {
    public static void main(String[] args) {
        int[] ArrayOriginal = {1, 2, 3, 4, 5};
        int[] ArrayInvertido = new int[ArrayOriginal.length];

        for(int i = 0; i < ArrayOriginal.length; i++) {
            ArrayInvertido[i] = ArrayOriginal[ArrayOriginal.length -1 - i];
        }

        System.out.println("Array Original: " + java.util.Arrays.toString(ArrayOriginal));
        System.out.println("Array Invertido: " + java.util.Arrays.toString(ArrayInvertido));


    }
}
