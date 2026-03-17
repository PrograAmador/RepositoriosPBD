package Colecciones.Iterators;


import java.util.*;

public class ReservasAPP {
    static Scanner sc = new Scanner(System.in);

    static HashMap<Usuario, HashSet<Reserva>> mapaReservas = new HashMap<>();
    public static void main(String[] args) {
        menu();
        System.out.println("Elige una opcion:  ");
        String opcion = sc.nextLine();
        while(!opcion.equals("4")){
            switch (opcion){
                case "1":
                    System.out.println("Introduce el usuario:");
                    Usuario usuario = new Usuario(sc.nextLine(), 11);
                    System.out.println("Introduce la pista: ");
                    ç
            }
        }

    }

    public static void menu(){
        System.out.println("***BIENVENIDO A LA APP DE RESERVAS");
        System.out.println("1-. Crear reserva");
        System.out.println("2-. Eliminar reserva");
        System.out.println("3-. Ver reserva");
        System.out.println("4-. Salir");
    }

    public static void eliminar(HashSet<Reserva> listaReservas){
        System.out.println("Que tipo de pistas quieres borrar?");
        String tipo = sc.nextLine().toLowerCase();
        Iterator<Reserva> it = listaReservas.iterator();

        while(it.hasNext()){
            Reserva reserva = it.next();
            if(reserva.getPista() instanceof Tenis && tipo.equals("tenis")){
                it.remove();
            }else if (reserva.getPista() instanceof Padel && tipo.equals("padel")){
                it.remove();
            }
        }
    }
    public static HashSet<Reserva> listaReserva(Usuario usuario){

        return mapaReservas.get(usuario);

    }

    public static void crearReserva(Usuario usuario, Pistas pista){
        Reserva reserva = new Reserva(usuario,pista);
        HashSet<Reserva> reservasHechas = listaReserva(usuario);

        if(reservasHechas.contains(reserva)){
            throw new PistaYaReservada();
        }else{
            reservasHechas.add(reserva);
            mapaReservas.put(usuario,reservasHechas);

        }
    }
    public static void addReserva() {



                Usuario u1 = new Usuario("Juan",1);
                Usuario u2 = new Usuario("Ana",2);
                Usuario u3 = new Usuario("Luis",3);
                Usuario u4 = new Usuario("Marta",4);
                Usuario u5 = new Usuario("Carlos",5);
                Usuario u6 = new Usuario("Lucia",6);
                Usuario u7 = new Usuario("Pedro",7);
                Usuario u8 = new Usuario("Sofia",8);
                Usuario u9 = new Usuario("Diego",9);
                Usuario u10 = new Usuario("Elena",10);

                mapaReservas.put(u1, new Reserva(u1, new Padel(1, "Si", "Cristal")));
                mapaReservas.put(u2, new Reserva(u2, new Tenis(2, "No", "Hierba")));
                mapaReservas.put(u3, new Reserva(u3, new Padel(3, "Si", "Muro")));
                mapaReservas.put(u4, new Reserva(u4, new Tenis(4, "No", "Tierra batida")));
                mapaReservas.put(u5, new Reserva(u5, new Padel(5, "Si", "Cristal")));
                mapaReservas.put(u6, new Reserva(u6, new Tenis(6, "No", "Cemento")));
                mapaReservas.put(u7, new Reserva(u7, new Padel(7, "Si", "Mixto")));
                mapaReservas.put(u8, new Reserva(u8, new Tenis(8, "No", "Hierba")));
                mapaReservas.put(u9, new Reserva(u9, new Padel(9, "Si", "Cristal")));
                mapaReservas.put(u10, new Reserva(u10, new Tenis(10, "No", "Tierra batida")));


    }
}
