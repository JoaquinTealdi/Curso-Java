package POO.Persona;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //se piden datos para crear persona
        System.out.println("Crearemos a la persona 1");
        System.out.println("Ingrese el nombre");
        String nombre = entrada.next();
        System.out.println("Ingrese la edad");
        int edad = entrada.nextInt();
        System.out.println("Ingrese el sexo: H para Hombre y M para mujer");
        String sexo = entrada.next();
        System.out.println("Ingrese el peso (en kilogramos)");
        int peso = entrada.nextInt();
        System.out.println("Ingrese la altura (en metros)");
        float altura = entrada.nextFloat();

        //se cre la persona y se asigna el DNI
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        persona1.generaDNI();
        persona1.comprobarSexo();

        System.out.println("Crearemos a la persona 2");
        System.out.println("Ingrese el nombre");
        nombre = entrada.next();
        System.out.println("Ingrese la edad");
        edad = entrada.nextInt();
        System.out.println("Ingrese el sexo: H para Hombre y M para mujer");
        sexo = entrada.next();
        entrada.close();

        Persona persona2 = new Persona(nombre, edad, sexo);
        persona2.generaDNI();
        persona2.comprobarSexo();

        Persona persona3 = new Persona();
        persona3.generaDNI();

        pesoIdeal(persona1);
        pesoIdeal(persona2);
        pesoIdeal(persona3);

        System.out.println(persona1.getNombre() + "¿es mayor de edad? = " + persona1.esMayorDeEdad());
        System.out.println(persona2.getNombre() + "¿es mayor de edad? = " + persona2.esMayorDeEdad());
        System.out.println(persona3.getNombre() + "¿es mayor de edad? = " + persona3.esMayorDeEdad());

        System.out.println("<< Los datos de las personas son >>");
        System.out.println(persona1.toString());
        System.out.println(persona2.toString());
        System.out.println(persona3.toString());






    }


    public static void pesoIdeal(Persona persona){
        int valor = persona.IMC();
        if (valor == -1)
            System.out.println( persona.getNombre() +" esta en su peso ideal");
        else if (valor == 0)
            System.out.println(persona.getNombre() + " esta por debajo de su peso ideal");
        else
            System.out.println(persona.getNombre() + " tiene sobrepeso");
    }
}
