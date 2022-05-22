package Arrays;
import java.util.Scanner;

//Crea un array de 10 posiciones de números con valores pedidos por teclado. Muestra por consola el indice y el valor al que corresponde.
// Haz dos métodos, uno para rellenar valores y otro para mostrar.

public class ejer_10posiciones_x_teclado {
    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);
        int arreglo [] = new int [10];

        //pido valores e ingreso
        for(int i = 0; i < arreglo.length;i++){
            System.out.println("Ingrese el valor "+ (i+1) + ":");
            arreglo[i] = valores.nextInt();
        }

        //muestro valores
        for(int i = 0; i < arreglo.length;i++){
            System.out.println("La posicion "+ (i+1) + " contiene el valor => "+arreglo[i]);
        }

    }
}
