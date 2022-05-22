package Arrays;
import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;
//Crea un array de números y otro de String de 10 posiciones donde insertaremos notas entre 0 y 10 (debemos controlar que inserte una nota valida),
// pudiendo ser decimal la nota en el array de números, en el de Strings se insertaran los nombres de los alumnos.
//
//Después, crearemos un array de String donde insertaremos el resultado de la nota con palabras.
//
//    Si la nota esta entre 0 y 4,99 , sera un suspenso
//    Si esta entre 5 y 6,99 , sera un bien.
//    Si esta entre 7 y 8,99 sera un notable.
//    Si esta entre 9 y 10 sera un sobresaliente.
//
//Muestra por pantalla, el alumno su nota y su resultado en palabras. Crea los métodos que creas conveniente.

public class ejer5notasYalumnos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float notas [] = new float[10];
        String nombres [] = new String[10];
        String resultado [] = new String[10];

        for(int i=0; i<10;i++){
            System.out.println("Ingrese la nota del alumno");
            notas [i]= entrada.nextFloat();
            //notas [i] = nota;

            if(notas [i] > 0 && notas [i] <= 4.99){
                resultado[i] = "suspenso";
            }else if(notas [i] >= 5 && notas [i] <= 6.99){
                resultado[i] = "bien";
            }else if(notas [i] >= 7 && notas [i] <= 8.99){
                resultado[i] = "notable";
            }else if(notas [i] >= 9 && notas [i] <= 10) {
                resultado[i] = "sobresaliente";
            }
            System.out.println("ingrese el nombre del alumno");
            nombres [i] = entrada.next();

        }
        mostrarDatos(nombres, notas, resultado);


    }

    public static void mostrarDatos(String[] lista, float[] lista1, String[] lista2){
        for (int i = 0; i < lista.length; i++){
            System.out.println(lista[i]+" "+lista1[i]+" "+lista2[i]);
        }
    }
}
