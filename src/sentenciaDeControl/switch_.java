package sentenciaDeControl;

import java.util.Scanner;

public class switch_ {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        var estacion = "estacion desconocida";
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
        int mes = Integer.parseInt(entrada.nextLine());

        switch (mes){
            case 1: case 2: case 12:
                estacion = "Verano";
                break;
            case 3: case 4: case 5:
                estacion = "Otonio";
                break;
            case 6: case 7: case 8:
                estacion = "Invierno";
                break;
            case 9: case 10: case 11:
                estacion = "Primavera";
                break;
            default:
                estacion = "Estacion Desconocida";
                break;
        }
        System.out.println("estacion = " + estacion);
    }
}
