import java.util.Scanner;

public class Agente extends Persona implements AccionesPoliciales{
    static Scanner sc = new Scanner(System.in);
    private int contador = 1;

    private int id;
    private int codigo_acceso;


    public Agente(String nombre, String poblacion, int codigo_acceso){
        super(nombre, poblacion);
        this.codigo_acceso = codigo_acceso;
        this.id = contador++;
        System.out.println("Agente " + nombre + " registrado. Tu ID es: " + getId());

    }
    public Agente(String nombre, String poblacion, int id, int codigo_acceso){
        super(nombre,poblacion);
        this.codigo_acceso = codigo_acceso;
        this.id  = id;
    }

    public boolean login(int id, int codigo){
        if(id == this.id && codigo == this.codigo_acceso){
            System.out.println("Bienvenido, " + getNombre());
            return  true;
        }else {
            System.out.println("Datos introducidos no coresponden a ninugn agente registrado. Intentalo de nuevo. ");
            return false;
        }
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCodigo_acceso() {
        return codigo_acceso;
    }

    public void setCodigo_acceso(int codigo_acceso) {
        this.codigo_acceso = codigo_acceso;
    }

    @Override
    public void mostrarTipoPersona() {
        System.out.println("Autoridad");
    }

    @Override
    public Ciudadano solicitarDatosCiudadano() {
        System.out.println("Introduce los datos del cidudadano a registrar");
        System.out.println("Nombre: ");
        String nombre = sc.nextLine();
        System.out.println("Poblacion: ");
        String poblacion = sc.nextLine();
        System.out.println("DNI: ");
        String dni = sc.nextLine();
        return new Ciudadano(nombre, poblacion, dni);
    }

    @Override
    public Expediente crearExpediente() {
        System.out.println("Creando expediente...");
        return new Expediente(solicitarDatosCiudadano(), EstadoTramite.INICIADO);
    }

    @Override
    public void siguienteEstado(Expediente expediente) {

    }

    @Override
    public void archivarExpediente(Expediente expediente) {
        if(!expediente.getEstado().equals(EstadoTramite.PAGADO)){
            throw new ExpedienteNoPagadoError();
        }
    }


}
