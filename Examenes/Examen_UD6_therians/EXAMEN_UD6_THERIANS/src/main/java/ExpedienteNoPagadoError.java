public class ExpedienteNoPagadoError extends RuntimeException {
    public ExpedienteNoPagadoError (){
        super("El expediente qe se intenta archivar todavia no ha sido pagado");
    }
}
