package Sort;

import java.util.Arrays;

public class modo2 {
    public static void main(String[] args) {
        int original[] = {1, 2, 2, 3, 4, 4, 5};
        int tam = 0;
        for (int i = 0; i < original.length; i++) {

            if(original[i] !=original[i+1]){
                original[i]=-1000;
            }else{
                tam++;
            }
        }
        int limpio[] = new int [tam];
        int j = 0;
        for (int i = 0; i < original.length; i++) {
            if(original[i] != -1000){
                limpio[j] = original[i];
                j++;
            }
        }
        System.out.println("Array without duplicates: "+ Arrays.toString(limpio));
    }
}
