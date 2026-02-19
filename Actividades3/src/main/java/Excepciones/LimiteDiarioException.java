package Excepciones;

public class LimiteDiarioException extends RuntimeException {
  public LimiteDiarioException() {

    super("Has superado el limite diario de 600 euros");
  }
}
