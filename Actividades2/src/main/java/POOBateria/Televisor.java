package POOBateria;

public class Televisor {
    private static final int DEF_CANAL = 1;
    private static final int DEL_VOLUMEN = 5;

    private int canal;
    private int volumen;

    public Televisor(int canal, int volumen) {
        this.canal = canal;
        this.volumen = volumen;
    }
    public int getCanal() {
        return canal;
    }
    public void setCanal(int ValorCanal) {
        this.canal = canal;
    }
    public int getVolumen() {
        return volumen;
    }
    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    public Televisor() {
        canal = DEF_CANAL;
        volumen = DEL_VOLUMEN;
    }
    public int Televisor(int ValorCanal){
        canal = ValorCanal;
        return canal;
    }
    public void subirCanal(){
        if (canal == 100){
            canal= 1;
        }else{
            canal = canal+1;
        }
        System.out.println("Canal: " + canal);
    }
    public void bajarCanal(){
        if (canal == 1){
            canal= 100;
        }else{
            canal = canal-1;
        }
        System.out.println("Canal: " + canal);
    }
    public void subirVolumen(){
        if (volumen < 100){
            volumen = volumen+1;
        }
        System.out.println("Volumen: " + volumen);
    }
    public void bajarVolumen(){
        if (volumen > 0){
            volumen = volumen-1;
        }
        System.out.println("Volumen: " + volumen);
    }

}
