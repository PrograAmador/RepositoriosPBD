package Excepciones;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public double ingresarSaldo(double cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad a ingresar no puede ser negativa.");
        }else if(cantidad > 3000) {
            throw new DepositoMaximoException();
        }
        saldo += cantidad;
        System.out.println("Dinero ingresado con exito. Saldo actual: " + saldo);
        return saldo;
    }
    public double sacarSaldo(double cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException("La cantidad a sacar no puede ser negativa.");
        }else if (cantidad > saldo) {
            throw new SaldoInsuficienteException();
        }else if (cantidad > 600) {
            throw new LimiteDiarioException();
        }
        saldo -= cantidad;
        System.out.println("Dinero retirado con exito. Saldo restante: " + saldo);
        return saldo;
    }

    public String consultarSaldo() {
        return "Saldo disponible: " + saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
