package Enumeraciones;

public class APPcalle {
    public static void main(String[] args) {

        Semaforo s = Semaforo.AMARILLO;

        for (int i = 0; i<10; i++){
            s= s.siguiente();
            System.out.println(s);
        }
    }
}
