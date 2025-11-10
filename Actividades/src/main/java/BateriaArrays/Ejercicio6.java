package BateriaArrays;

public class Ejercicio6 {
    public static void main(String[] args) {
        int [] vector = {1, 2, 3,2, 1};

        boolean lo_es = true;
        for(int i = 0; i < vector.length / 2; i++) {
            if(vector[i] != vector[vector.length - 1 - i]){
                System.out.println("El array no es capicúa.");
                lo_es = false;
                break;
            }
        }
        if (lo_es) {
            System.out.println("El array es capicúa.");
        }
    }
}
