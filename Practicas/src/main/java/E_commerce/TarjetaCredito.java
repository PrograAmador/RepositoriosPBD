//package E_commerce;
//
//
//import lombok.Getter;
//import lombok.Setter;
//
///**
// * @see MetodoPago - La clase TarjetaCredito representa un método de pago específico que hereda de la clase abstracta MetodoPago.
// *
// */
//@Setter
//@Getter
//public class TarjetaCredito extends MetodoPago{
//    static private final String[] tipos_validos = {"VISA", "MASTERCARD", "MAESTRO"};
//
//    private String nro_tarjeta;
//    private String tipo;
//
//    /**
//     *
//     * @param nro_tarjeta - Un string que representa el número de la tarjeta de crédito.
//     * @param tipo - Un string que representa el tipo de tarjeta de crédito (VISA, MASTERCARD, MAESTRO).
//     */
//    public TarjetaCredito(String nro_tarjeta, String tipo) {
//        this.nro_tarjeta = nro_tarjeta;
//        this.tipo = tipo;
//    }
//
//    @Override
//    public void procesarPago(double importe) {
//        System.out.println("Procesando pago de " + importe + "€ con tarjeta de crédito " + tipo);
//    }
//
//    /**
//     * Este método valida la tarjeta de crédito verificando que el número de tarjeta tenga 16 dígitos y que el tipo de tarjeta sea uno de los tipos válidos (VISA, MASTERCARD, MAESTRO).
//     * @return - Devuelve true si la tarjeta es válida, de lo contrario devuelve false.
//     */
//    public boolean validarTarjeta(){
//        System.out.println("Validando tarjeta...");
//
//        if(nro_tarjeta.length() == 16){
//            for (String tiposValido : tipos_validos) {
//                if (tipo.equalsIgnoreCase(tiposValido)) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//}
