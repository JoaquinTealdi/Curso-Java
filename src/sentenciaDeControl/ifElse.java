package sentenciaDeControl;

import java.util.Scanner;

public class ifElse {
    public static void main(String[] args) {
        //pedir al usuario que ingrese el mes y devolver a que estación del año pertenece
        Scanner entrada = new Scanner(System.in);
        String estacion;
        System.out.println("1-Enero");
        System.out.println("2-Febrero");
        System.out.println("3-Marzo");
        System.out.println("4-Abril");
        System.out.println("5-Mayo");
        System.out.println("6-Junio");
        System.out.println("7-Julio");
        System.out.println("8-Agosto");
        System.out.println("9-Septiembre");
        System.out.println("10-Octubre");
        System.out.println("11-Noviembre");
        System.out.println("12-Diciembre");
        System.out.println("Ingrese el mes utilizando el numero que corresponda: ");
        int opcion = Integer.parseInt(entrada.nextLine());

        if(opcion == 1 || opcion == 2 || opcion == 12)
            estacion = "Verano";
        else if(opcion == 3 || opcion == 4 || opcion == 5)
            estacion = "Otonio";
        else if(opcion == 6 || opcion == 7 || opcion == 8)
            estacion = "Invierno";
        else if(opcion == 9 || opcion == 10 || opcion == 11)
            estacion = "Primavera";
        else
            estacion = "El número ingresado no corresponde a ningun mes";

        System.out.println("El mes ingresado corresponde a la estación: " + estacion);

    }
}
