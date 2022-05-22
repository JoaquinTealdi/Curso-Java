package sentenciaDeControl;

import java.util.Scanner;

public class tarea6 {
    public static void main(String[] args) {
        /*El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:

            El usuario proporcionará un valor entre 0 y 10.

            Si está entre 9 y 10: imprimir una A

            Si está entre 8 y menor a 9: imprimir una B

            Si está entre 7 y menor a 8: imprimir una C

            Si está entre 6 y menor a 7: imprimir una D

            Si está entre 0 y menor a 6: imprimir una F

            cualquier otro valor debe imprimir: Valor desconocido*/

        Scanner entrada = new Scanner(System.in);
        String nota;
        System.out.println("Proporciona un valor entre 0 y 10");
        double valor = Double.parseDouble(entrada.nextLine());

        if (valor >= 9 && valor <= 10) {
            nota = "A";
            System.out.println(nota);
        } else if (valor >= 8 && valor < 9) {
            nota = "B";
            System.out.println(nota);
        } else if (valor >= 7 && valor < 8) {
            nota = "C";
            System.out.println(nota);
        } else if (valor >= 6 && valor < 7) {
            nota = "D";
            System.out.println(nota);
        } else if (valor > 0 && valor < 6) {
            nota = "F";
            System.out.println(nota);
        } else {
            nota = "Valor desconocido";
            System.out.println(nota);
        }


    }
}
