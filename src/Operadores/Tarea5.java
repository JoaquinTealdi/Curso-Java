package Operadores;

import java.util.Scanner;

public class Tarea5 {
    //realizar un codigo que pida ingresar dos números y devuelva el mayor de ellos
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1, num2, numMayor;

        System.out.println("Ingrese el primer numero:");
        num1 = input.nextInt();
        System.out.println("Ingrese el segundo numero:");
        num2 = input.nextInt();
        System.out.println("El número mayor es:");
        System.out.println((num1 > num2) ? num1 : num2);
        System.out.println();


    }
}
