package Variables;

import java.util.Scanner; //librería requerida para utilizar la clase scanner

public class scanner_class {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in); //definimos la clase scanner

        System.out.print("Ingrese un nombre: ");
        var nombre= entrada.nextLine(); //lo que escribamos lo va a guardar en la variable

        //cuando ya no necesitemos que se ingresen datos cerramos la clase Scanner para q no esté ocupando proceso aldope
        entrada.close();

        System.out.println("Hola " + nombre); // mostramos por pantalla el contenido de la variable

    }
}
