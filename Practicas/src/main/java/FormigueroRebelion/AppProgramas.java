package FormigueroRebelion;

public class AppProgramas {
    public static void main(String[] args) {

        //creamos una cadena de tv
        Cadena antena3 = new Cadena("Antena 3");
        Empleado Director1 = new Empleado("D1","Director1","director",null);
        Empleado Tecnico1 = new Empleado("T1","Tecnico1","técnico",Director1);
        System.out.println(antena3);
        //creamos un programa
        Programa el_hormiguero = new Programa("El Hormiguero",antena3,Director1);
        System.out.println(el_hormiguero);
        System.out.println(antena3);
        //insertamos empleados en el programa
        el_hormiguero.insertarEmpleado(Tecnico1);
        System.out.println(el_hormiguero);
        //ver empleados del programa
        System.out.println(el_hormiguero.getListaEmpleados());
        //insertamos invitados en el programa
        Invitado Aitana = new Invitado("Aitana","cantante",1);
        el_hormiguero.insertarInvitado(Aitana);
        //ver invitados del programa
        System.out.println(el_hormiguero.getListaInvitados());

    }
}
