

import java.util.Scanner;

/**
 * La clase Tienda es la clase principal que gestiona el proceso de pago en la aplicación de comercio electrónico.
 */
public class Tienda {
    static Scanner sc = new Scanner(System.in);

    /**
     * Este metodo inicia el proceso de pago solicitando al usuario que seleccione un método de pago (Bizum, PayPal o Tarjeta de Crédito).
     */
    public static void iniciarPago(){
        System.out.println("Que metodo de pago desea utilizar? [Bizum, Paypal, Tarjeta]");
        String opcion = sc.nextLine().toLowerCase();
        switch (opcion){
            case "tarjeta":
                System.out.println("Introduce los datos de tu tarjeta:");
                String nroTarjeta = sc.next();
                System.out.println("Selecciona el tipo de tarjeta (VISA, MASTERCARD, MAESTRO):");
                String tipo = sc.next();
                TarjetaCredito tarjeta = new TarjetaCredito(nroTarjeta, tipo);
                if (tarjeta.validarTarjeta()){
                    System.out.println("Ingrese el importe a pagar: ");
                    double importeTarjeta = sc.nextDouble();
                    realizarPago(tarjeta, importeTarjeta);
                }else {
                    System.out.println("Los datos de tu tarjeta no son correctos.");

                }
                break;
            case "paypal":
                System.out.println("Ingrese su cuenta de PayPal:");
                String cuenta = sc.next();
                Paypal paypal = new Paypal(cuenta);
                System.out.println("Ingrese el importe a pagar:");
                double importePaypal = sc.nextDouble();
                if(paypal.validarPaypal(importePaypal)){
                    realizarPago(paypal, importePaypal);
                }else {
                    System.out.println("Los datos de Paypal no son correctos o no tienes suficiente saldo.");
                }
                break;
            case "bizum":
                System.out.println("Ingrese su número de teléfono para Bizum:");
                String telefono = sc.next();
                Bizum bizum = new Bizum(telefono);
                System.out.println("Introduce tu PIN: ");
                int pinIngresado = sc.nextInt();
                if(bizum.validarBizum(pinIngresado)){
                    System.out.println("Ingrese el importe a pagar:");
                    double importeBizum = sc.nextDouble();
                    realizarPago(bizum, importeBizum);
                }else {
                    System.out.println("Los datos de tu Bizum no son correctos.");
                }
                break;
            default:
                System.out.println("El metodo de pago no existe.");
                break;

        }

    }

    /**
     * Este metodo recibe el metodo de pago seleccionado por el usuario y el importe a pagar, se lo pasa a cada metodo de pago para que procese el pago y luego muestra un mensaje de confirmación al usuario.
     * @param metodo - Es un objeto de tipo MetodoPago que representa el método de pago seleccionado por el usuario (Bizum, PayPal o Tarjeta de Crédito).
     * @param importe - Es un double que representa la cantidad de dinero que se va a pagar utilizando el método de pago seleccionado por el usuario.
     */
    public static void realizarPago(MetodoPago metodo, double importe){
        if(metodo == null){
            System.out.println("No se ha seleccionado un método de pago válido. No se puede procesar el pago.");
            return;
        }
        metodo.procesarPago(importe);
        System.out.println("Pago realizado con éxito. Muchas gracias");
    }


}
