package FormigueroRebelion;

public class Empleado {
    static final String[] CARGOS = {"director", "técnico", "presentador", "colaborador"};

    private String id;
    private String nombre;
    private String cargo;
    private Empleado director;

    public Empleado(String id, String nombre, String cargo, Empleado director) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.director = director;
    }
    public void comprobarCargo(Empleado director) {
        if(this.cargo.equals("director")) {
            this.director = director;
        }else{
            this.director = null;
        }
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
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
    public void setCargo(String cargo) {
        for(String c : CARGOS) {
            if(c.equals(cargo)) {
                this.cargo = cargo;
                return;
            }else{
                this.cargo = "pte";
            }
        }
    }
    public Empleado getDirector() {
        return director;
    }
    public void setDirector(Empleado director) {
        this.director = director;
    }

}
