package BateriaArrays;

public class Ejercicio5 {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int aux = array[array.length -1];
        for(int i = 0; i < array.length; i++) {
            if (i == array.length -1){
                array[i] = array[0];
            }else if (i == 0){
                array[i] = aux;
            }else{
                array[i] = array[i +1];
            }
        }
        System.out.println("Array resultante: " + java.util.Arrays.toString(array));
    }
}
