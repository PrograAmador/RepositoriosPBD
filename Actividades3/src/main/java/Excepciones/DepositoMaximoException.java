package Excepciones;

public class DepositoMaximoException extends RuntimeException {
    public DepositoMaximoException() {

        super("No puedes depositar mas de 3000 euros a la vez.");
    }
}
