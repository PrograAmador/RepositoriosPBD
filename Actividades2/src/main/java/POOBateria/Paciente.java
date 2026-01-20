package POOBateria;

import java.util.Random;

public class Paciente {

    static Random random = new Random();

    private static final char SEXO_DEFECTO = 'X';
    private static final int DEF_MAYOR_EDAD = 18;
    private static final int SOBREPESO = 1;
    private static final int PESO_IDEAL= 0;
    private static final int INFRAPESO = -1;
    private String nombre;
    private int edad;
    private String DNI;
    private char sexo;
    private double peso;
    private int altura;

    public Paciente(String nombre, int edad, char sexo, double peso, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        DNI = generarDNI();
        this.sexo = comprobarSexo(sexo);
        this.peso = peso;
        this.altura = altura;
    }
    public Paciente(){
        this(null,0,SEXO_DEFECTO,0,0);
    }


    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int getAltura() {
        return altura;
    }
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public String getDNI() {
        return DNI;
    }
    public char getSexo() {
        return sexo;
    }

    public String generarDNI(){

        String dni = "";
        for(int i=0; i<8; i++){
            int numero = random.nextInt(10);
            dni = dni + numero;
        }
        int dniNum = Integer.parseInt(dni);
        char letraDNI = "TRWAGMYFPDXBNJZSQVHLCKE".charAt(dniNum % 23);
        return dni + letraDNI;
    }
    public int calcularIMC(){

        double imc = peso / Math.pow((double) altura /100, 2);
        if(imc < 20){
            return INFRAPESO; // Bajo peso
        } else if(imc >= 20 && imc <= 25){
            return PESO_IDEAL; // Peso normal
        } else {
            return SOBREPESO; // Sobrepeso
        }
    }
    public boolean esMayorDeEdad(){
        return edad >= DEF_MAYOR_EDAD;
    }
    private char comprobarSexo(char sexo){
        if(sexo == 'H' || sexo == 'M'){
            return sexo;
        }else{
            return SEXO_DEFECTO;
        }
    }
    @Override
    public String toString(){
    return "Nombre: " + nombre + "\n Edad: " + edad + "\n DNI: "+ DNI + "\n Sexo: " + sexo +"\n Peso: " + peso +
                "\n Altura: " +altura;
    }


}
