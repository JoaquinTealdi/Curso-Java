package Arrays;

import java.util.Scanner;

//Crea un array de números donde le indicamos por teclado el tamaño del array, rellenaremos el array con números aleatorios entre 0 y 9
// al final muestra por pantalla el valor de cada posición y la suma de todos los valores.
// Haz un método para rellenar el array (que tenga como parámetros los números entre los que tenga que generar),
// otro para mostrar el contenido y la suma del array y un método privado para generar número aleatorio (lo puedes usar para otros ejercicios).
public class ejer2NumerosAleatorios {
    public static void main(String[] args) {
        Scanner cantElementos = new Scanner(System.in);
        System.out.println("Introduce el tamaño");
        int arreglo [] = new int[cantElementos.nextInt()];


        rellenarArreglo(arreglo, 0,9);
        mostrarArreglo(arreglo);




    }


    public static void rellenarArreglo(int lista[], int a, int b){
        for(int i= 0; i < lista.length; i++){
            lista[i]=((int)Math.floor(Math.random()*(a-b)+b));
        }
    } // llena el array con numeros aleatorios comprendidos entre a y b


    public static void mostrarArreglo(int lista[]){
        for(int i= 0; i < lista.length; i++){
            System.out.println("La posicion "+ (i+1) +" contiene el valor => "+ lista[i]);
        }
    }
}
