package POO.Atletas;
import java.util.Scanner;

/*Construir un programa para una competencia de atletismo, el programa debe gestionar una serie de atletas caracterizados por
su número de atleta, nombre y tiempo de carrera, al final el programa debe mostrar los datos del atleta ganaror de la carrera*/

public class Principal {
    //funcion para saber el indice del atleta con menor tiempo
    public static int menorTiempo(Atletas competidores[]){
        float tiempo;
        int indice = 0;

        //almacenamos el tiempo del primer competidor para comparar con el de los demás y obtener el menor
        tiempo = competidores[0].getTiempoDeCarrera();

        //recorremos el array de competidores
        for(int i=1; i < competidores.length; i++){
            if(competidores[i].getTiempoDeCarrera() < tiempo){
                tiempo = competidores[i].getTiempoDeCarrera();
                indice = i;
            }
        }
        return indice;
    }

    //metodo main
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String numeroDeAtleta, nombre;
        float tiempoDeCarrera;
        int cantidadAtletas;
        int menorTiempo;

        System.out.println("Ingrese la cantidad de Atletas que competiran: ");
        cantidadAtletas = entrada.nextInt();
        //creamos un array donde almacenaremos la cantidad de Atletas y su caracteristicas
        Atletas competidores [] = new Atletas[cantidadAtletas];

        for(int i=0;i < competidores.length; i++){
            entrada.nextLine();
            //solicitamos los datos
            System.out.println("Atleta número" + (i+1)+ ":");
            System.out.println("Ingrese el número del atleta: ");
            numeroDeAtleta = entrada.nextLine();
            System.out.println("Ingrese el nombre del atleta:");
            nombre = entrada.nextLine();
            System.out.println("Ingrese el tiempo que hizo el atleta en la carrera:");
            tiempoDeCarrera = entrada.nextFloat();

            //cargamos los atletas en el array de competidores
            competidores[i] = new Atletas(numeroDeAtleta, nombre, tiempoDeCarrera);
        }

        menorTiempo = menorTiempo(competidores);
        System.out.println("Los datos del Atleta ganador de la carrera son:");
        System.out.println(competidores[menorTiempo].mostrarDatos());



    }
}
