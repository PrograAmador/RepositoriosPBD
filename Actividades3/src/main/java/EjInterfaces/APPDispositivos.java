package EjInterfaces;

import java.util.ArrayList;

public class APPDispositivos {
    public static void main(String[] args) {
        ArrayList<Dispositivo> dispositivos = new ArrayList<>();

        Televisor Samsung = new Televisor("Televisor Samsung");
        dispositivos.add(Samsung);
        ParlanteInteligente Echo = new ParlanteInteligente("Parlante Inteligente Echo");
        dispositivos.add(Echo);
        AireAcondicionado LG = new AireAcondicionado("Aire Acondicionado LG");
        dispositivos.add(LG);

        for (Dispositivo dispositivo : dispositivos) {
            dispositivo.encender();
            if (dispositivo instanceof ControlRemoto) {
                ((ControlRemoto) dispositivo).sincronizar();
            }

            dispositivo.mostrarEstado();
            dispositivo.apagar();

        }

        Dispositivo proyector = new Dispositivo("Proyector") {
            @Override
            public void encender() {
                if (!estado) {
                    System.out.println("Encendiendo proyector con ajuste automatico de brillo...");
                    estado = true;
                } else {
                    System.out.println("El proyector ya está encendido.");
                }
            }

        };
        proyector.encender();


        ControlRemoto controlUniversal = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando dispositivo con control remoto universal...");
            }
        };
        controlUniversal.sincronizar();

        Dispositivo HornoInteligente = new Dispositivo("Horno Inteligente") {
            @Override
            public void encender() {
                if (!estado) {
                    System.out.println("Calentando horno con ajuste automático de temperatura...");
                    estado = true;
                } else {
                    System.out.println("El horno inteligente ya está encendido.");
                }
            }
        };
        HornoInteligente.encender();

        dispositivos.add(HornoInteligente);
        if(proyector instanceof ControlRemoto){
            ((ControlRemoto) proyector).sincronizar();
        } else {
            System.out.println(proyector.getNombre() + " no es compatible con control remoto.");
        }


    }
}
