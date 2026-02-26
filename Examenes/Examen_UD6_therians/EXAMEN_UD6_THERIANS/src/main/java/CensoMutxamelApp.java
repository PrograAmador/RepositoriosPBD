import java.util.ArrayList;
import java.util.Scanner;

public class CensoMutxamelApp {
    static Scanner sc = new Scanner(System.in);

    public static ArrayList<Agente> agentesPoliciaRegistrados = new ArrayList<>();
    public static ArrayList<Expediente> listaExpedientes = new ArrayList<>();

    public void main(String[] args) {
        agentesPoliciaRegistrados.add(new Agente("Luisa", "Mutxamel", 2334));
        agentesPoliciaRegistrados.add(new Agente("Raul", "Mutxamel", 1234));

        System.out.println("=== BIENVENIDO A LA APP DEL CENSO DE BESTIAS DE MUTXAMEL ===");

        int id = menuApp();
        int codigo = menuApp2();

        Agente agente = new Agente("Raul", "Mutxamel", codigo, id);

        while(!agente.login(id, codigo)){
            agente.login(menuApp(), menuApp2());
        }

        Expediente expediente = agente.crearExpediente();

        listaExpedientes.add(expediente);

        expediente.insertarSeres();






    }

    public static int menuApp(){
        System.out.println("Introduce tu ID: ");
        int Id = sc.nextInt();
        sc.nextLine(); //limpiar Buffer
        return Id;
    }
    public static int menuApp2(){
        System.out.println("Introduce tu codigo de acceso: ");
        int codigo = sc.nextInt();
        sc.nextLine(); //limpiar buffer
        return codigo;
    }

    public static void verExpedientes(){

        for(Expediente expediente : listaExpedientes){
            System.out.println(expediente);
        }
    }


}
