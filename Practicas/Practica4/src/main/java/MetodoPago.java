
/**
 * Esta clase abstracta existe para definir un contrato común para todos los métodos de pago.
 * Cada método de pago (Bizum, PayPal, Tarjeta de Crédito) implementará esta clase y proporcionará su propia lógica para procesar el pago.
 */
public abstract class MetodoPago {
    /**
     *
     * @param importe - Es un double que pedimos al usuario y representa la cantidad de dinero que se va a pagar.
     */
    public abstract void procesarPago(double importe);
}
