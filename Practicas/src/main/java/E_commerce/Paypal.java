package E_commerce;


import lombok.Getter;
import lombok.Setter;

/**
 * @see MetodoPago - La clase Paypal es otro metodo de pago mas que extiende de la clase abstracta MetodoPago
 */
@Setter
@Getter
public class Paypal extends MetodoPago{


    private String cuenta;
    private double saldo;

    public Paypal(String cuenta) {
        this.cuenta = cuenta;
        this.saldo = 23;
    }

    /**
     * En este metodo comprobamos que el e-mail tenga el formato correcto y que el saldo sea suficiente para el pago.
     * @param importe - Es un double que representa la cantidad de dinero que se va a pagar.
     * @return boolean - Devuelve true si la cuenta de PayPal es válida y tiene suficiente saldo para el pago, de lo contrario devuelve false.
     */

    public boolean validarPaypal(double importe){

        if(cuenta.matches( "^[a-zA-Z0-9._%+-]+@gmail\\.com$") && saldo >= importe){
            System.out.println("Cuenta de PayPal válida." );
            return true;
        }else {
            System.out.println("Cuenta de PayPal inválida.");
            return false;

        }
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con PayPal.");
    }

    @Override
    public String toString() {
        return "Paypal{" +
                "cuenta='" + cuenta + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
