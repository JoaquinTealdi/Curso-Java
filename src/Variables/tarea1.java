package Variables;

import java.util.Scanner;

public class tarea1 {
    public static void main(String[] args) {
        //se solicita incluir la siguiente información acerca de un libro
        //    titulo
        //    autor
        //
        //Debes imprimir la información en el siguiente formato:
        //
        //    Proporciona el titulo:
        //    Proporciona el autor:
        //    <titulo> fue escrito por <autor>

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el titulo del libro");
        String titulo = entrada.nextLine();
        System.out.println("Ingrese el autor del libro ingresado anteriormente");
        String autor = entrada.nextLine();

        System.out.println(titulo + " fué escrito por " + autor);
    }
}
