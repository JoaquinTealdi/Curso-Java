package Arrays;

import javax.swing.*;
import java.util.Scanner;

public class arrayss {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        //defino
        int[] edades = new int[3];
        //definir y llenar(otra forma)
        int[] edades1 = {3,12,6,7};

        //asigno un valor
        edades[0] = 19;
        edades[1] = 50;
        //asigno un valor por consola
        System.out.println("ingrese la segunda edad: ");
        edades[2] = entrada.nextInt();

        //llenar el arreglo
        int cantElementos;
        cantElementos = Integer.parseInt(JOptionPane.showInputDialog("digite la cantidad de elementos del arreglo"));
        int[] edades3 = new int[cantElementos];
        for (int i= 0; i < cantElementos; i++) {
            System.out.println("ingrese el valor "+ (i+1));
            edades3[i] = entrada.nextInt();
        }

        //mostrar el arreglo
        System.out.println("Los elementos del arreglo son");
        for (int i= 0; i < cantElementos; i++)
            System.out.println("edad posición " + i + "\tvalor: " + edades3[i]);

    }
}
