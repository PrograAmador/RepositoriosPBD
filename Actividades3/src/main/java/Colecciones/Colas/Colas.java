package Colecciones.Colas;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Colas {
    public static void main(String[] args) {

        Deque<String> cola = new LinkedList<>();

        cola.offer("Blessd");
        cola.offer("Duki");
        cola.offer("Ysy A");


        System.out.println(cola.poll());
        System.out.println(cola.peek());

        cola.offerFirst("Cazzu");
        System.out.println(cola.peek());
        System.out.println(cola.pollLast());

        Queue<String> cola2 = new ArrayBlockingQueue<>(2);
        cola2.offer("Hola");
        cola2.offer("Mundo");


    }
}
