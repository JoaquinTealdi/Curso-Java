package POO.Triangulo_Isosceles;
import java.util.Scanner;

/*Diseñar un programa para trabajar con triángulos isósceles. Para ello defina los atributos necesarios que se requieren,
proporcione métodos de consulta, un método constructor e implemente métodos para calcular el perímetro y el área de un triángulo,
además implementar un método que a partir de un arreglo de triángulos devuelva el área del triángulo de mayor superficie.*/

public class Principal {

    public static Double mayorArea(TrianguloIsosceles triangulos[]){
        double area = triangulos[0].area();

        for(int i= 1; i < triangulos.length; i++){
            if(area < triangulos[i].area()){
                area = triangulos[i].area();
            }
        }
        return area;
    }



    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double perimetro, area, base, lado;
        int cantidadTriangulos;

        System.out.println("Ingrese la cantidad de triangulos");
        cantidadTriangulos = entrada.nextInt();
        TrianguloIsosceles triangulos [] = new TrianguloIsosceles[cantidadTriangulos];

        for(int i = 0; i < triangulos.length; i++){
            entrada.nextLine();
            System.out.println("Ingrese los datos del triangulo"+ (i+1)+ ": ");
            System.out.println("Ingrese el valor de la base:");
            base = entrada.nextInt();
            System.out.println("Ingrese el valor de los lados: ");
            lado = entrada.nextInt();
            triangulos[i] = new TrianguloIsosceles(base, lado);
            System.out.println("el perimetro es: "+ triangulos[i].perimetro());
            System.out.println("el area es: "+ triangulos[i].area() );
        }

        System.out.println("El mayor area de todos los triangulos es: ");
        mayorArea(triangulos);


    }
}
