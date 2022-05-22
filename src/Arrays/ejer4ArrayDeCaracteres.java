package Arrays;
import java.util.Scanner;
//Crea un array de caracteres que contenga de la ‘A’ a la ‘Z’ (solo las mayúsculas). Después, ve pidiendo posiciones del array por teclado y si
// la posicion es correcta, se añadira a una cadena que se mostrara al final, se dejará de insertar cuando se introduzca un -1.
//
//Por ejemplo, si escribo los siguientes numeros
//0 //Añadira la ‘A’
//5 //Añadira la ‘F’
//25 //Añadira la ‘Z’
//50 //Error, inserte otro numero
//-1 //fin
//
//Cadena resultante: AFZ
public class ejer4ArrayDeCaracteres {
    public static void main(String[] args) {
        boolean seguir = true;
        Scanner entrada = new Scanner(System.in);
        String [] caracteres = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        String [] cadenaResultante = new String[3];


        while (seguir == true){
            System.out.println("Ingrese una posicion para saber el contenido");
            int pos = entrada.nextInt();
            switch (pos){
                case 0:
                    cadenaResultante [0] = caracteres [pos];
                    break;
                case 5:
                    cadenaResultante [1] = caracteres [pos];
                    break;
                case 25:
                    cadenaResultante [2] = "Z";
                    break;
                case 50:
                    System.out.println("Error, inserte otro numero");
                    break;
                case -1:
                    break;
            }
            if (pos == -1)
                seguir = false;

        }
        System.out.println("La cadena resultante es : ");
        for (int i= 0; i< cadenaResultante.length; i++){
            System.out.println(cadenaResultante[i]);
        }

    }
}
