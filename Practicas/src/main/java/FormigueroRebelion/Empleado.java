package FormigueroRebelion;

public class Empleado {
    static final String[] CARGOS = {"director", "técnico", "presentador", "colaborador"};
    static int contadorId = 1;

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String nombre, String cargo, Empleado director) {
        this.id = setId();
        this.nombre = nombre;
        this.cargo = setCargo(cargo);
        this.director = setDirector(director);
    }

    public String getId() {
        return id;
    }
    public String setId() {
        return this.id = "EP0" + contadorId++;

    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCargo() {
        return cargo;
    }
    public String setCargo(String cargo) {

        for(String c : CARGOS) {
            if(c.equals(cargo)) {
                return cargo;
            }
        }
        return "pte";
    }
    public Empleado getDirector() {
        return director;
    }
    public Empleado setDirector(Empleado director) {
        if(this.cargo.equals("director")) {
            return null;
        }else{
            return director;
        }
    }

}
