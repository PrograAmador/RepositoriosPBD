package E_commerce;


import lombok.Getter;
import lombok.Setter;

import java.util.Random;

/**
 * @see MetodoPago - La clase Bizum representa un metodo de pago específico que hereda de la clase abstracta MetodoPago.
 */
@Setter
@Getter
public class Bizum extends MetodoPago{
    static Random random = new Random();

    private String telefono;
    private int pin;

    /**
     * @param telefono - Un string que representa el número de teléfono asociado a la cuenta de Bizum.
     */
    public Bizum(String telefono) {
        this.telefono = telefono;
        this.pin = generarPIN();
    }

    /**
     * Este metodo genera un número aleatorio de 6 dígitos que representa el PIN de seguridad para la cuenta de Bizum. Este PIN se utiliza para validar la identidad del usuario al realizar un pago con Bizum.
     * @return pin - Devuelve un número entero de 6 dígitos entre 100000 y 999999.
     */
    public int generarPIN(){ // Genera un número aleatorio de 6 dígitos
        int pin = random.nextInt(900000) + 100000;
        System.out.println("[CHIVATO PIN] " + pin);
        return pin;
    }

    /**
     * Este metodo valida el PIN ingresado por el usuario comparándolo con el PIN generado para la cuenta de Bizum.
     * @param pinIngresado - Un número entero que representa el PIN ingresado por el usuario para validar su identidad al realizar un pago con Bizum.
     * @return boolean - devuelve true si el PIN ingresado coincide con el PIN generado para la cuenta de Bizum, lo que indica que el usuario ha sido autenticado correctamente. Si el PIN ingresado no coincide, devuelve false.
     **/
    public boolean validarBizum(int pinIngresado){
        if(this.pin == pinIngresado){
            System.out.println("PIN correcto. Bizum válido.");
            return true;
        }else {
            System.out.println("PIN incorrecto. Bizum inválido.");
            return false;
        }

    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe + "€ con Bizum.");
    }

    @Override
    public String toString() {
        return "Bizum{" +
                "telefono='" + telefono + '\'' +
                ", pin=" + pin +
                '}';
    }
}
