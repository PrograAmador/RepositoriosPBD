package BateriaArrays;

public class Ejercicio9 {
    public static void main(String[] args) {
        String [] array = {"esternocleidomastoideo", "verde", "rojo", "amarillo", "naranja"};
        String aux = "";
        for (int i = array.length -1; i>=1; i--) {
                if(array[i].length() > array[i-1].length() ){
                    aux = array[i];
                }else if (array[i].length() < array[i-1].length()){
                    aux = array[i-1];
                }else{
                    aux = array[i]; //En caso de empate se queda con la última
                }
        }
        System.out.println("La palabra más larga es: " + aux);
    }
}
