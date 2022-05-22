package Operadores;

import java.util.Scanner;

public class Tarea4 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int alto, ancho, area;
        double perimetro;

        System.out.println("Proporciona el alto:");
        alto = entrada.nextInt();
        System.out.println("Proporciona el ancho:");
        ancho = entrada.nextInt();

        area = alto * ancho;
        perimetro = (alto + ancho) * 2;
        System.out.println("Area = " + area);
        System.out.println("Perimetro = " + perimetro);

    }
}
