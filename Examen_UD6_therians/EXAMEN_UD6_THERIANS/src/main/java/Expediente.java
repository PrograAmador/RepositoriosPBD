import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Expediente {
    static Scanner sc = new Scanner(System.in);

    private Ciudadano ciudadano;
    private ArrayList<TipoSer> listaSeres = new ArrayList<>();
    private EstadoTramite estado;

    public Expediente(Ciudadano ciudadano, EstadoTramite estado){
        this.ciudadano = ciudadano;
        this.estado = estado;
    }

    public void insertarSeres(){
        System.out.println("Inserta el tipo de ser que quieres censar [THERIAN, DOMESTICO, EXOTICO] ");
        TipoSer ser = TipoSer.valueOf(sc.nextLine());

        if(ser.equals(TipoSer.THERIAN)||ser.equals(TipoSer.DOMESTICO)||ser.equals(TipoSer.EXOTICO)){
            listaSeres.add(ser);
            verTasas(ser);
        }else{
            System.out.println("Tipo no contemplado");

        }
    }

    public void verTasas(TipoSer ser){
        System.out.println("Importe tasas actual: " + ser);
    }


    public Ciudadano getCiudadano() {
        return ciudadano;
    }

    public void setCiudadano(Ciudadano ciudadano) {
        this.ciudadano = ciudadano;
    }

    public ArrayList<TipoSer> getListaSeres() {
        return listaSeres;
    }

    public void setListaSeres(ArrayList<TipoSer> listaSeres) {
        this.listaSeres = listaSeres;
    }

    public EstadoTramite getEstado() {
        return estado;
    }

    public void setEstado(EstadoTramite estado) {
        this.estado = estado;
    }



}
