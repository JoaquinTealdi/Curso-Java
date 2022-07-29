package Arrays;

import java.util.Scanner;

public class ejer6LetraDni {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int resultado;
        int DNI;
        char letraDni[] = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};

        System.out.println("Ingrese su DNI para saber su letra correspondiente ");
        DNI = input.nextInt();

        resultado = DNI % 23;
        if((resultado >= 0) && (resultado <= 22)){
            System.out.println("La letra correspondiente es => " + letraDni[resultado]);
        }else{
            System.out.println("No corresponde a ninguna letra");
        }

    }
}
