package Arrays;
import java.util.Scanner;
//Crea un array de números de 100 posiciones, que contendrá los números del 1 al 100. Obtén la suma de todos ellos y la media.
public class ejer3array100Posiciones {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo");
        int tamaño = entrada.nextInt();
        int arreglo100 [] = new int[tamaño];
        llenarArreglo(arreglo100);
        sumaDeValores(arreglo100);


    }

    //funciones
    public static void llenarArreglo( int lista[]) {
        for (int i = 0; i < lista.length; i++) {
            int contador = i+1;
            lista[i] = contador;
        }
    }

    public static void sumaDeValores(int lista[]){
        int suma = 0;
        for (int i = 0; i < lista.length; i++) {
            suma = suma + lista[i];
        }
        System.out.println("La suma de los elementos es: "+ suma);
        System.out.println("La media es: "+ suma/2);
    }
}
