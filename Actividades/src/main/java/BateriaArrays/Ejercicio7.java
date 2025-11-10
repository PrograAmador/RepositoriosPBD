package BateriaArrays;

public class Ejercicio7 {
    public static void main(String[] args) {
        int [] array = {1,2,3};
        int [] array2 = {4,5,6};
        int [] array3 = new int[array.length + array2.length];
        for(int i = 0; i < array.length; i++) {
            array3[i] = array[i];
        }
        for(int j = 0; j < array2.length; j++) {
            array3[array.length + j] = array2[j];
        }
        System.out.println("Array resultante: " + java.util.Arrays.toString(array3));
    }
}
