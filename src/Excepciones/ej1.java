package Excepciones;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        try{
            boolean bandera = true;
            if(bandera == true){
                System.out.println("Ingrese el primer valor");
                var a = input.nextInt();

                System.out.println("Ingrese el segundo valor");
                var b = input.nextInt();

                var resultado = a / b;
                System.out.println("El resultado de la division es: " + resultado);
            }

        }catch(Exception e){
            System.out.println("¡Error no se puede dividir entre 0!" + e);

        }finally {
            System.out.println("Operacion finalizada");
        }

    }


}
