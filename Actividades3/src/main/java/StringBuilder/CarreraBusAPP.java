package StringBuilder;

import java.util.Random;

public class CarreraBusAPP {
    static Random random = new Random();
    public static final int TAM = 97;

    public static void main(String[] args) throws InterruptedException {

        int a = 0; // POSICIÓN INICIAL DEL AUTOBÚS
        int b = 0;
        System.out.println("\n<<<<<<<<<< CARRERA DE BUSES! >>>>>>>>>>>>");
        Thread.sleep(3000);

        while (a < TAM && b<TAM ) {

            a += random.nextInt(2); // avanzamos
            b += random.nextInt(2);
            limpiarPantalla();

            if (a < TAM|| b<TAM) {
                System.out.println(dibujarCarrera(a));
                System.out.println(dibujarCarrera2(b));
                Thread.sleep(70);
            }


        }
        if(a == TAM) {
            System.out.println("\033[32m" + "EL AUTOBUSITO DEL IES MUTXAMEL HA GANADO!!" + "\033[0m");
        }else if(b==TAM){
            System.out.println("\033[32m" + "EL AUTOBUSITO DEL IES SAN VICENTE HA GANADO!!" + "\033[0m");
        }
    }

    public static String dibujarCarrera(int n1) {

        StringBuilder sb = new StringBuilder();

        sb.append("_".repeat(117)).append("\n");
        sb.append(" ".repeat(n1)).append("🚍").append(" ".repeat(100 - n1)).append("\n");
        sb.append(" ".repeat(n1)).append("|_|_|_|_|_|_|_| ").append(" ".repeat(TAM - n1)).append("\n");
        sb.append(" ".repeat(n1)).append("|   IES MUTXAMEL   |").append(" ".repeat(TAM - n1)).append("\n");
        sb.append(" ".repeat(n1)).append("|~~@~~~~~~~~@~~~|").append(" ".repeat(TAM - n1)).append("\n");
        sb.append("_".repeat(117));

        return sb.toString();
    }
    public static String dibujarCarrera2(int n1) {

        StringBuilder sb = new StringBuilder();

        sb.append("_".repeat(117)).append("\n");
        sb.append(" ".repeat(n1)).append("🚍").append(" ".repeat(100 - n1)).append("\n");
        sb.append(" ".repeat(n1)).append("|_|_|_|_|_|_|_| ").append(" ".repeat(TAM - n1)).append("\n");
        sb.append(" ".repeat(n1)).append("|   IES SAN VICENTE |").append(" ".repeat(TAM - n1)).append("\n");
        sb.append(" ".repeat(n1)).append("|~~@~~~~~~~~@~~~|").append(" ".repeat(TAM - n1)).append("\n");
        sb.append("_".repeat(117));

        return sb.toString();
    }

    public static void limpiarPantalla() {
        try {
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception e) {
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }
    }
}