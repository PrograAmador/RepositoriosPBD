package Sort;

import java.util.Arrays;

public class modo1 {
    public static void main(String[] args) {
        int vector[] = {1,2,2,3,4,4,5};
        int vector2[] = new int[vector.length];
        int tam = 0;

        for(int i = 0; i <vector.length-1; i++) {
            if(i == vector.length-1 ||vector[i] != vector[i+1]) {
                vector2[i] = vector[i];
                tam++;
            }
        }
        int vector3[] = new int[tam];
        int index = 0;
        for(int j = 0; j < vector2.length;j++) {
            if(vector2[j] != 0) {
                vector3[index] = vector2[j];
                index++;
            }
        }

        System.out.println("Array without duplicates: " + Arrays.toString(vector3));

    }
}
