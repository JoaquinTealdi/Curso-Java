package Variables;

import java.util.Scanner;

public class tarea2 {
    public static void main(String[] args) {

        Scanner consola = new Scanner(System.in);


        System.out.println("Proporciona el nombre: ");
        String nombre = consola.nextLine();
        System.out.println("Proporciona el id: ");
        int id = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el precio: ");
        Double precio = Double.parseDouble(consola.nextLine());
        System.out.println("Proporciona el envio gratuito: ");
        Boolean envioGratuito = Boolean.parseBoolean(consola.nextLine());


        System.out.println(nombre + "#" + id);
        System.out.println("Precio: $"+ precio);
        System.out.println("Envio gratuito: " + envioGratuito);



    }

}
