package POO.Persona;

import java.io.LineNumberReader;
import java.math.BigInteger;
import java.util.Random;

public class Persona {
    private String nombre;
    private int edad = 0;
    private String DNI = "";
    private String sexo;
    private int peso;
    private float altura;

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = 0;
        this.altura = 0;
    }

    public Persona(String nombre, int edad, String sexo, int peso, float altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public int IMC(){
        int resultado = 0;

        double formula = (this.peso / (Math.pow(this.altura, 2)));
        if(formula < 20){
            resultado = -1;
        }else if((formula >= 20) && (formula <= 25)){
            resultado = 0;
        }else if(formula > 20){
            resultado = 1;
        }

        return resultado;
    }

    public boolean esMayorDeEdad(){
        boolean mayor;
        if(this.edad > 18){
            mayor = true;
        }else{
            mayor = false;
        }
        return mayor;
    }

    public void comprobarSexo(){
        if ((this.sexo.equalsIgnoreCase("H")) || (this.sexo.equalsIgnoreCase("M"))){
            System.out.println("El sexo es correcto");
        }else{
            System.out.println("El sexo era incorrecto, se pone por defecto H (Hombre)");
            this.sexo = "H";
        }

    }

    public void generaDNI(){
        int[] numeros = {1, 2, 0, 4, 3, 6, 7, 5, 8, 9};
        for (int i = 0; i < 8; i++){
            int x = (int) (Math.random()* numeros[i]);
            this.DNI += String.valueOf(x); //con "String.valueof" convierto de int a String
        }

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

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "nombre ='" + nombre + '\'' +
                ", edad=" + edad +
                ", DNI=" + DNI +
                ", sexo=" + sexo +
                ", peso=" + peso +
                ", altura=" + altura;
    }
}
