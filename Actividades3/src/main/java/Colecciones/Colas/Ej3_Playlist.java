package Colecciones.Colas;

import java.util.LinkedList;
import java.util.Queue;

public class Ej3_Playlist {
    public static void main(String[] args) {

        Queue<String> playlistEstopa = new LinkedList<>();
        playlistEstopa.offer("El del medio de los chichos");
        playlistEstopa.offer("Superior a mi");
        playlistEstopa.offer("Me falta el aliento");
        playlistEstopa.offer("Lunes");
        playlistEstopa.offer("Por la raja de tu falda");
        playlistEstopa.offer("Tu calorro");


        System.out.println("Estado incial de la playlistEstopa: " + playlistEstopa);

        while(!playlistEstopa.isEmpty()){
            System.out.println("Reproduciendo: " + playlistEstopa.poll());
            System.out.println("Estado actual de la playlistEstopa: " + playlistEstopa);
        }
    }
}
