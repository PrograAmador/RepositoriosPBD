package POOBateria;

public class Persona {
    private static final int SOBREPESO = 1;
    private static final int PESO_IDEAL= 0;
    private static final int INFRAPESO = -1;
    private String nombre;
    private int edad;
    private char sexo;
    private double peso;
    private double altura;

    public Persona(String nombre, int edad, char sexo, double peso, double altura){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura =  altura;
    }
    public Persona(String nombre, int edad, char sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    public Persona(double peso, double altura){
        setPeso(peso);
        setAltura(altura);
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    public double getPeso() {
        return peso;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
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
    public boolean esMayorDeEdad() {
        return edad >= 18;
    }
    public static void mostrarResultados(Persona p) {
        int imc = p.calcularIMC();

        if (imc == -1) {
            System.out.println("Está por debajo de su peso ideal");
        } else if (imc == 0) {
            System.out.println("Está en su peso ideal");
        } else {
            System.out.println("Tiene sobrepeso");
        }

        if (p.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        System.out.println(p);
        System.out.println("---------------------");
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "\nEdad: " + edad +
                "\nSexo: " + sexo +
                "\nPeso: " + peso +
                "\nAltura: " + altura;
    }

}
