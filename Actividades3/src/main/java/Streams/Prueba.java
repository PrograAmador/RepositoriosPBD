package Streams;

import java.util.List;
import java.util.stream.Stream;

public class Prueba {
    public static void main(String[] args) {

        boolean  pruebaStream = Stream.of("Ibai", "Illojuan", "Falete", "Kevin")

                .filter(persona -> persona.startsWith("I"))
                .filter(persona -> persona.contains("a"))
                .anyMatch(persona -> persona.equals("Ibai"));

        //List<String> lista = pruebaStream.toList();
        System.out.println(pruebaStream);




    }
}
