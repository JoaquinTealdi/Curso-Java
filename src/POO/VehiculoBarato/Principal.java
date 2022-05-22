package POO.VehiculoBarato;

import java.util.Scanner;

public class Principal {

    public static int indiceAutoMBarato(Vehiculo coches[]){
        float precio;
        int indice = 0;

        //almaceno el precio del primer coche del array
        precio = coches[0].getPrecio();
        //analizo a partir del 2do coche del array ya que el primero lo tengo almacenado en "precio"
        for(int i=1; i < coches.length; i++){
            //analiza los precios y almacena en "precio" el menor
            if(coches[i].getPrecio() < precio){
                precio = coches[i].getPrecio();
                indice = i;
            }
        }
        return indice;
    }




    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String marca, modelo;
        float precio;
        int numeroVehiculos;
        int indiceBarato;

        System.out.println("Ingrese la cantidad de vehiculos: ");
        numeroVehiculos = entrada.nextInt();

        //creamos los objetos para los coches
        Vehiculo coches []= new Vehiculo[numeroVehiculos];

        for (int i=0; i < coches.length; i++){
            entrada.nextLine();
            System.out.println("Digite las caracteristicas del auto "+ (i+1)+":");
            System.out.println("Ingrese la marca del auto: ");
            marca = entrada.nextLine();
            System.out.println("Ingrese el modelo del auto: ");
            modelo = entrada.nextLine();
            System.out.println("Ingrese el precio del auto: ");
            precio = entrada.nextFloat();

            coches[i] = new Vehiculo(marca,modelo, precio);
        }

        indiceBarato = indiceAutoMBarato(coches);
        System.out.println("\nLas caracteristicas del auto mas barato");
        System.out.println(coches[indiceBarato].mostrarDatos());





    }
}
