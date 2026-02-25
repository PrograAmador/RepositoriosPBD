public enum TipoSer {

    THERIAN(0.0),
    DOMESTICO(10.0),
    EXOTICO(50.0);

    public final double tasas;

    TipoSer( double tasas){
        this.tasas = tasas;
    }
}
