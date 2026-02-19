package Enumeraciones;

public enum Semaforo {
    AMARILLO, ROJO, VERDE;

    public Semaforo siguiente(){
        switch (this){
            case AMARILLO:
                return ROJO;
            case ROJO:
                return VERDE;
            case VERDE:
                return AMARILLO;
            default:
                return null;
        }
    }
}
